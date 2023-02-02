package Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    private int id;
    private String name;
    private List<String> order;
    private Date birthday;

    public Animal(int id, String name, Date birthday, List<String> order) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.order = order;
    }

    public Animal(String name, Date birthday, List<String> order) {
        this(IdGenerator.getId(), name, birthday, order);
    }

    public int getId() {
        return id;
    }

    public List<String> getOrder() {
        return order;
    }

    public void addOrder(String order) {
        this.order.add(order);
    }


    public String toString() {
        return "[" + this.id + "; " + this.name + "; "
                + AnimalBirthday.getDate(this.birthday) + "; " + this.order.toString() + "]";
    }

}
