public class Training1 {
    public static void main(String[] args) {
        int age = 16;
        if (age >=18) {
            System.out.println("Możesz pić alkohol");
        } else if (age >= 16 || age == 18) {
            System.out.println("Możesz pić z rodzicami");
        } else {
            System.out.println("Nie możesz pić alkoholu");
        }
    }
}