import java.util.*;
public class capitalization {
    //Capitalize the first letter of each word in a sentence
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder();
        String[] words = input.split(" ");
        for (String word: words){
            if (!word.isEmpty()){
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                str.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        String result = str.toString();
        System.out.print("Capitalized String: "+result);
    }
}