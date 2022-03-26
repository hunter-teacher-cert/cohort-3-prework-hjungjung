import java.io.*;
import java.util.*;

//Not completed code
public static void countup(int n) {
  if (n == 0){
    System.out.println("Blastoff!");
  } else {
    countup(n - 1);
    System.out.println(n);
  }
}

public static void main(String[] args) {
  
}