package Creatures;

import pl.gda.wsb.edible;

public class FarmAnimal extends Animal implements edible {
    public FarmAnimal(String species, String name, Double weight) {
        super(species, name, weight);
    }
}
