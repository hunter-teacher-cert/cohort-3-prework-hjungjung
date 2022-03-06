import java.io.*;
import java.util.*;

//Recursive methods ??
public class Count {
  public static void main(String[] args){
    nLines();
  }

  public static void nLines(){
    int n;
    n = 3;
    if (n > 0){
      System.out.println();
      nLines (n - 1);
    }
  }
}