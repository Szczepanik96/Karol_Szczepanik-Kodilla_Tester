public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500, 2000);
        System.out.println("notebook.price " + notebook.price + " " + "notebook.weight " + notebook.weight + " " + "notebook.year " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.worthToBuy();

        Notebook heavyNotebook = new Notebook(2000, 1800, 2009);
        System.out.println("heavyNotebook.price " + heavyNotebook.price + " " + "heavyNotebook.weight " + heavyNotebook.weight + " " + "heavyNotebook.year " + notebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.worthToBuy();

        Notebook oldNotebook = new Notebook(1200, 545, 2001);
        System.out.println("oldNotebook.price " + oldNotebook.price + " " + "oldNotebook.weight " + oldNotebook.weight + " " + "oldNotebook.year " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.worthToBuy();

        Notebook dellNotebook = new Notebook(1500, 1150, 2020);
        System.out.println("dellNotebook.price " + dellNotebook.price + " " + "dellNotebook.weight " + dellNotebook.weight + " " + "dellNotebook.year " + dellNotebook.year);
        dellNotebook.checkPrice();
        dellNotebook.checkWeight();
        dellNotebook.worthToBuy();

        Notebook asusNotebook = new Notebook(1750, 1950, 2012);
        System.out.println("asusNotebook.price " + asusNotebook.price + " " + "asusNotebook.weight " + asusNotebook.weight + " " + "asusNotebook.year " + asusNotebook.year);
        asusNotebook.checkPrice();
        asusNotebook.checkWeight();
        asusNotebook.worthToBuy();

        Notebook acerNotebook = new Notebook(2200, 1300, 2010);
        System.out.println("acerNotebook.price " + acerNotebook.price + " " + "acerNotebook.weight " + acerNotebook.weight + " " + "acerNotebook.year " + acerNotebook.year);
        acerNotebook.checkPrice();
        acerNotebook.checkWeight();
        acerNotebook.worthToBuy();

        Notebook lenovoNotebook = new Notebook(950, 2200, 2021);
        System.out.println("lenovoNotebook.price " + lenovoNotebook.price + " " + "lenovoNotebook.weight " + lenovoNotebook.weight + " " + "lenovoNotebook.year " + lenovoNotebook.year);
        lenovoNotebook.checkPrice();
        lenovoNotebook.checkWeight();
        lenovoNotebook.worthToBuy();

        Notebook appleNotebook = new Notebook(1150, 3000, 2022);
        System.out.println("appleNotebook.price " + appleNotebook.price + " " + "appleNotebook.weight " + appleNotebook.weight + " " + "appleNotebook.year " + appleNotebook.year);
        appleNotebook.checkPrice();
        appleNotebook.checkWeight();
        appleNotebook.worthToBuy();

    }
}
