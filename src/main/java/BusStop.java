import java.util.ArrayList;

public class BusStop {
    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int personCount() {
        return this.queue.size();
    }

    public void addPerson(Person person1) {
        this.queue.add(person1);
    }

    public void removePerson() {
        this.queue.remove(0);
    }
}
