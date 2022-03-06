import java.io.*;
import java.util.*;

public class Return {
public static void main(String[] args){
  System.out.println("Testing the file.");
  printLogarithm(0);
  scanDouble();
  countdown(3);
  
}


public static void printLogarithm(double x) {
    if (x <= 0.0) {
        System.err.println("Error: x must be positive.");
        return;
    }
    double result = Math.log(x);
    System.out.println("The log of x is " + result);
}

//Validating input
//public static void scanDouble() {
  //Scanner in = new Scanner(System.in);
    //System.out.print("Enter a number: ");
    //double x = in.nextDouble();
    //printLogarithm(x);
//}

  public static void scanDouble() {
  Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    if (!in.hasNextDouble()) {
        String word = in.next();
        System.err.println(word + " is not a number");
        return;
    }
    double x = in.nextDouble();
    printLogarithm(x);
    }


public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
  
}

  
}