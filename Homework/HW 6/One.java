// put this in a file: One.java 

public class One {
  public static void main(String[] args) {
    int number = 150, // counts as user input  
        candidate = 2; // initially 
    System.out.println(" " + " " + number); 
    while (number != 1) {
      if (number % candidate == 0) { // new factor 
        System.out.println( candidate + " " + number / candidate ); // print the factor 
        number = number / candidate; // ... and take it out of the number  
      } else { // try a new candidate  
        System.out.println( candidate ); 
        candidate += 1; 
      }
    } 
  }
}
