import java.util.Random;

public class RandomNumbers {
    static int max = 0;
    static int min = 0;

    public static void main(String[] args) {

        int sum = 0;

        Random random = new Random();

        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum += temp;
            System.out.println(getMin(temp));
            System.out.println(getMax(temp));
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }

    public static int getMax(int number){
        if (number > max) {
            max = number;
        }
        return max;
    }
    public static int getMin(int number){
        if (number < min) {
            min = number;
        }
        return min;
    }
}