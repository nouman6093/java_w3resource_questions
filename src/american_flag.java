public class american_flag {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++){
            if (i%2==0){
                for (int stars = 0; stars < 6; stars++){
                    System.out.print("* ");
                }
            }else {
                for (int stars = 0; stars < 5; stars++){
                    System.out.print(" *");
                }
            }
            for (int j = 0; j < 34; j++){
                    System.out.print("=");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 46; j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
