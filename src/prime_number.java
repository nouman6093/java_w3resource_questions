import java.util.*;
public class prime_number {
    public static void main(String[] args){
        //check if a number is prime number or not:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime or not: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.print(isPrime);

        //print prime numbers till nth value:
        System.out.print("\nEnter an nth value: ");
        int a = sc.nextInt();
        for (int i = 2; i <= n; i++){
            if (isprime(i)){
                System.out.print("\n"+i+" ");
            }
        }
    }
    public static boolean isprime(int n){
        boolean isprime = true;
        for (int i = 2; i < n; i++){
            if (n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
}