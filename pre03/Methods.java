import java.io.*;
import java.util.*;

public class Methods {
  
  public static void zoop(){
    baffle();
    System.out.print("You wuga ");
    baffle();
  }
  
  public static void main(String[] args){
    System.out.println("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
  }

  public static void baffle(){
    System.out.print("wug");
    ping();
  }

  public static void ping(){
    System.out.println(".");
    baffle();
  }

  //practice printTime**
  //public static void printTime(int hour, int minute){
    //System.out.print(hour);
    //System.out.print(":");
    //System.out.println(minute);
  //}

  //practice printTime**
  //public static void main(String[] args){
    //int hour = 11;
    //int minute = 59;
    //printTime(hour +1, 0);
  //}
  
}