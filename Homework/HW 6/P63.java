import java.util.Scanner;
import java.math.BigInteger;
public class P63 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        System.out.println( fun(n) );
    }
    public static BigInteger fun (int index) {
        if (index == 0) return new BigInteger("1");
        else if (index == 1) return new BigInteger("1") ;
        return funHelper(1, index,new BigInteger("1"), new BigInteger("1"));
    }
    public static BigInteger funHelper(int location,
                                       int target,
                                       BigInteger a,
                                       BigInteger b) {
        if (location == target) return b;
        else {
            return funHelper(location + 1, target, b, a.add(b));
        }
    }
}