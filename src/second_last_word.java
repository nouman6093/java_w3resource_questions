import java.util.*;
public class second_last_word {
    //print second last word of a string:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine();
        String[] array = str.split(" ");
        String secondLastWord = array[array.length-2];
        System.out.print("Second last word is: "+secondLastWord);
    }
}