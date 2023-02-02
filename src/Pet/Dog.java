package Pet;
import AnimalType.Pet;

import java.util.Date;
import java.util.List;

public class Dog extends Pet{
    public Dog(String name, Date birthday, List<String> order) {
        super(name, birthday, order);
    }
}
