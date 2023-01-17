public class User {

    String name;
    int age;


    public User(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {


        User karol = new User("Karol", 27);
        User anna = new User("Anna", 28);
        User janusz = new User("Janusz", 67);
        User gabriel = new User("Gabriel", 13);
        User szymon = new User("Szymon", 37);
        User barbara = new User("Barbara", 74);
        User helena = new User("Helena", 5);
        User roland = new User("Roland", 31);
        User tadeusz = new User("Tadeusz", 34);
        User kamil = new User("Kamil", 30);

        User[] user = {karol, anna, janusz, gabriel, szymon, barbara, helena, roland, tadeusz, kamil};

        double sum = 0;

        for (int i = 0; i < user.length; i++) {
            sum += user[i].age;
        }

        double averageSum = sum / user.length;

        for(int i = 0; i < user.length; i++){
            if(user[i].age < averageSum) {
                System.out.println(user[i].name);
            }
        }

    }
}
