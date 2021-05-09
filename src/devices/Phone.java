package devices;

public class Phone extends Device {
    public Float weight;
    public String name;

    public Phone(Float weight, String name, String producer, Integer yearOfProduction, String model) {
        super(producer, model, yearOfProduction);
        this.weight = weight;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void TurnOn() {
        System.out.println("Telefon uruchamia się");
    }
}
