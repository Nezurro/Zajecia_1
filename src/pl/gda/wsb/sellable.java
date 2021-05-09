package pl.gda.wsb;

import Creatures.Human;

public interface sellable {
    public default void sell(Human seller, Human buyer, Double price) {

    }
}
