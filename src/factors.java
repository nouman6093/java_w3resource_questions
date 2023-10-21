import java.util.*;
public class factors {
    //Write a Java program to accept an integer and count the factors of the number:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.print("\nNumber of factors of the given number are: "+count);
    }
}