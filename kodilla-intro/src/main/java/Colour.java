import java.util.Scanner;

public class Colour {
    public static void main(String[] args) {
        String result = Colour.getColourLetter();
    }

    public static String getColourLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give me a single letter: ");
            String letter = scanner.nextLine().trim().toUpperCase();

            switch (letter) {
                case "A":
                    System.out.println("Aqua");
                    break;
                case "B":
                    System.out.println("bisque");
                    break;
                case "C":
                    System.out.println("chartreuse");
                    break;
                case "D":
                    System.out.println("dodgerblue");
                    break;
                case "F":
                    System.out.println("firebrick");
                    break;
                case "G":
                    System.out.println("goldenrod");
                    break;
                case "H":
                    System.out.println("honeydew");
                    break;
                case "I":
                    System.out.println("indigo");
                    break;
                case "K":
                    System.out.println("khaki");
                    break;
                case "L":
                    System.out.println("lemonchiffon");
                    break;
                case "M":
                    System.out.println("maroon");
                    break;
                case "N":
                    System.out.println("navajowhite");
                    break;
                case "O":
                    System.out.println("orange");
                    break;
                case "P":
                    System.out.println("plum");
                    break;
                case "R":
                    System.out.println("rosybrown");
                    break;
                case "S":
                    System.out.println("sienna");
                    break;
                case "T":
                    System.out.println("thistle");
                    break;
                case "Y":
                    System.out.println("yellow");
                    break;
                default:
                    System.out.println("Colour on that letter does not exist");
                    break;
            }
        }
    }
}