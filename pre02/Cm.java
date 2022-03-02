import java.util.Scanner;

public class Cm {
  public static void main(String[] args){
    double cm;
    double feet, inches, remainder;
    final double CM_PER_INCH = 2.54;
    //final double IN_PER_FOOT = 12;
    
    Scanner in = new Scanner(System.in);

    System.out.print("Enter cm here: ");
    cm = in.nextDouble();

    inches = cm / CM_PER_INCH;
    remainder = inches;
    System.out.printf(" %.2f cm = %.5f inches ", cm, inches, remainder);
  }
}