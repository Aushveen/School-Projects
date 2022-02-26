public class BugTester {
    public static void main(String[] args){
        Bug bugger = new Bug(10);
        bugger.move();
        bugger.turn();
        bugger.move();
        bugger.move();
        System.out.println("The expected position is: 9");
        System.out.println("The actual position is : " + bugger.getPosition());
    }
}
