import java.util.*;
public class swap_element_of_array {
    //Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter Element["+(i+1)+"] = ");
            array[i] = sc.nextInt();
        }
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        for (int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
    }
}