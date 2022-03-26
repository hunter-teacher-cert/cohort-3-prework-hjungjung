import java.io.*;
import java.util.*;

public class ack {
  
  //public static void main(String[] args){
  //ack();
  //}

  //public static void ack(int m, int n) {
    //long M = Long.parseLong(args[0]);
    //long N = Long.parseLong(args[1]);
    //StdOut.println(ackermann(M, N));
    
     //if (m = 0) {
       //return n + 1;
       //}
     //else if (n = 0) {
      //return ackermann(m - 1, 1);
      //return ackermann(m - 1, ackermann(m, n-1));
       //}
  //}
  //}


    public static void main(String[] args) {
      RecursiveAckerman (1, 2);
      NonRecursiveAckerman(1, 2);
      //System.out.println ("RecursiveAckerman(1, 2)   : " + RecursiveAckerman(1, 2));
      //System.out.println("NonRecursiveAckerman(1, 2): " + NonRecursiveAckerman(1, 2));
    }

    public static int RecursiveAckerman(int m, int n) {
        if (m == 0) {
            return (n + 1);
        } else if (m > 0 && n == 0) {
            return RecursiveAckerman(m - 1, 1);
        } else ( m > 0 && n > 0) {
            return RecursiveAckerman(m - 1, RecursiveAckerman(m, n - 1));
        }
    }


    public static int NonRecursiveAckerman(int m, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(m);
        while (!stack.isEmpty()) {
            m = stack.pop();
            if (m == 0 || n == 0) {
                n += m + 1;
            } else {
                stack.add(--m);
                stack.add(++m);
                n--;
            }
        }
        return n;
    }


}