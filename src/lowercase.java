import java.util.*;
public class lowercase {
    //Write a Java program to convert a string into lowercase.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence in uppercase: ");
        String str = sc.nextLine();
        StringBuilder strBuilder = new StringBuilder();
        String[] array = str.split(" ");
        for (String word: array){
            if (!word.isEmpty()){
                String restOfWord = word.substring(0).toLowerCase();
                strBuilder.append(restOfWord).append(" ");
            }
        }
        String result = strBuilder.toString();
        System.out.print("Lowercase: "+result);
    }
}