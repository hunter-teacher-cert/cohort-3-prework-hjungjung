import java.io.*;
import java.util.*;

//Flag variables
public class Boolean{
  public static void main(String[] args){
  boolean flag;
  flag = true;
  boolean testResult = false;
  double n = 3;
  double x = 3;

  boolean evenFlag = (n % 2 == 0);
  boolean positiveFlag = (x > 0);
  if (evenFlag){
    System.out.println("n was even when I checked it");
  }
  if (!evenFlag){
    System.out.println("n was odd when I checked it");
  } 
}

}