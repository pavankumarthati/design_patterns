package strategyPattern;

import part1.Animal;

/**
 * Created by pavan on 31/1/17.
 */
public class Bird extends Animal {

    public Bird() {
        super();
        FlyAbility canFly = new CanFly();
        setFlyAbility(canFly);
        xyz();
    }

    public void xyz() {}
}
