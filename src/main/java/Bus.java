import java.util.ArrayList;

public class Bus {
    //Destination, Capacity and an initially empty ArrayList passengers of type Person
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int personCount() {
        return this.passengers.size();

    }

    public void addPerson(Person person1) {
        this.passengers.add(person1);
    }
}
