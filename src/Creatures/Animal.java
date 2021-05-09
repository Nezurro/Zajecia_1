package Creatures;

import pl.gda.wsb.Feedable;

public abstract class Animal implements Feedable {
    final public String species;
    public String name;
    public Double weight;

    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_KROWA_WEIGHT = 500.0;

    public Animal(String species, String name, Double weight) {
        this.species = species;
        this.name = name;

        if(species.equals(("mouse")))
        {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }else if(species.equals(("cow")))
        {
            this.weight = DEFAULT_KROWA_WEIGHT;
        }else this.weight = 0.0;
    }

    public void feed()
    {
        if(weight >0)
        {
        weight += 5;
        System.out.println("Zwierze " + name +  " nakarmione");
        }
        else System.out.println("Zwierze " + name +  " nie zyje");
    }
    public void takeForWalk()
    {
        if(weight >0)
        {
            weight -= 5;
            System.out.println("Zwierze " + name +  " zostalo wyprowadzone na spacer");
        }
        else System.out.println("Zwierze " + name +  " nie zyje");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void sell(Human seller, Human buyer, Double price)
    {
        if(this.species =="HomoSapiens")
        {
            System.out.println("Handel ludzmi zakazany!");
        }else
        if(seller.pet !=null)
        {
            System.out.println(seller.toString()+ " Posiada Zwierze");
            if(buyer.cash >= price)
            {
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;

                System.out.println("Transakcja została przeprowadzona pomyślnie." + buyer.toString() + " kupił zwierze od: " + seller.toString());
            }else System.out.println("Kupujacy nie posiada tyle gotówki");
        }
    }
}
