import java.util.*;
public class reverse_string {
    //Write a Java program to reverse a string:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        String newStr = "";
        for (int i = arr.length-1; i>=0;i--){
            newStr += arr[i];
        }
        System.out.print(newStr);
    }
}