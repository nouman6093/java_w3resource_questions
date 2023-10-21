import java.util.*;
public class time_conversion {
    //Write a Java program to convert seconds to hours, minutes and seconds:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seconds: ");
        int input = sc.nextInt();
        int hours = input/60;
        int minutes = hours%60;
        hours = hours/60;
        int seconds = input%60;
        System.out.print(hours+":"+minutes+":"+seconds);
    }
}