public class divisible_1 {
    //Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both:
    public static void main(String[] args){
        //for 3:
        System.out.println("For 3:");
        for (int i = 1; i <= 100; i++){
            if (i%3==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();


        //for 5:
        System.out.println("For 5:");
        for (int i = 1; i <= 100; i++){
            if (i%5==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();

        //for 3 and 5:
        System.out.println("For 3 and 5:");
        for (int i = 1; i <= 100; i++){
            if (i%3==0 && i%5==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }
}