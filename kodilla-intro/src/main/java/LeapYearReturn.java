import java.util.Scanner;

public class LeapYearReturn {
    private static Boolean leapYear() {
        int year = 800;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else leap = false;
            } else leap = true;
        } else leap = false;
        if (leap)
            System.out.println(year + "This is leap year.");
        else
            System.out.println(year + "This is not leap year.");

        System.out.println(leapYear());

        return leap;

    }
    public static void main(String[] args) {

        System.out.println(leapYear());
    }

}










