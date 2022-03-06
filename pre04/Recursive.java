import java.io.*;
import java.util.*;

public class Recursive {
  public static void main(String[] args){
    countdown(3);
    //newLine();
    //threeLine();
    nLines(4);
  }

  public static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blastoff?");
    } else {
      System.out.println(n);
      countdown(n-1);
    }
  }

  public static void nLines(int n){
  if (n > 0) {
    System.out.println(1);
    nLines(n - 1);
  }
}
  
//public static void newLine(){
  //System.out.println();
//}

//public static void threeLine(){
  //newLine();
  //newLine();
  //newLine();
//}


  
  
} 
