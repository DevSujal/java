import java.util.LinkedList;
import java.util.Queue;

public class first {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public String toString() {
            return this.data + "";
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static node creatTree(int arr[]) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }

            node newnode = new node(arr[idx]);

            newnode.left = creatTree(arr);
            newnode.right = creatTree(arr);
            return newnode;
        }

        // node insert(node root, node newnode) {
        // if(root == null) {
        // return newnode;
        // }
        // else if() {
        // root.left = insert(root.left, newnode);
        // }
        // else
        // root.right = insert(root.right, newnode);

        // return root;
        // }

        void preorderTraversal(node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        void postorderTraversal(node root) {
            if (root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        void inorderTraversal(node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        int height(node root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left) + 1;
            int right = height(root.right) + 1;
            return left > right ? left : right;
        }

        // o(n^2) time complexity ->
        int diameter(node root) {
            if (root == null) {
                return 0;
            }

            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam1, Math.max(diam2, diam3));
        }

        int countHalf(node root) {
            if (root == null || root.left == null && root.right == null) {
                return 0;
            }

            int left = countHalf(root.left);
            int right = countHalf(root.right);

            if (root.left == null || root.right == null)
                return left + right + 1;

            return left + right;
        }
        int countInternalNodes(node root) {
            if (root == null || root.left == null && root.right == null) {
                return 0;
            }

            int left = countInternalNodes(root.left);
            int right = countInternalNodes(root.right);

                return left + right + 1;
        }

        static class TreeInfo {
            int ht, diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }

            public String toString() {
                return this.diam + "";
            }
        }

        // o(n) time complexity ->
        TreeInfo diameter2(node root) {
            if (root == null)
                return new TreeInfo(0, 0);
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            return new TreeInfo(Math.max(left.ht, right.ht) + 1,
                    Math.max(Math.max(left.diam, right.diam), left.ht + right.ht + 1));
        }

        void levelOrderTraversal(node root) {

            if (root == null) {
                return;
            }
            Queue<node> myQueue = new LinkedList<>();

            myQueue.add(root);
            myQueue.add(null);

            while (!myQueue.isEmpty()) {
                node currnode = myQueue.remove();

                if (currnode == null) {
                    System.out.println();

                    if (myQueue.isEmpty()) {
                        break;
                    } else {
                        myQueue.add(null); // add a NULL element to the queue for next level
                    }
                } else {
                    System.out.print(currnode.data + " ");

                    if (currnode.left != null) {
                        myQueue.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        myQueue.add(currnode.right);
                    }
                }
            }
        }

        int countNodes(node root) {
            if (root == null) {
                return 0;
            }

            // if(root.left == null && root.right == null){
            // return 0;
            // }

            int left = countNodes(root.left);
            int right = countNodes(root.right);

            return left + right + 1;
        }

        int sumofnodes(node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumofnodes(root.left);
            int rightSum = sumofnodes(root.right);

            return leftSum + rightSum + root.data;
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        node root = BinaryTree.creatTree(nodes);

        // tree.preorderTraversal(root);
        // System.out.println();
        // tree.inorderTraversal(root);
        // System.out.println();
        // tree.postorderTraversal(root);
        // System.out.println();
        tree.levelOrderTraversal(root);
        System.out.println(tree.height(root));

        System.out.println(tree.countNodes(root));
        System.out.println(tree.sumofnodes(root));
        tree.preorderTraversal(root);
        System.out.println();
        System.out.println(tree.diameter(root));
        System.out.println(tree.diameter2(root));
        System.out.println(tree.countHalf(root));
        System.out.println(tree.countInternalNodes(root));
    }
}
