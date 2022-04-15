import java.io.*;
import java.util.*;

public class arrayMax {

  public static void main(String[] args){
    max();
    }
  
  public static void max(){
    int a[] = new int [100];
    Random num = new Random ();

    for(int i = 0; i<a.length; i++){
      a[i] = num.nextInt(99-0)+0;
      System.out.println(a[i]);
    }

    int max = 0;

    for(int i = 0; i<a.length; i++){
      a[i] = max;

      for(int e = i+1; e<a.length; e++){
        if (a[e]>max){
          max = a[e];
        }
      }
    }
    System.out.println("Max element is " + max );
  }

}