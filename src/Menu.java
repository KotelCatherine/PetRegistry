import Animal.Animal;
import Animal.AnimalBirthday;
import Animal.AnimalFactory;
import Animal.AnimalRegistry;
import Counter.CounterController;
import Reader.ConsoleReader;
import java.util.ArrayList;

public class Menu {
    AnimalRegistry registry = new AnimalRegistry(new ArrayList<>());
    ConsoleReader consoleReader = new ConsoleReader();

    public void start(){
        while (true){
            mainMenu();
            String value = consoleReader.getLine();

            if (value.equals("1")){
                startCreateAnimal();
            } else if (value.equals("2")) {
                getAnimals();
            } else if (value.equals("3")) {
                findAnimals();}
            else if (value.equals("0")) {
                consoleReader.stop();
                break;
            }
        }
    }

    private void findAnimals() {
        System.out.println("Введите id животного");
        String value = consoleReader.getLine();
        int id = Integer.parseInt(value);

        if (id <= Integer.MAX_VALUE){
            changeAnimal(registry.findAnimal(id));
        }

    }

    private void changeAnimal(Animal animal) {
        System.out.println("1: Добавить команду животного");
        System.out.println("2: Показать команды животного");
        System.out.println("0: Вернуться в меню");

        String value = consoleReader.getLine();

        if (value.equals("1")){
            animal.addOrder("Order");
        } else if (value.equals("2")) {
            System.out.println(animal.getOrder().toString());
        } else if (value.equals("0")) {
            start();
        }

    }

    public void getAnimals(){
        System.out.println("Список всех животных");
        for (Animal animal :
                registry.getAnimals()) {
            System.out.println(animal);
        }
    }

    public void startCreateAnimal(){
        System.out.println("Введите кличку животного:");
        String name = consoleReader.getLine();
        System.out.println("Дату рождения в формате 'yyyy-MM-dd' :");
        String birthday = consoleReader.getLine();
        createAnimal(name, birthday);
    }

    public void createAnimal(String name, String birthday){
        while (true){
            System.out.println("Выберите тип животного:" +
                    "\n1: Кот\n2: Собака\n3: Хомяк\n4: Лошадь\n0: Вернуться в меню");

            String value = consoleReader.getLine();

            if (value.equals("1")){
                endCreateAnimal("cat", name, birthday);
                break;
            } else if (value.equals("2")) {
                endCreateAnimal("dog", name, birthday);
                break;
            } else if (value.equals("3")) {
                endCreateAnimal("hamster", name, birthday);
                break;
            } else if (value.equals("4")) {
                endCreateAnimal("horse", name, birthday);
                break;
            } else if (value.equals("0")) {
                start();
                break;
            }
        }
    }

    public void endCreateAnimal(String type, String name, String birthday){
        Animal animal = AnimalFactory.createAnimal(type, name, AnimalBirthday.parsDate(birthday), new ArrayList<>());
        System.out.println("Введенные данные:");
        System.out.println(animal);
        System.out.println("Хотите сохранить y/n?");
        String value = consoleReader.getLine();

        if (value.equals("y")){
            registry.setAnimal(animal);
            System.out.println("Успешное сохранение");
            new CounterController().add();
        }
        start();
    }

    private void mainMenu(){
        System.out.println("Выберите пункт меню:");
        System.out.println("1: Добавить животное");
        System.out.println("2: Список всех животных");
        System.out.println("3: Найти животное");
        System.out.println("0: Выход");
    }

}
