public class leapYear2 {
    public static void main(String[] args) {
        int year = 5;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else leap = false;
            } else leap = true;
        }else leap = false;
        if (leap)
            System.out.println(year + "przestępny");
        else
        System.out.println(year + "nie przestępny");
    }
}