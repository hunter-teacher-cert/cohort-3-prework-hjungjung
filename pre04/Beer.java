import java.io.*;
import java.util.*;

public class Beer {
  public static void main(String[] args){
    nLines(3);
    System.out.println("No bottles of beer on the wall,");
    System.out.println("no bottles of beer,");
    System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
    System.out.println("’cause there are no more bottles of beer on the wall!");
    //System.out.println();
  }

  public static void nLines(int n){
  if (n > 1) {
    System.out.print(n);
    System.out.println(" bottles of beer on the wall,");
    System.out.print(n);
    System.out.println(" bottles of beer,");
    System.out.println("ya' take one down, ya' pass it around,");
    System.out.println();
    nLines(n - 1);
    
    } if (n == 1) {
    System.out.print(n);
    System.out.println(" bottle of beer on the wall,");
    System.out.print(n);
    System.out.println(" bottle of beer,");
    System.out.println("ya' take one down, ya' pass it around,");
    System.out.println();
    }
   
  }


    }