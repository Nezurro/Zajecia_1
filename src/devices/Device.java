package devices;

public abstract class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    protected Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void TurnOn();
}
