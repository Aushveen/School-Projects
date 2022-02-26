import java.util.Scanner;

public class CardTest {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the card notation: ");
        Card a = new Card(b.nextLine());
        System.out.println("The Card is: " + a.getDescription());
    }
}
