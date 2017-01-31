package strategyPattern;

/**
 * Created by pavan on 31/1/17.
 */
public interface FlyAbility {
    public void tryToFly();
}

class CanFly implements FlyAbility {

    @Override
    public void tryToFly() {
        System.out.println("I can fly");
    }
}

class CantFly implements FlyAbility {

    @Override
    public void tryToFly() {
        System.out.println("I can't fly");
    }
}
