public class Application {
    String name;
    double height;
    double age;

    public Application (String name, double height,double age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public void tallNotTall(){
        if (this.height <= 140 ) {
            System.out.println("This is a small person");
        }else if(this.height > 140 && this.height <= 175) {
            System.out.println("This person have a average height");
        }else{
                System.out.println("This person is tall");
        }
    }
    public void oldNotOld(){
        if(this.age <= 10){
            System.out.println("This is a kid");
        } else if (this.age >10 && this.age < 18){
            System.out.println("This is a teenager");
        }else if(this.age >= 18 && this.age < 25){
            System.out.println("This is a student");
        } else if (this.age >= 25 && this.age < 40) {
            System.out.println("This is an adult person");
        } else if (this.age > 40 && this.age <= 65) {
            System.out.println("In that age you can be whatever you want");
        }else{
            System.out.println("This is an old person, be respectful");
        }
    }

    public void combine(){
        if(this.age <= 10 && this.height <= 100){
            System.out.println("This person have 10 years or less and have 100 cm of height or less");
        } else if (this.age > 10 && this.age <= 18 && this.height > 100 && this.height < 160){
            System.out.println("This teenager is still growing");
        }else if(this.age > 10 && this.age <= 18 && this.height < 100){
            System.out.println("This is interesting, this teenager have a growth problem");
        } else if(this.age > 18 && this.age <= 30 && this.height > 120 && this.height <= 150){
            System.out.println("This adult person is small");
        }else if(this.age > 18 && this.age <= 30 && this.height > 150 && this.height <= 180){
            System.out.println("This adult person has the height of a typical European");
        } else if (this.age > 18 && this.height < 120){
            System.out.println("This person is a dwarf");
        } else if (this.age > 30 && this.age <= 60 && this.height > 120 && this.height < 180){
            System.out.println("This is a adult person with an average height");
        } else if(this.age > 18 && this.age <= 30 && this.height > 190){
            System.out.println("If that person is not a professional athlete, he probably has back problems in the future");
        }else if(this.age > 20 && this.age <=35 && this.height >200){
            System.out.println("NBA player for sure");
        }else if(this.age > 60 && this.height <= 120){
            System.out.println("Every single day that person is closer to the ground");
        }else if(this.age > 60 && this.height > 145 && this.height <=190){
            System.out.println("This is a someone grandparent with a regular height");
        }else{
            System.out.println("This person is a phenomenon");
        }
    }

}



