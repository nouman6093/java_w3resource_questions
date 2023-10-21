import java.util.*;
public class number_system {
    public static void main(String[] args){
        //converting decimal to binary:
        Scanner sc = new Scanner(System.in);
        System.out.println("Converting decimal to binary:");
        System.out.print("Enter a Decimal Number: ");
        int decimalToBinary = sc.nextInt();
        int binaryToDecimal = 0;
        for (int i = decimalToBinary; i > 0; i/=2){
            int remainder = i%2;
            binaryToDecimal = remainder + binaryToDecimal * 10;
        }
        System.out.println("Binary: "+binaryToDecimal);


        //converting decimal to octal:
        System.out.println("Converting decimal to octal: ");
        System.out.print("Enter a Decimal Number: ");
        int decimalToOctal = sc.nextInt();
        String octal = "";
        for (int i = decimalToOctal; i > 0; i/=8){
            int remainder = i%8;
            octal += remainder;
        }
        String reverseOctal = "";
        for (int i = octal.length()-1; i >= 0 ; i--){
            reverseOctal += octal.charAt(i);
        }
        System.out.println("Octal: "+reverseOctal);



        //converting decimal to hexadecimal:
        System.out.println("Converting decimal to hexadecimal: ");
        System.out.print("Enter a Decimal Number: ");
        int decimalToHexadecimal = sc.nextInt();
        String hexadecimal = "";
        for (int i = decimalToHexadecimal; i > 0; i/=16){
            int remainder = i%16;
            if (remainder >= 0 && remainder <= 9){
                hexadecimal += remainder;
            } else if (remainder >= 10 && remainder <= 15){
                char hexChar = (char)('A' + remainder - 10);
                hexadecimal += hexChar;
            }
        }
        System.out.println("Hexadecimal: "+hexadecimal);

        //converting binary to decimal:
        System.out.println("Converting binary to decimal: ");
        System.out.print("Enter a Binary Number: ");
        String binaryStr = sc.next();
        int[] arr = new int[binaryStr.length()];
        for (int i = 0; i < binaryStr.length(); i++){
            arr[i] = binaryStr.charAt(i) - '0';
        }
        int decimal = 0;
        for (int i = 0; i < arr.length; i++){
            decimal += arr[i] * (int) Math.pow(2,arr.length-1-i);   //for example: 1*2^1+0*2^0=? wala formula use hoya hai
        }
        System.out.print("Decimal: "+decimal);

        //converting binary to octal:
        //converting binary to hexadecimal:
        //converting octal to decimal:
        //converting octal to binary:
        //converting octal to hexadecimal:
        //converting hexadecimal to decimal:
        //converting hexadecimal to binary:
        //converting hexadecimal to octal:
    }
}