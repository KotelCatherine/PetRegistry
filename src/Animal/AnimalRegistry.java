package Animal;

import ErrorMessage.NotFoundAnimal;

import java.util.ArrayList;

public class AnimalRegistry {
    private ArrayList<Animal> animals;

    public AnimalRegistry(ArrayList<Animal> animals) {
        this.animals = animals;

    }

    public Animal findAnimal(int id){
        try {
        for (Animal animal:
                animals) {
            if (animal.getId() == id){
                return animal;
            }
        }
        }catch (Exception e) {
            throw new NotFoundAnimal("Такого животного нет!");
        }
        return null;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimal(Animal animal) {
        this.animals.add(animal);
    }
}
