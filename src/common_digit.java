import java.util.*;
public class common_digit {
    //Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        if (a >= 25 && b<=75){
            String str1 = String.valueOf(a);
            String str2 = String.valueOf(b);
            for (int i = 0; i <= 1; i++){
                if (str1.charAt(i)==str2.charAt(i)){
                    System.out.print("true");
                } else {
                    break;
                }
            }
            System.out.print("false");
        }
    }
}
//method invented by me 😎