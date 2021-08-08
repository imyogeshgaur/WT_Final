package JavaBasic;
class Pet {

    String name;
    int age;
    String breed;

    Pet(String name, int age, String breed) {

        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}

public class compareObjects {
    public static void main(String args[]) {
        Pet dog1 = new Pet("Snow", 3, "German Shepherd");
        Pet cat = new Pet("Jack", 2, "Tabby");
        Pet dog2 = new Pet("Snow", 3, "German Shepherd");

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(cat));
    }
}