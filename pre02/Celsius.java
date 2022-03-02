import java.util.Scanner;

public class Celsius {
  public static void main(String[] args){
    double celsius, fahrenheit;
    
    Scanner in = new Scanner(System.in);

    System.out.print("Enter Celsius here: ");
    celsius = in.nextDouble();

    final double fah = (celsius * 9/5) + 32 ;
    double remainder = fah;
    System.out.printf(" %.1f °C = %.1f °F ", celsius, fah, remainder);
  }
}