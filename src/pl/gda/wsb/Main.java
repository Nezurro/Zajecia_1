package pl.gda.wsb;

import devices.Car;
import devices.Phone;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Animal animal1 = new Animal("mouse", "Jerry", 0.5);
        Animal animal2 = new Animal("cow", "Basia", 500);

        Human human1 = new Human("Marek", "Ba", 100);
        Human human2 = new Human("Andrzej", "La", 200);
        Human human3 = new Human("Andrzej", "La", 200);

        Phone phone1 = new Phone(0.2f, "phone", "Sony", 2010, "XYZ");
        Phone phone2 = new Phone(0.3f, "phone2", "LG", 2020, "ABC");

        Car car1 = new Car("A3","Audi", 60000, Brand.Audi,2005);
        Car car2 = new Car("Macan","Porsche", 800000, Brand.Porsche, 2015);
        Car car3 = new Car("A3","Audi", 60000, Brand.Audi, 2020);


        ArrayList<Human>  humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);

        System.out.println(animal1);
        System.out.println(human1);
        System.out.println(phone1);
        CompareAnimals(animal1, animal2);
        ComparePhones(phone1,phone2);

        HumanLoop(humansList);

        animal1.feed();
        animal1.takeForWalk();
        animal1.takeForWalk();
        animal1.takeForWalk();
        animal2.takeForWalk();
        animal2.takeForWalk();
        animal2.feed();

        System.out.println(human2.equals(human3));
        System.out.println(human2);
        System.out.println(human3);

        human1.getSalary();
        human1.setSalary(-500.0);
        human1.setSalary(9000.0);

        human1.setCar(car3);
        human2.setCar(car2);

        car1.TurnOn();
        phone1.TurnOn();



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
        StringBuilder builder = new StringBuilder();
        builder.append("ciezszy jest telefon: ");
        

        if(phone.weight > phone2.weight)
        {
            builder.append(phone.name);
            builder.append(" waga: ");
            builder.append(phone.weight);
            System.out.println(builder);
        }else System.out.println(tekst+phone2.name+" waga: " +phone2.weight);
    }
    static void HumanLoop(ArrayList<Human> humans) throws IOException {
        FileWriter fw = new FileWriter("human.txt", false);

        for(Human h : humans)
        {
            System.out.println(h.name+" "+h.surname+" ");

            fw.write(h.name+"\n");
        }fw.close();
    }
}
