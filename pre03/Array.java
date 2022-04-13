import java.io.*;
import java.util.*;

public class Array {

  public static void main(String[] args){
    arrLength();
    powArray();
    //double b = 12.0;
    int[] a = {1, 2, 3, 4};
    int[] scores = new int[5];
    //System.out.println(a);
    printArray(a);
    accessElements();
    //displayArrays();
    //copyingArrays();
    //arrayLength();
  
  }
  
  public static void arrLength(){
    int[] arr = new int[5];
    int arrayLength = arr.length;
    System.out.println("The length of the array is:" + arrayLength);
  }
  
  public static void powArray(){
      //double a = 30;
      //double b = 2;
      //System.out.println(Math.pow(a,b));
      double[] b = new double[5];
      b[0] = 2;
      b[1] = 3;
      b[2] = 4;
      b[3] = 5;
      b[4] = 6;
      for (int i=0; i < b.length; i++){
        b[i] = Math.pow(b[i],2.0);
        System.out.println(b[i] );
      }
      //System.out.println(Arrays.toString(b));
  
   }
   
  
  
  //display the elements of the array:
  public static void printArray(int[] a){
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print("," + a[i]);
    }
    System.out.println("}");
    
    //using a utility class java.util.Arrays
    //One of them, toString, returns a string representation of an array.
    System.out.println(Arrays.toString(a) + "->" + "using a Utility class, a string representation of an array");
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