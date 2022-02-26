public class R530 {
    static boolean b = false;
    static int x = 0;
    public static void main(String[] args){
        System.out.println(a());
        System.out.println(b());
        System.out.println(c());
        System.out.println(d());
        System.out.println(e());
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());


    }

    public static boolean a(){
      return b && x == 0; //false
    }
    public static boolean b(){
        return b || x == 0; //true
    }
    public static boolean c(){
        return !b && x == 0;
    }
    public static boolean d(){
        return !b || x == 0;
    }
    public static boolean e(){
        return b && x != 0;
    }
    public static boolean f(){
        return b || x != 0;
    }
    public static boolean g(){
        return !b && x != 0;
    }
    public static boolean h(){
        return !b || x != 0;
    }
}
