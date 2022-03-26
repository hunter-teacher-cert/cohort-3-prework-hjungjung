import java.io.*;
import java.util.*;

public class Loops {

  public static void main(String[] args) {
    squareRoot(6);
    //power(4, 2);
    factorial(5);
  }

  public static double squareRoot(double a){
      double oldValue = a/2;
      double newValue = a/2;
      double interval = 0;
      do{
         oldValue = newValue;
         newValue = (oldValue + a/oldValue)/2;
         interval = Math.abs(newValue - oldValue);
         System.out.println(interval);
      }while(interval > 0.001);
      return newValue;
   }

//public static double power(double x, int n){
      //double result = 1;
      //for (int i=0;i<n;i++){
         //result *= x;
      //}
      //return result;
   //}

public static int factorial(int n){
      int result = 1;
      for (int i=1;i<=n;i++){
         result *=i;
      }
      return result;
   }

}
