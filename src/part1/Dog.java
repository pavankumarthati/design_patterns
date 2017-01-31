package part1;

/**
 * Created by pavan on 30/1/17.
 */
public class Dog extends Animal {

    public void digHole() {
        System.out.println("dig a hole");
    }

    public Dog() {
        super();
        // initalize dog specific behaviour
        setSound("bark");
    }
}
