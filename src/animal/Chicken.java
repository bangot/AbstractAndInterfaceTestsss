package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "ga keu oo";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
