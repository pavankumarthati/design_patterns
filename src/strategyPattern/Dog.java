package strategyPattern;

import part1.Animal;

/**
 * Created by pavan on 31/1/17.
 */
public class Dog extends Animal {

    public Dog() {
        super();
        FlyAbility cantFly = new CantFly();
        super.setFlyAbility(cantFly);

    }
}
