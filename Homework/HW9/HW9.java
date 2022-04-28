import java.util.*;

public class HW9 {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,5,10};
        System.out.println(findMaximum(arr));
        char[] arr1 = new char[]{'a','b','c','d','e','f'};
        System.out.println(reverse(arr1,0,4));
        /* Question 8 -- the likely time complexity of an algorithm whose runtime with
         * respect to input size given by the following graph is 3. O(n^2)
         *
         * Question 9 -- f(n) = 3n^2 + n + 10, and the time complexity is O(n^2) . . . Why?
         * It is because the power of the function is 2, meaning that it should be n^2
         * 3n^2 + n + 10 --> 3n^2 + n --> 3n^2 --> n^2
         *
         * Q10 -- the relationship between the # of nodes in a perfect binary tree and the
         * height of the tree is log(n + 1) – 1 = Θ(ln(n))
         *
         * Q11 ??? (IDK) -- Suppose A = {1, 2, 3, 4}. Which of the following relations on A is reflexive? Which is
         * symmetric? Which is transitive?
         * Reflexive -- {(1, 1),(2, 2),(3, 3),(4, 4)}
         * Transitive -- {(1, 1),(1, 2),(2, 1)(2, 2),(2, 3),(3, 2)(3, 3),(3, 4)(4, 4), }
         * Symmetric -- {(1, 2),(1, 3),(1, 4)(2, 3),(2, 4),(3, 4)}
         */

    }
    //Q1
    static int findMaximum(int[] A){
        int max = A[0];
        for(int i = 1; i < A.length; i++)
            if (A[i] > max)
                max = A[i];
        return max;
    }
    //Q2
    static char[] reverse(char[] s, int beg, int end){
        return reverseHelper(s, beg, end);
    }

    static char[] reverseHelper(char[] s, int loc, int target){
        if (loc == target) return s;
        char a = s[loc];
        char b = s[target - 1];
        s[loc] = b;
        s[target - 1] = a;
        return reverseHelper(s, loc + 1, target - 1);
    }

    /**Q3 -- the method does not work because it i is assigned values, not indexes
     * so the method outputs an error
     */
    static void f(List<Integer> list) {
        for (Integer i : list)
            if (i % 2 == 0)
                list.remove(i);
    }


}
