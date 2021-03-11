/* Class containing left and right child of current
   node and key value*/
class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

// A Java program to introduce Binary Tree
class BinaryTree
{
    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }

    BinaryTree()
    {
        root = null;
    }

    public static String represent(Node node) {

        if (node.right == null && node.left == null) {
            return String.valueOf(node.key);
        }
        if (node.right == null) {
            return node.key + "(" + represent(node.left) + ")";
        }
        if (node.left == null) {
            return node.key + "(" + represent(node.right) + ")";
        }

        return "(" + node.key +  "(" + represent(node.left) + ")(" + represent(node.right) + ")" + ")";
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        /*create root*/
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);


        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        System.out.println(represent(tree.root));


    }
}