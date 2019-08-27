package com.company.LS7OOP.animals;

public class AnimalsDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("whiskas", "Kiev", "Pers"), new Dog("bones", "Lviv", "yes"), new Horse("oves", "Kharkiv", "long")};
        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
