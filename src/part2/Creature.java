package part2;

/**
 * Created by pavan on 31/1/17.
 */
abstract public class Creature {

    protected String name;
    protected double weight;
    protected double height;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();

    public abstract void setHeight(double newHeight);
    public abstract double getHeight();

    public abstract void setSound(String newSound);
    public abstract String getSound();
}
