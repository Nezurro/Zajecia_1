package pl.gda.wsb;

public class Phone {
    Float weight;
    String name;

    public Phone(Float weight, String name) {
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
}
