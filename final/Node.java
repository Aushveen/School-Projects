import java.util.*;

public class Node {
    int num;
    Node left, right;
    String color;

    public Node(int num){
        this(num, null , null, "red");
    }
    public Node(int num, Node left, Node right){
        this(num, left, right, "black");
    }
    private Node(int num, Node left, Node right, String color){
        this.num = num; this.left = left; this.right = right; this.color = color;
    }
    public void insert(int num){
        if (this.num == num) return;
        else if(this.num > num)
            if (this.left == null)
                this.left = new Node(num);
            else
                this.left.insert(num);
        else
            if (this.right == null)
                this.right = new Node(num);
            else
                this.right.insert(num);
    }
    public boolean westViolation(Node a){
        if(a.color.equals("black") && a.left != null && a.left.color.equals("red") && a.left.right != null &&
                a.left.right.color.equals("red"))
            return true;
        return false;
    }
    public boolean eastViolation(Node a){
        if(a.color.equals("black") && a.right != null && a.right.color.equals("red") && a.right.left != null
                && a.right.left.color.equals("red"))
            return true;
        return false;
    }
    public boolean northViolation(Node a){
        if(a.color.equals("black") && a.left != null && a.left.color.equals("red") && a.left.left != null
                && a.left.left.color.equals("red"))
            return true;
        return false;
    }
    public boolean southViolation(Node a){
        if(a.color.equals("black") && a.right != null && a.right.color.equals("red") && a.right.right != null
                && a.right.right.color.equals("red"))
            return true;
        return false;
    }
    public static Node balance(Node m){
        if(m.left != null)
            m.left = Node.balance(m.left);
        if(m.right!= null)
            m.right = Node.balance(m.right);
        if(m.westViolation(m)){
            int x = m.left.num, y = m.left.right.num, z = m.num;
            Node a = m.left.left, b = m.left.right.left, c = m.left.right.right, d = m.right;
            return new Node(y,new Node(x, a, b), new Node(z,c,d), "red");
        } else if(m.eastViolation(m)) {
            int x = m.num, y = m.right.left.num, z = m.right.num;
            Node a = m.left, b = m.right.left.left, c = m.right.left.right, d = m.right.right;
            return new Node(y,new Node(x, a, b), new Node(z,c,d), "red");
        } else if(m.northViolation(m)){
            int x = m.left.left.num, y = m.left.num, z = m.num;
            Node a = m.left.left.left, b = m.left.left.right, c = m.left.right, d = m.right;
            return new Node(y,new Node(x, a, b), new Node(z,c,d), "red");
        } else if(m.southViolation(m)){
            int x = m.num, y = m.right.num, z = m.right.right.num;
            Node a = m.left, c = m.right.right.left, b = m.right.left, d= m.right.right.right;
            return new Node(y,new Node(x, a, b), new Node(z,c,d), "red");
        }else
            System.out.println(m.num + "... this is good");
        return m;
    }
    public static Node insert(Node a, int num){
        a.insert(num);
        a = Node.balance(a);
        a.color = "black";
        Utilities.display(a);
        System.out.println("After inserting " + num);
        return a;
    }
    public static boolean find(Node a, int key){
        while (a != null){
            if(a.num == key)
                return true;
            else if(a.num < key) {
                a = a.right;
                if (a == null)
                    return false;
            }else{
                a = a.left;
                if (a == null)
                    return false;
                }
        }
        return false;
    }
    public static void main(String[] args){
        Node a = new Node(5);
        a.color = "black";
        Utilities.display(a);
        a = Node.insert(a, 2);
        a = Node.insert(a, 10);
        a = Node.insert(a, 3);
        System.out.println(find(a,3));
    }

}

