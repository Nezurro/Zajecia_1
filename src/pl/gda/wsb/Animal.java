package pl.gda.wsb;

public class Animal {
    final String species;
    String name;
    double weight;

    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_KROWA_WEIGHT = 500.0;

    public Animal(String species, String name, double weight) {
        this.species = species;
        this.name = name;

        if(species.equals(("mouse")))
        {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }else if(species.equals(("cow")))
        {
            this.weight = DEFAULT_KROWA_WEIGHT;
        }else this.weight = 0;
    }

    void feed()
    {
        if(weight >0)
        {
        weight += 5;
        System.out.println("Zwierze " + name +  " nakarmione");
        }
        else System.out.println("Zwierze " + name +  " nie zyje");
    }
    void takeForWalk()
    {
        if(weight >0)
        {
            weight -= 5;
            System.out.println("Zwierze " + name +  " zostalo wyprowadzone na spacer");
        }
        else System.out.println("Zwierze " + name +  " nie zyje");
    }

}
