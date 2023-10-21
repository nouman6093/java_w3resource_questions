import java.util.*;
public class even_or_odd {
    //Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}