import java.util.*;
public class string_last_three_characters {
    //Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String newstr = "";
        if (str.length()>3){
            newstr = str.substring(str.length()-3);
            System.out.println(newstr+str+newstr);
        } else {
            System.out.println("Please enter string with length greater than 3");
        }
    }
}