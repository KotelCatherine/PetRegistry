package Animal;

import java.util.Date;
import java.util.List;

import ErrorMessage.NotFoundAnimal;
import Pet.Cat;
import Pet.Dog;
import Pet.Hamster;
import PackAnimal.Horse;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name, Date birthday, List<String> order) {
        return switch (type) {
            case "cat" -> new Cat(name, birthday, order);
            case "dog" -> new Dog(name, birthday, order);
            case "hamster" -> new Hamster(name, birthday, order);
            case "horse" -> new Horse(name, birthday, order);
            default -> throw new NotFoundAnimal("Введены неверные данные!");
        };
    }
}
