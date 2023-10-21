import java.util.*;
public class count_even_odd {
    //Write a Java program to count the number of even and odd elements in a given array of integers.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int elements = sc.nextInt();
        int[] arr = new int[elements];
        for (int i = 0; i < elements; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < elements; i++){
            if (arr[i]%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.print(even+" "+odd);
    }
}