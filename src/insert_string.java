public class insert_string {
    public static void main(String[] args){
        //Write a Java program to insert a word in the middle of another string.
        //Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
        String name = "My is Nouman Hameed.";
        System.out.println(name.substring(0,2)+" name "+name.substring(3));


        //Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above.
        String str1 = "Python 3.0";
        System.out.println(str1.substring(str1.length()-3));


        //Write a Java program to extract the first half of a even string.
        String str2 = "Python";
        System.out.println(str2.substring(0,str2.length()/2));


        //Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.
        String str3 = "Python", str4 = "Tutorial";
        if (str3.length()>str4.length()){
            System.out.println(str4+str3+str4);
        } else {
            System.out.println(str3+str4+str3);
        }


        //Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
        String str5 = "Python", str6 = "Tutorial";
        System.out.println(str5.substring(1)+str6.substring(1));
    }
}