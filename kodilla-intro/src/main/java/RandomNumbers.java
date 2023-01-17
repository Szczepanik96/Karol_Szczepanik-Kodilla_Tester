import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int max = 0;
        int min = 0;

        Random random = new Random();

        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum += temp;
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
}
