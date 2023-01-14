import java.util.Scanner;

public class DivisibilityBy3 {
    private static Boolean divisibility() {

        System.out.println("Podaj cyfrę, sprawdzę czy jest podzielna przez 3.");
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextInt();
        if (input % 3 == 0)
            System.out.println(" cyfra jest podzielna, a to jej wynik." + input / 3);

        else
            System.out.println(" cyfra nie jest podzielna, a to jej wynik." + input / 3);

        return divisibility();
    }

    public static void main(String[] args) {

        System.out.println(divisibility());
    }
}
