import java.util.*;
public class string_specified_word {
    //Write a Java program to check if a string starts with a specified word.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        boolean result = str.startsWith(word);
        System.out.println(result);
    }
}