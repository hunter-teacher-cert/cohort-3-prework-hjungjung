import java.io.*;
import java.util.*;

public class arrayPractice {

  public static void main(String[] args){
    powArray();
    
    int[] a = {1, 2, 3, 4};
    //System.out.println(a);
    printArray(a);
    accessElements();
    //displayArrays();
    //copyingArrays();
    //arrayLength();
  
  }

  public static void powArray(){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++){
      b[i] = Math.pow(b[i], 2.0);
      System.out.println(b[i]);
    }
    //return a;
  }
  
  //display the elements of the array:
  public static void printArray(int[] a){
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print("," + a[i]);
    }
    System.out.println("}");
    
    //using a utility class java.util.Arrays
    //One of them, toString, returns a tring representation of an array.
    System.out.println(Arrays.toString(a) + "," + "using Util");
  }
  

  
  public static void accessElements() {
    int[] counts;
    double[] values;
    counts = new int[4];
    //values = new double[20];
    //int[] counts = new int[4];
    //double[] values = new double[20];
    //System.out.println("The zeroth element is " +  counts[0]);

    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3] -= 60;

    //int i = 0;
    //while (i < 4){
      //System.out.println(counts[i]);
      //i++;
    //}  

    for (int i = 0; i < 4; i++){
      System.out.println(counts[i]);
    }
  
  }

  //I is for "integer," and the rest represents the address of the array.
  //public static void displayArrays(){
    //int[] a ={1,2,3,4};
    //System.out.println(a);
  //}

  
  //public static void copyingArrays() {
    //double[] a = new double[3];
    //double[] b = new double[3];
    //for (int i = 0; i < 3; i++){
    //  b[i] = a[i];
    //}
    //option, to use java.util.Arrays, provides a method named copyOf that copies an array:
    //double[] b = Arrays.copyOf(a,3);
  //}

  
  //public static void arrayLength() {
    //double[] a = new double[3];
    //double[] b = new double[a.length];
    //for (int i = 0; i < a.length; i++){
    //  b[i] = a[i];
    //}
    //can use a.length with Arrays.copyOf
    //double[] b = Arrays.copyOf(a, a.length);
  //}

  
}