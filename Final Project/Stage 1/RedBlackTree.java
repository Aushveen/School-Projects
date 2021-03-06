import java.util.ArrayList;
import java.util.List;

/**
 This class implements a red-black tree whose
 nodes hold objects that implement the Comparable
 interface.
 */
public class RedBlackTree
{
    Node root; // Package access, for testing

    static final int BLACK = 1;
    static final int RED = 0;
    private static final int NEGATIVE_RED = -1;
    private static final int DOUBLE_BLACK = 2;

    /**
     Constructs an empty tree.
     */
    public RedBlackTree()
    {
        root = null;
    }

    /**
     Inserts a new node into the tree.
     @param obj the object to insert
     */
    public void add(Comparable obj)
    {
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (root == null) { root = newNode; }
        else { root.addNode(newNode); }
        fixAfterAdd(newNode);
    }

    /**
     Tries to find an object in the tree.
     @param obj the object to find
     @return true if the object is contained in the tree
     */
    public boolean find(Comparable obj)
    {
        Node current = root;
        while (current != null)
        {
            int d = current.data.compareTo(obj);
            if (d == 0) { return true; }
            else if (d > 0) { current = current.left; }
            else { current = current.right; }
        }
        return false;
    }


    /**
     Yields the contents of the tree in sorted order
     @return all data items traversed in inorder, with a space after each item
     */
    public String toString()
    {
        return toString(root);
    }

    /**
     Yields the contents of the subtree with the given root in sorted order
     @param parent the root of the subtree
     @return all data items traversed in inorder, with a space after each item
     */
    private static String toString(Node parent)
    {
        if (parent == null) { return ""; }
        return toString(parent.left) + parent.data + " " + toString(parent.right);
    }

    /**
     A node of a red-black tree stores a data item and references
     of the child nodes to the left and to the right. The color
     is the "cost" of passing the node; 1 for black or 0 for red.
     Temporarily, it may be set to 2 or -1.
     */
    static class Node
    {
        public void display() {
            Displaux displaux = this.displaux();
            for (String line : displaux.lines)
                System.out.println( line );
        }
        public Displaux displaux() {
            if (this.right == null && this.left == null) {
                String line = this.toString();
                int width = line.length();
                int height = 1;
                int middle = width / 2;
                ArrayList<String> lines = new ArrayList<String>();
                lines.add(line);
                return new Displaux( lines, width, height, middle );
            }
            if (this.right == null) {
                Displaux result = this.left.displaux();
                ArrayList<String> lines = result.lines;
                int n = result.width;
                int p = result.height;
                int x = result.middle;
                String s = this.toString();
                int u = s.length();
                String firstLine = f(x + 1, ' ') + f(n - x - 1, '_') + s;
                String secondLine = f(x, ' ') + "/" + f(n - x - 1 + u, ' ');
                ArrayList<String> shiftedLines = new ArrayList<String>();
                for (String line : lines)
                    shiftedLines.add(line + f(u, ' '));
                shiftedLines.add(0, secondLine);
                shiftedLines.add(0, firstLine);
                return new Displaux(shiftedLines, n + u, p + 2, n + u / 2);
            }
            // Only right child.
            if (this.left == null) {
                Displaux result = this.right.displaux();
                ArrayList<String> lines = result.lines;
                int n = result.width;
                int p = result.height;
                int x = result.middle;
                String s = this.toString();
                int u = s.length();
                String firstLine = s + f(x, '_') + f(n - x, ' ');
                String secondLine = f(u + x, ' ') + "\\" + f(n - x - 1, ' ');
                ArrayList<String> shiftedLines = new ArrayList<String>();
                for (String line : lines)
                    shiftedLines.add(f(u, ' ') + line);
                shiftedLines.add(0, secondLine);
                shiftedLines.add(0, firstLine);
                return new Displaux(shiftedLines, n + u, p + 2, u / 2);
            }
            // Two children.
            Displaux result = this.left.displaux();
            ArrayList<String> left = result.lines;
            int n = result.width;
            int p = result.height;
            int x = result.middle;
            result = this.right.displaux();
            ArrayList<String> right = result.lines;
            int m = result.width;
            int q = result.height;
            int y = result.middle;
            String s = this.toString();
            int u = s.length();

            String firstLine = f(x + 1, ' ') + f(n - x - 1, '_') + s + f(y, '_') + f(m - y, ' ');
            String secondLine = f(x, ' ') + "/" + f(n - x - 1 + u + y, ' ') + "\\" + f(m - y - 1, ' ');

            if (p < q) {
                for (int i = 0; i < q - p; i++)
                    left.add(f(n, ' '));
            } else if (q < p) {
                for (int i = 0; i < p - q; i++)
                    right.add(f(m, ' '));
            }

            ArrayList<String> lines = new ArrayList<String>();
            for (int count = 0; count < Math.min(left.size(), right.size()); count++)
                lines.add( left.get(count) + f(u, ' ') + right.get(count) );
            lines.add(0, secondLine);
            lines.add(0, firstLine);
            return new Displaux(lines, n + m + u, Math.max(p, q) + 2, n + u / 2);
        }

        public String f(int length, char c) {
            return new String(new char[length]).replace('\0', c);
        }

        public ArrayList<String> g(int length, String s) {
            ArrayList<String> result = new ArrayList<String>();
            for (int i = 0; i < length; i++) {
                result.add(s);
            }
            return result;
        }

        public String toString() {
            return (this.color == BLACK) ? (" " + this.data + " ") : ("[" + this.data + "]");
        }

        public Comparable data; // this is anything
        public Node left;
        public Node right;
        public Node parent; // wow!?
        public int color;

        /**
         Constructs a red node with no data.
         */
        public Node() {}

        /**
         Sets the left child and updates its parent reference.
         @param child the new left child
         */
        public void setLeftChild(Node child)
        {
            left = child;
            if (child != null) { child.parent = this; }
        }

        /**
         Sets the right child and updates its parent reference.
         @param child the new right child
         */
        public void setRightChild(Node child)
        {
            right = child;
            if (child != null) { child.parent = this; }
        }

        /**
         Inserts a new node as a descendant of this node.
         @param newNode the node to insert
         */
        public void addNode(Node newNode)
        {
            int comp = newNode.data.compareTo(data);
            if (comp < 0)
            {
                if (left == null)
                {
                    left = newNode;
                    left.parent = this;
                }
                else { left.addNode(newNode); }
            }
            else if (comp > 0)
            {
                if (right == null)
                {
                    right = newNode;
                    right.parent = this;
                }
                else { right.addNode(newNode); }
            }
        }
    }

    /**
     Updates the parent's and replacement node's links when this node is replaced.
     Also updates the root reference if it is replaced.
     @param toBeReplaced the node that is to be replaced
     @param replacement the node that replaces that node
     */
    private void replaceWith(Node toBeReplaced, Node replacement)
    {
        if (toBeReplaced.parent == null)
        {
            replacement.parent = null;
            root = replacement;
        }
        else if (toBeReplaced == toBeReplaced.parent.left)
        {
            toBeReplaced.parent.setLeftChild(replacement);
        }
        else
        {
            toBeReplaced.parent.setRightChild(replacement);
        }
    }

    /**
     Restores the tree to a red-black tree after a node has been added.
     @param newNode the node that has been added
     */
    private void fixAfterAdd(Node newNode)
    {
        if (newNode.parent == null)
        {
            newNode.color = BLACK;
        }
        else
        {
            newNode.color = RED;
            if (newNode.parent.color == RED) { fixDoubleRed(newNode); }
        }
    }



    /**
     Fixes a "double red" violation.
     @param child the child with a red parent
     */
    private void fixDoubleRed(Node child)
    {
        Node parent = child.parent;
        Node grandParent = parent.parent;
        if (grandParent == null) { parent.color = BLACK; return; }
        Node n1, n2, n3, t1, t2, t3, t4;
        if (parent == grandParent.left)
        {
            n3 = grandParent; t4 = grandParent.right;
            if (child == parent.left)
            {
                n1 = child; n2 = parent;
                t1 = child.left; t2 = child.right; t3 = parent.right;
            }
            else
            {
                n1 = parent; n2 = child;
                t1 = parent.left; t2 = child.left; t3 = child.right;
            }
        }
        else
        {
            n1 = grandParent; t1 = grandParent.left;
            if (child == parent.left)
            {
                n2 = child; n3 = parent;
                t2 = child.left; t3 = child.right; t4 = parent.right;
            }
            else
            {
                n2 = parent; n3 = child;
                t2 = parent.left; t3 = child.left; t4 = child.right;
            }
        }

        replaceWith(grandParent, n2);
        n1.setLeftChild(t1);
        n1.setRightChild(t2);
        n2.setLeftChild(n1);
        n2.setRightChild(n3);
        n3.setLeftChild(t3);
        n3.setRightChild(t4);
        n2.color = grandParent.color - 1;
        n1.color = BLACK;
        n3.color = BLACK;

        if (n2 == root)
        {
            root.color = BLACK;
        }
        else if (n2.color == RED && n2.parent.color == RED)
        {
            fixDoubleRed(n2);
        }
    }


    public static void main(String[] args)
    {
        RedBlackTree t = new RedBlackTree();
        System.out.println("From an empty tree we add: 10");
        t.add(10); t.root.display();
        t.add(18); System.out.println("Now we add: 18"); t.root.display();
        t.add( 7); System.out.println("Now we add:  7"); t.root.display();
        t.add(15); System.out.println("Now we add: 15"); t.root.display();
        t.add(16); System.out.println("Now we add: 16"); t.root.display();
        t.add(30); System.out.println("Now we add: 30"); t.root.display();
        t.add(25); System.out.println("Now we add: 25"); t.root.display();
    }

}