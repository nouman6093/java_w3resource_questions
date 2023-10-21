import java.util.*;
public class divisible_2 {
    //Write a Java program to find the number of values in a given range divisible by a given value.
    //For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y: ");
        int y = sc.nextInt();
        System.out.print("Enter value of p: ");
        int p = sc.nextInt();
        int count = 0;
        for (int i = x; i < y; i++){
            if (i%p==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.print("\nNumber of integers: "+count);
    }
}