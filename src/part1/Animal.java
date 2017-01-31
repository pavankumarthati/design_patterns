package part1;

import strategyPattern.FlyAbility;
import sun.rmi.runtime.Log;

/**
 * Created by pavan on 30/1/17.
 */
public class Animal {
    private String name;
    private double height;
    private double weight;
    private String sound;
    private FlyAbility flyAbility;

    public void setName(String newName) { name = newName; }
    public String getName() { return this.name; }

    public void setHeight(double newHeight) { height = newHeight; }
    public double getHeight() { return height; }

    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("weight should be greater then 0");
        }
    }
    public double getWeight() { return weight; }

    public void setSound(String newSound) { sound = newSound; }
    public String getSound() { return sound; }

    public void setFlyAbility(FlyAbility flyAbility) {
        this.flyAbility = flyAbility;
    }

    public FlyAbility getFlyAbility() {
        return this.flyAbility;
    }

    public void tryToFly() {
        flyAbility.tryToFly();
    }

}
