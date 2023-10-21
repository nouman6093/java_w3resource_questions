import java.util.*;
public class integer_sum {
    //Write a Java program and compute the sum of an integer's digits:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String n = sc.next();
        int[] arr = new int[n.length()];
        for (int i = 0; i < n.length(); i++){
            arr[i] += n.charAt(i)-'0';
        }
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.print("Sum is: "+sum);
    }
}