import java.util.*;
public class multiply_array_elements {
    //multiply elements of 2 arrays:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter Element["+(i+1)+"] = ");
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter Element["+(i+1)+"] = ");
            array2[i] = sc.nextInt();
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = array1[i] * array2[i];
        }
        for (int i = 0; i < size; i++){
            System.out.print(result[i]+" ");
        }
    }
}