package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("mouse", "Jerry", 0.5);
        Human human1 = new Human("Marek", "Ba");
        Phone phone1 = new Phone(0.2f, "phone");
        System.out.println(animal1);
        System.out.println(human1);
        System.out.println(phone1);
    }
}
