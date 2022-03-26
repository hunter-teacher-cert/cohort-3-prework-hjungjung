import java.io.*;
import java.util.*;

public class Array {

  public static void main(String[] args){
    //array();
    int[] a = {1, 2, 3, 4};
    //System.out.println(a);
    printArray(a);
  
  }

  public static void printArray(int[] a){
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print("," + a[i]);
    }
    System.out.println("}");
    System.out.println(Arrays.toString(a) + "," + "using Util");
  }
  
  
  //public static void array() {
    //int[] counts;
    //double[] values;
    //counts = new int[4];
    //values = new double[size];
    //??double size = in.nextDouble();
  
    //System.out.println(counts, values);
  //}

  
}