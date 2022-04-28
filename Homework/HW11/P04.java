import java.util.Arrays;
import java.util.stream.IntStream;

public class P04 {
    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] squarePalindromes = IntStream.iterate(0, i -> i + 1)
                .map(i -> i * i)
                .filter(P04::isPalindrome)
                .limit(n)
                .toArray();

        System.out.println(Arrays.toString(squarePalindromes));

        int[] primePalindromes = (new PrimeGenerator()).stream()
                .filter(P04::isPalindrome)
                .limit(n)
                .toArray();

        System.out.println(Arrays.toString(primePalindromes));
    }
}