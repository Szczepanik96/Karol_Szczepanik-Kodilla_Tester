import java.util.Scanner;

public class LeapYearReturn {
    public static void main(String[] args) {

        leapYear();
    }

    private static Boolean leapYear() {
        int year = 54;
        boolean leap;

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

        return leap;
    }

}
