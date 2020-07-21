import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop stop;
    private Bus bus;
    private Person person1, person2, person3;

    @Before
    public void before() {
        stop = new BusStop("codeclan stop");
        bus = new Bus("codeclan", 2);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        stop.addPerson(person1);
        stop.addPerson(person2);
        stop.addPerson(person3);
    }

    @Test
    public void addPerson() {
        stop.addPerson(person1);
        assertEquals(4, stop.personCount());
    }

    @Test
    public void removePerson() {
        stop.addPerson(person1);
        stop.removePerson();
        assertEquals(3, stop.personCount());
    }
}
