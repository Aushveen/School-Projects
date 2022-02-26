public class R632 {
    public static void main(String[] args){
        int travelNum = (int) (1 + Math.random() * 15);
        if(travelNum >= 1 && travelNum <= 10)
            System.out.println("California");
        else if(travelNum > 10 && travelNum <= 13)
            System.out.println("Nevada");
        else
            System.out.println("Utah");
    }
}
