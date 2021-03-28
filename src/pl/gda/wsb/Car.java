package pl.gda.wsb;

public class Car {

    final String model;
    final String producer;
    int value;
    Brand brand;

    public Car(String model, String producer,int value, Brand brand ) {
        this.model = model;
        this.producer = producer;
        this.value = value;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value=" + value +
                '}';
    }
}
