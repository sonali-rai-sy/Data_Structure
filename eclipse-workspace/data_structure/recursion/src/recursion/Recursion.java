package recursion;

public class Recursion {

    static class node {

        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }

        public static int countSingleChild(node root) {

            if (root == null) {
                return 0;
            }


          
            

            return 1
                    + countSingleChild(root.left)
                    + countSingleChild(root.right);
        }
    }

    public static void main(String[] args) {

        node root = new node(1);

        root.left = new node(2);
        root.left.left = new node(3);
        root.left.right = new node(4);

        System.out.println("Single Child Nodes = "
                + node.countSingleChild(root));
    }
}