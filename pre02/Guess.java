import java.util.Random;
import java.util.Scanner;

public class Guess {
  public static void main(String[] args){
    int number;
    Scanner in = new Scanner(System.in);
    
    
    System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? Type a number:");
    number = in.nextInt();
    System.out.println("Your guess is:" + number);
    
  
    Random random = new Random();
    int rnumber = random.nextInt(100) + 1;
    System.out.print("The number I was thinking of is:");
    System.out.println(rnumber);

    int offnumber; 
    offnumber = rnumber - number;
    System.out.print("You were off by: ");
    System.out.println(offnumber);
    
  }
}