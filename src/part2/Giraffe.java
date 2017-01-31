package part2;

/**
 * Created by pavan on 31/1/17.
 */
public class Giraffe extends Creature {

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(double newWeight) {
        if (newWeight > 0) weight = newWeight;
        else System.out.println("weight should be greater than 0");
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setHeight(double newHeight) {
        if (newHeight > 0) height = newHeight;
        else System.out.println("height should be greater than 0");
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setSound(String newSound) {
        sound = newSound;
    }

    @Override
    public String getSound() {
        System.out.println("Giraffe makes " + sound);
        return sound;
    }
}
