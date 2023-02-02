package Pet;

import AnimalType.Pet;

import java.util.Date;
import java.util.List;

public class Cat extends Pet {
    public Cat(String name, Date birthday, List<String> order) {
        super(name, birthday, order);
    }
}
