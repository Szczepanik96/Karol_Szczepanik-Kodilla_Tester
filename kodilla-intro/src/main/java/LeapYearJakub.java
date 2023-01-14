import java.util.ArrayList;
import java.util.List;

public class LeapYearJakub {

    public static void main(String args[]) {
        List<Integer> years = new ArrayList<>();

        years.add(800);
        years.add(2013);
        years.add(2022);
        years.add(2014);
        years.add(2016);
        years.add(2018);
        years.add(2033);
        years.add(2053);
        years.add(2000);
        years.add(-2000);

        for (int i = 0; i < years.size(); i++) {
            leapYear(years.get(i));
        }
    }
    private static Boolean leapYear(int year) {
        boolean leap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap && year >= -238)
            System.out.println(year + "This is leap year.");
        else
            System.out.println(year + "This is not leap year.");
        return leap;
    }
}