import java.util.*;
public class rightmost_digit {
    // Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.print("Enter an integer: ");
        int b = sc.nextInt();
        System.out.print("Enter an integer: ");
        int c = sc.nextInt();
        String d = String.valueOf(a);
        String e = String.valueOf(b);
        String f = String.valueOf(c);
        if (d.charAt(d.length()-1) == e.charAt(e.length()-1) || d.charAt(d.length()-1) == f.charAt(e.length()-1) || e.charAt(d.length()-1) == f.charAt(e.length()-1)){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}