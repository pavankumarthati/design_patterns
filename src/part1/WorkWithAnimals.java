package part1;

import part1.Dog;

public class WorkWithAnimals {

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("fido");
        System.out.println("name = " + fido.getName());

        fido.digHole();
        fido.setWeight(-1);
    }
}
