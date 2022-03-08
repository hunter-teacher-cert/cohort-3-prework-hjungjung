import java.io.*;
import java.util.*;

public class Methods {
  
  public static void main(String[] args){
  isDivisible(); 
  isTriangle();
  
  }


  public static void isDivisible(){
  int n = 12;
  int m = 4;
  boolean divisibleFlag = (n % m == 0);
  
  if (divisibleFlag){
    System.out.println("True, n is divisible by m.");
  }
  if (!divisibleFlag){
    System.out.println("Fales, n is not divisible by m.");
  } 
  }

  public static void isTriangle() {
    //boolean flag;
    //flag = true;
    //boolean testResult = false;
    int a = 4;
    int b = 7;
    int c = 15;
    int ab = a + b;
    int sum = ab ;

    if (ab > c ){
      System.out.println("True, you can form a triangle.");
      }
      else {
        System.out.println("Fales, you can't form a triangle.");
      }
    }

    

  
  }

  
