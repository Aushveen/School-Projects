/**
 A binary tree in which each node has two children.
 */
public class BinaryTree
{
    private Node root;
    public static int total = 0;
    public static int count = 0;

    public static void main(String[] args){
       // BinaryTree questionTree = new BinaryTree(1, new BinaryTree(2), new BinaryTree(5));
        BinaryTree questionTree = new BinaryTree(2, new BinaryTree(3, new BinaryTree(10), new BinaryTree(20)), new BinaryTree(10, new BinaryTree( 7), new BinaryTree( 11)));
        BinaryTree.Searcher searcher1 = new BinaryTree.Searcher();
        questionTree.postorder(questionTree,searcher1);
        System.out.println();
        questionTree.preorder(questionTree, searcher1);
        System.out.println();
        questionTree.inorder(questionTree, searcher1);
        System.out.println();
        System.out.println(questionTree.total); // sum of nodes
        System.out.println(questionTree.count); // count of nodes
        System.out.println((float)questionTree.total / (float)questionTree.count); // avg of node

    }

    /**
     Constructs an empty tree.
     */
    public BinaryTree() { root = null; }

    /**
     Constructs a tree with one node and no children.
     @param rootData the data for the root
     */
    public BinaryTree(Object rootData)
    {
        root = new Node();
        root.data = rootData;
        root.left = null;
        root.right = null;
    }

    /**
     Constructs a binary tree.
     @param rootData the data for the root
     @param left the left subtree
     @param right the right subtree
     */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
    {
        root = new Node();
        root.data = rootData;
        root.left = left.root;
        root.right = right.root;
    }

    static class Node
    {
        public Object data;
        public Node left;
        public Node right;
    }

    /**
     Returns the height of the subtree whose root is the given node.
     @param n a node or null
     @return the height of the subtree, or 0 if n is null
     */
    private static int height(Node n)
    {
        if (n == null) { return 0; }
        else { return 1 + Math.max(height(n.left), height(n.right)); }
    }

    /**
     Returns the height of this tree.
     @return the height
     */
    public int height() { return height(root); }

    /**
     Checks whether this tree is empty.
     @return true if this tree is empty
     */
    public boolean isEmpty() { return root == null; }

    /**
     Gets the data at the root of this tree.
     @return the root data
     */
    public Object data() { return root.data; }

    /**
     Gets the left subtree of this tree.
     @return the left child of the root
     */
    public BinaryTree left()
    {
        BinaryTree result = new BinaryTree();
        result.root = root.left;
        return result;
    }

    /**
     Gets the right subtree of this tree.
     @return the right child of the root
     */
    public BinaryTree right()
    {
        BinaryTree result = new BinaryTree();
        result.root = root.right;
        return result;
    }

    public interface Visitor{
        boolean visit(Object data);
    }

    public static void preorder(BinaryTree n, Visitor v) {

        if (n.root == null) { return; }
        v.visit(n.root.data);
        preorder(n.left(), v);
        preorder(n.right(), v);

    }
    public static void inorder(BinaryTree n, Visitor v) {

        if (n.root == null) { return; }
        inorder(n.left(), v);
        v.visit(n.root.data);
        inorder(n.right(), v);
    }
    public static void postorder(BinaryTree n, Visitor v){
        if(n.root == null)
            return;
        postorder(n.left(),v);
        postorder(n.right(),v);
        v.visit(n.root.data);
    }
    static class Searcher implements Visitor
    {
        public boolean visit(Object data)
        {
            System.out.print(data + " ");
            total += (int)data;
            count++;
            return true;
        }
    }
}