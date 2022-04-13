import java.io.*;
import java.util.*;


public class Count {
  public static void main(String[] args){
    nLines(3);
  }

  public static void nLines(int n){
    //int n;
    //n = 3;
    if (n > 0){
      System.out.println(n);
      nLines (n - 1);
    }
  }
}