import java.util.*;
public class asci_code {
    //Print the ascii value of a given character:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character to print it's ASCII value: ");
        char character = sc.next().charAt(0);
        int ascii = (int) character;
        System.out.print("ASCII Value is: "+ascii);
    }
}