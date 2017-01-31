package part2;

import part1.Animal;
import part1.Cat;
import part1.Dog;

/**
 * Created by pavan on 30/1/17.
 */
public class WorkWithAnimals {

    public static void main(String [] args) {

        // polymorphism
        Animal dog = new Dog();
        Animal kitty = new Cat();

        System.out.println("dog makes : " + dog.getSound());

        System.out.println("kitty makes : " + kitty.getSound());

        // polymorphism with arrays

        Animal [] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = kitty;
        System.out.println("dog makes " + animals[0].getSound());
        System.out.println("kitty makes " + animals[1].getSound());
    }

}
