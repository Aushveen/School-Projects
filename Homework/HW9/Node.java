/** Question 7
 * a
 * b
 * d
 * is outputted
 */

public class Node {
    public Node(String name) { this.name = name; }
    public Node left;
    public Node right;
    public String name;

// should output a, b, and d
public static void main(String[] args){
    Node a = new Node("a");
    Node b = new Node("b");
    Node c = new Node("c");
    a.left = b;
    a.right = c;
    b.left = c;
    a.right.name = "d";
    System.out.println(a.name);
    System.out.println(a.left.name);
    System.out.println(b.left.name);
}
}