package devices;

import pl.gda.wsb.Brand;

public class Car extends Device{

    public int value;
    public Brand brand;

    public Car(String model, String producer,Integer value, Brand brand, Integer yearOfProduction ) {
        super(producer, model, yearOfProduction);
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

    @Override
    public void TurnOn() {
        System.out.println("Samochod został uruchomiony");
    }
}
