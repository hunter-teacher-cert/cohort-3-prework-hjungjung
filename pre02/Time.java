public class Time {
  public static void main(String[] args){
    System.out.println("<This is pre-work 02: Time>");

    int hour;
    int minute;
    int second;
    int x;

    hour = 24;
    minute = 60;
    second = 60;
    x = 2;
    double percentage = (hour-x)*100/ hour;

    System.out.print("The current time is ");
    System.out.print(hour-2);
    System.out.print(":");
    System.out.print(minute-60);
    System.out.print(":");
    System.out.println(second-60);
    System.out.println("It's almost "+ percentage + " % of the day has passed.");
  }
}