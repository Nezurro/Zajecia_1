package pl.gda.wsb;

public interface sellable {
    public default void sell(Human seller, Human buyer, Double price) {

    }
}
