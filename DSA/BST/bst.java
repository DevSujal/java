import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public String toString() {
            return data + "";
        }
    }

    public Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root + " ");
    }

    void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root + " ");
        inorderTraversal(root.right);
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            } else {
                System.out.print(curr + " ");

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public int countHalf(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        int left = countHalf(root.left);
        int right = countHalf(root.right);

        if (root.left == null || root.right == null){
            return left + right + 1;
        }
        return left + right;
    }

    public int countInternals(Node root) {
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }

        return countInternals(root.left) + countInternals(root.right) + 1;
    }

    public Node search(Node root, int data) {
        if (root == null) {
            System.out.println("tree is empty");
            return root;
        }
        if (root.data == data) {
            return root;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public void printRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printRange(root.left, x, y);
            System.out.print(root + " ");
            printRange(root.right, x, y);
        } else if (root.data < x) {
            printRange(root.right, x, y);
        } else {
            printRange(root.left, x, y);
        }
    }

    public Node delNode(Node root, int elem) {

        if (root == null) {
            return root;
        }
        if (root.data < elem) {
            root.right = delNode(root.right, elem);
        } else if (root.data > elem) {
            root.left = delNode(root.left, elem);
        } else {
            // case 1 -> leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 -> jiska ek hi node ho
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // case 3 -> both childs are there
            Node inorderSuccesser = inorderSuccessor(root.right);
            root.data = inorderSuccesser.data;
            delNode(root.right, inorderSuccesser.data);
        }
        return root;
    }

    public Node inorderSuccessor(Node root) {
        if (root == null || root.left == null) {
            return root;
        }

        return inorderSuccessor(root.left);
    }

    public void rootToLeaf(Node root, ArrayList<Node> path) {
        if (root == null) {
            return;
        }
        path.add(root);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    private void printPath(ArrayList<Node> path) {
        Iterator<Node> itr = path.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " -> ");
        }
        System.out.println(null + "");
    }

    public static void main(String[] args) {
        bst obj = new bst();
        Node root = null;
        int arr[] = new int[] { 5, 1, 2, 3, 4, 6};
        for (int i : arr) {
            root = obj.insertNode(root, i);
        }

        // obj.inorderTraversal(root);
        // System.out.println();
        // obj.preorderTraversal(root);
        // System.out.println();
        // obj.postorderTraversal(root);
        // System.out.println();
        // obj.levelOrderTraversal(root);
        System.out.println(obj.countHalf(root));
        // System.out.println(obj.countInternals(root) - 1);

        // System.out.println(obj.search(root, 5));
        // obj.printRange(root, 2, 6);
        // System.out.println();
        // obj.rootToLeaf(root, new ArrayList<>());
        // obj.delNode(root, 6);
        // System.out.println(" kjkljkdfj");
        // obj.rootToLeaf(root, new ArrayList<>());
    }
}
