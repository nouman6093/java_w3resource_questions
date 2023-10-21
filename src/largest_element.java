import java.util.*;
public class largest_element {
    //largest element of an array:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element["+(i+1)+"] = ");
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 0; i < size; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is: "+largest);
    }
}