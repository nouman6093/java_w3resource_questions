public class swap_numbers {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping:");
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
    }
}