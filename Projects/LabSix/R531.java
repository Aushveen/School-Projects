public class R531 {
    public static void main(String[] args){
        // part a
        Boolean b = true;
        System.out.println(b);
        System.out.println(b==true);

        //part b
        System.out.println(!b);
        System.out.println(b==false);

        //part c
        b = true;
        System.out.println(!b);
        System.out.println(b != true);
        b = false;
        System.out.println(!b);
        System.out.println(b != true);

        //part d
        b = true;
        System.out.println(b);
        System.out.println(b != false);
        b = false;
        System.out.println(b);
        System.out.println(b != false);

    }

}
