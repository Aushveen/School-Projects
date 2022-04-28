import java.util.*;
import java.util.function.*;

public class P02 {
    public static <T> List<T> filter(List<T> values, Predicate<? super T> p) {
        List<T> retval = new ArrayList<T>();
        for (T val : values) {
            if (p.test(val)) {
                retval.add(val);
            }
        }

        return retval;
    }

    public static <T, R> List<R> map(List<T> values, Function<T, R> f) {
        List<R> retval = new ArrayList<R>();
        for (T val : values) {
            retval.add(f.apply(val));
        }

        return retval;
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("splorble");
        test.add("blungusfungus");
        test.add("i am so tired right now");
        test.add("sdjlkg");

        System.out.println(filter(test, x -> x.length() >= 10));
        System.out.println(map(test, x -> x + " splorgus"));
    }
}
