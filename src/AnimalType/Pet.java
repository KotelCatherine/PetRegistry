package AnimalType;

import Animal.Animal;

import java.util.Date;
import java.util.List;

public class Pet extends Animal{
    public Pet(String name, Date birthday, List<String> order) {
        super(name, birthday, order);
    }

   /* public Pet(int id, String name, List<String> order, Date birthday) {
        super(name, order, birthday);
    }*/
}
