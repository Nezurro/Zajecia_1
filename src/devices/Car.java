package devices;

import pl.gda.wsb.Brand;

public class Car {

    public final String model;
    public final String producer;
    public int value;
    public Brand brand;

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
