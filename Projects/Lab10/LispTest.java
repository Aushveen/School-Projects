import java.util.List;

public class LispTest {
    public static void main(String[] args){
        LispList testList = LispList.NIL.cons("C").cons("B").cons("A");
        System.out.println("Expected result is A B C");
        System.out.println(testList);
        LispList testList2 = LispList.NIL;
        System.out.println(testList2);
        System.out.println("Length test: expected 3");
        System.out.println(testList.length());
        System.out.println("Length should be 0");
        System.out.println(testList2.length());
        LispList list1 = LispList.NIL.cons(4).cons(3).cons(2).cons(1);
        LispList list2 = LispList.NIL.cons(6).cons(5);
        System.out.println(list1.merge(list2));
        System.out.println(list2.merge(list1));
        System.out.println(testList.merge(testList2));
        System.out.println(testList2.merge(testList));
        System.out.println(testList.contains("B"));
        System.out.println(testList.contains("F"));

    }
}
