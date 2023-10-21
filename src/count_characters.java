import java.util.*;
public class count_characters {
    // Write a Java program to count letters, spaces, numbers and other characters in an input string.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int letters = 0;
        int spaces = 0;
        int number = 0;
        int others = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(arr[i])){
                letters++; 
            } else if (Character.isDigit(arr[i])) {
                number++;
            } else if (Character.isSpaceChar(arr[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("Given String has following number of characters: ");
        System.out.println("Letters: "+letters);
        System.out.println("Numbers: "+number);
        System.out.println("Spaces: "+spaces);
        System.out.println("Other: "+others);
    }
}