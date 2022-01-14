import java.math.*;


public class Lab01 {
    public static void main(String[] args){
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        BigDecimal c = new BigDecimal("3");
        BigDecimal d = new BigDecimal("4");
        BigDecimal e = new BigDecimal("5");

        System.out.println("3 * (1 + 2) = " + c.multiply(a.add(b)));
        System.out.println("1 + 2 = " + a.add(b));
        System.out.println("2 * 3 = " + b.multiply(c));
        System.out.println("(1 + (2 + (3 + 4))) = " + a.add(b.add(c.add(d))));
        System.out.println("1 + 2 + 3 + 4 = " + a.add(b).add(c).add(d));
        System.out.println("2 * 3 + 4 * 5 = " + b.multiply(c).add(d.multiply(e)));

    }

}
