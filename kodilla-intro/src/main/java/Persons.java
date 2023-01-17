public class Persons {
    public static void main(String[] args) {

        Application Dave = new Application("Dave", 195.9, 42.5);
        System.out.println(Dave.name + " HEIGHT " + Dave.height + " AGE " + Dave.age);
        Dave.tallNotTall();
        Dave.oldNotOld();

        Application Gloria = new Application("Gloria", 155,72);
        System.out.println(Gloria.name+ " HEIGHT " + Gloria.height+ " AGE " + Gloria.age);
        Gloria.tallNotTall();
        Gloria.oldNotOld();
        Gloria.combine();

        Application Jeremy = new Application("Jeremy", 97.8, 7.5);
        System.out.println(Jeremy.name + " HEIGHT " + Jeremy.height + " AGE " + Jeremy.age);
        Jeremy.tallNotTall();
        Jeremy.oldNotOld();
        Jeremy.combine();

        Application Michael = new Application("Michael",195,28);
        System.out.println(Michael.name + " HEIGHT " + Michael.height + " AGE " + Michael.age);
        Michael.tallNotTall();
        Michael.oldNotOld();
        Michael.combine();

        Application Gimli = new Application("Gimli", 115, 70);
        System.out.println(Gimli.name + " HEIGHT " + Gimli.height + " AGE " + Gimli.age);
        Gimli.tallNotTall();
        Gimli.oldNotOld();
        Gimli.combine();

        Application Benjamin = new Application("Benjamin",90, 13);
        System.out.println(Benjamin.name + " HEIGHT " + Benjamin.height + " AGE " + Benjamin.age);
        Benjamin.tallNotTall();
        Benjamin.oldNotOld();
        Benjamin.combine();
    }
}
