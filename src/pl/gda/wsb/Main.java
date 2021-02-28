package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("mouse", "Jerry", 0.5);
        Animal animal2 = new Animal("krowa", "Basia", 500);

        Human human1 = new Human("Marek", "Ba");

        Phone phone1 = new Phone(0.2f, "phone");
        Phone phone2 = new Phone(0.3f, "phone2");

        System.out.println(animal1);
        System.out.println(human1);
        System.out.println(phone1);
        CompareAnimals(animal1, animal2);
        ComparePhones(phone1,phone2);
    }
    static void CompareAnimals(Animal animal, Animal animal2)
    {
        String tekst = "ciezsze jest zwierze: ";

        if(animal.weight > animal2.weight)
        {
            System.out.println(tekst + animal.species+ " waga: "+ animal.weight);
        }else System.out.println(tekst+animal2.species+ " waga: "+animal2.weight);
    }
    static void ComparePhones(Phone phone, Phone phone2)
    {
        String tekst = "ciezszy jest telefon: ";

        if(phone.weight > phone2.weight)
        {
            System.out.println(tekst + phone.name+" waga: "+ phone.weight);
        }else System.out.println(tekst+phone2.name+" waga: " +phone2.weight);
    }
}
