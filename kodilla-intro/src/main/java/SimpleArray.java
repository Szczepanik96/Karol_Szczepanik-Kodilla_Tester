public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[]{"Bolek i Lolek", "Kopciuszek"};
        String movie = movies[1];
        System.out.println(movie);


        String[] songs = new String[2];
        songs[0] = "Keszkewmeszke";
        songs[1] = "bajabongo";
        String song = songs[1];
        System.out.println(song);

        String[] womans = new String[3];
        womans[0] = "Jessica Abla";
        womans[1] = "Megan Fox";
        womans[2] = "Agata Duda";
        String woman = womans[2];
        System.out.println(woman);

        String[] cars = new String[]{"Mercedes", "Audi", "Mazda", "Fiat"};
        String car = cars[3];
        System.out.println(car);

        String[] foods = new String[]{"Kebap", "Pierogi", "Pizza", "Apple"};
        String food = foods[3];
        System.out.println(food);

        int numberOfElements = foods.length;
        System.out.println(numberOfElements + " is a number Of different foods");


    }
}




