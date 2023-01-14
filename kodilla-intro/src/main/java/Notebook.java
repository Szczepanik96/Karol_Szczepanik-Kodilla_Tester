public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkWeight() {
        if (this.weight <= 1000) {
            System.out.println("This notebook is very light");
        } else if (this.weight > 1000 && this.weight <= 1500) {
            System.out.println("This notebook have a normal weight");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");

        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");

        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void worthToBuy() {
        if (this.price >= 2000 && this.weight > 1500 && this.year < 2014) {
            System.out.println("ten komputer ma zawyżoną cene w stosunku do jakośći");
        } else if (this.price < 2000 && this.weight < 1650 && this.year > 2016) {
            System.out.println("ten komputer to dobra okazja, ma aktualny system, niewiele waży i jest w atrakcyjnej cenie");
        } else if (this.price < 1500 && this.weight < 1350 && this.year < 2009) {
            System.out.println("to już starszy sprzęt, za to bardzo lekki i w dobrej cenie");
        } else if (this.price >= 1800 && this.weight >= 1750 && this.year < 2013) {
            System.out.println("to nie jest najlepsza oferta, szukaj innego sprzętu");
        } else if (this.price < 2000 && this.weight < 1250 && this.year >= 2020) {
            System.out.println("ten komputer to istana okazja, weź i dla mnie !");
        } else if (this.price > 2000 && this.weight < 1200 && this.year > 2020) {
            System.out.println("to świetny sprzęt, za który warto solidnie zapłacić");
        } else {
            System.out.println("ten komputer nie spełania warunków wyszukiwania");
        }
    }
}


