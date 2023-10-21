import java.util.*;
public class odd_numbers {
    //print odd numbers till given number:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number till which odd numbers shall be printed: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}