public class CounterTest {
    public static void main (String[] args){
        Counter a = new Counter();
        a.click();
        System.out.println("value is: " + a.getValue());
        a.click();
        System.out.println("value is: " + a.getValue());
        a.click();
        System.out.println("value is: " + a.getValue());
        a.reset();
        System.out.println("value is: " + a.getValue());

    }
}
