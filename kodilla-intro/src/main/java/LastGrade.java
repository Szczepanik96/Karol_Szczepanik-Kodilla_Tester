public class LastGrade {
    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(2);
        grades.add(1);
        grades.add(5);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(1);


        System.out.println(grades.lastGrade());
        System.out.println(grades.averageGrades());
    }
}