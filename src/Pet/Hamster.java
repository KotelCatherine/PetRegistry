package Pet;
import AnimalType.Pet;

import java.util.Date;
import java.util.List;

public class Hamster extends Pet{
    public Hamster(String name, Date birthday, List<String> order) {
        super(name, birthday, order);
    }
}
