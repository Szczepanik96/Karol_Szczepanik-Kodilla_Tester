public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500, 2000);
        Notebook heavyNotebook = new Notebook(2000, 1800, 2009);
        Notebook oldNotebook = new Notebook(1200, 545, 2001);
        Notebook dellNotebook = new Notebook(1500, 1150, 2020);
        Notebook asusNotebook = new Notebook(1750, 1950, 2012);
        Notebook acerNotebook = new Notebook(2200, 1300, 2010);
        Notebook lenovoNotebook = new Notebook(950, 2200, 2021);
        Notebook appleNotebook = new Notebook(1150, 3000, 2022);

        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);
        displayNotebookParameters(dellNotebook);
        displayNotebookParameters(asusNotebook);
        displayNotebookParameters(acerNotebook);
        displayNotebookParameters(lenovoNotebook);
        displayNotebookParameters(appleNotebook);
    }

    private static void displayNotebookParameters(Notebook notebook) {
        System.out.println("price" + notebook.price + " " + "weight" + notebook.weight + " " + "year" + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.worthToBuy();
    }
}