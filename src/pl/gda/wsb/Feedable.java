package pl.gda.wsb;

public interface Feedable {
    default void feed() {System.out.println("Zwierze nakarmione: ");}
    default void feed(Double foodWeight) { System.out.println("Zwierze nakarmione: " + foodWeight);}
}
