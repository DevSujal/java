// note ->
// BST always inherit all the properties of Tress

// a -> left subtree nodes < Root
// b -> right subtree nodes > Root 
// c -> left & right sutrees are also BST with no duplicates

// imp -> inorder traversal of BST gives a sorted sequence

// inorder successor -> left most node in right subtree
// inorder successor always has 0 or 1 child

import java.util.*;

public class BinarySearchTrees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node insert(Node root, int data) { // Time Complexity -> O(H) => H = height
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inroder(Node root) {
        if (root == null) {
            return;
        }
        inroder(root.left);
        System.out.print(root.data + " ");
        inroder(root.right);
    }

    void search(Node root, int element, int count) { // Time Complexity -> O(H) => H = height
        if (root == null) {
            System.out.println(element + " not found in the BST");
            return;
        }
        if (element == root.data) {
            System.out.println(root.data + " in place " + count);
            return;
        } else if (element < root.data) {
            search(root.left, element, count + 1);
        } else {
            search(root.right, element, count + 1);
        }
    }

    void printRange(Node root, int x, int y) { // Time Complexity -> O(H) => H = height
        if (root == null) {
            // System.out.println("not found in the BST");
            return;
        }
        if (root.data >= x && root.data <= y) {
            printRange(root.left, x, y);
            System.out.print(root.data + " ");
            printRange(root.right, x, y);
        } else if (root.data > y) {
            printRange(root.left, x, y);
        } else {
            printRange(root.right, x, y);
        }
    }

    public Node delete(Node root, int element) {

        if (root == null) {
            return root;
        }

        if (element < root.data) {
            root.left = delete(root.left, element);
        } else if (element > root.data) {
            root.right = delete(root.right, element);
        } else {
            // root.data == element

            // case 1 => jab vo ek leaf(No child) node ho to ham vainSuccessore ke
            // vainSuccessore use delete kar denge

            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 -> only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 -> both the child are present so we have to search for inorder
            // successor
            Node inSuccessor = inorderSuccessor(root.right);
            root.data = inSuccessor.data;
            delete(root.right, inSuccessor.data);
        }
        return root;
    }

    void printPath(ArrayList<Integer> path) {
        Iterator<Integer> itr = path.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " -> ");
        }
        System.out.println("null");
    }

    public void rootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        // leaf node
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public Node inorderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        // int data[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        BinarySearchTrees obj = new BinarySearchTrees();
        Node root = null;

        obj.delete(root, 9);
        // for (int i : data) {
        //     root = obj.insert(root, i);
        // }
        // obj.inroder(root);
        // System.out.println();
        // for (int i : data) {
        //     obj.search(root, i, 1);
        // }
        // obj.search(root, 10, 0);
        // obj.delete(root, 4);
        // obj.inroder(root);
        // obj.delete(root, 11);
        // obj.inroder(root);
        // System.out.println();
        // obj.printRange(root, 3, 12);
        // obj.rootToLeaf(root, new ArrayList<>());
    }
}