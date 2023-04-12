import java.util.Scanner;

class Training2 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;
        int c = 12;
        int d = 4;
        int ring = (c * d);
        double sum = (a + b);
        double isEven = (sum / 2);
        boolean huge = true;
        if (ring >= 100) ;
        else huge = false;


        System.out.println("Wybierz od 1 do 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println(huge);

        int input = scanner.nextInt();
        System.out.println("Padło na: " + input);


//        switch (input) {
//            case 1 -> System.out.println(sum);
//            case 2 -> System.out.println(isEven);
//            case 3 -> System.out.println("Trója");
//            case 4 -> System.out.println("Czwórka");
//            case 5 -> System.out.println("Piątka");
//
//
//        }
    }
}










