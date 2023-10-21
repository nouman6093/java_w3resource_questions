import java.util.*;
public class repeat_until_1 {
//    Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n%2==0){
            for (;n!=1;){
                n = n/2;
            }
        } else {
            for (;n!=1;){
                n=n*3;
                n++;
            }
        }
        System.out.println(n);
    }
}