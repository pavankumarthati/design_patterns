package strategyPattern;

import part1.Animal;

/**
 * Created by pavan on 31/1/17.
 */
public class AnimalPlay {

    public static void main(String [] args) {
        Animal sparky = new Dog();
        Animal tweeky = new Bird();

        sparky.getFlyAbility().tryToFly();
        tweeky.getFlyAbility().tryToFly();
    }
}
