package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // jaise sequence me bhara jata hai
        // root sabse pahle aata hai
        public void preorder(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // root bich me aayega
        public void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // root last me aayega
        public void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            if (root == null) {
                System.out.println("Tree is empty");
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        int sumOfKthNodes(Node root) {
            if (root == null) {
                System.out.println("Tree is empty");
                return 0;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                    }
                } else {
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftcount = countNodes(root.left);
            int rightcount = countNodes(root.right);

            return leftcount + rightcount + 1;
        }

        int findHeight(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);
            return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }

        int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftsum = sumOfNodes(root.left);
            int rightsum = sumOfNodes(root.right);

            return leftsum + rightsum + root.data;
        }

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = findHeight(root.left) + findHeight(root.right) + 1;

            return (diam1 > diam2 ? (diam1 > diam3 ? diam1 : diam3) : (diam2 > diam3 ? diam2 : diam3));
        }

        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public TreeInfo diameterOn(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameterOn(root.left);
            TreeInfo right = diameterOn(root.right);
            int myHeight = (left.ht > right.ht ? left.ht : right.ht) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int myDiam = Math.max(Math.max(diam1, diam2), diam3);
            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }

        public static void main(String[] args) {
            int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(root.data);
            tree.levelOrder(root);
            System.out.println(tree.diameterOn(root).diam);
        }
    }
}