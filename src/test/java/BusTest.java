import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

private Bus bus;
private Person person1, person2, person3;

@Before
public void before() {
  bus = new Bus("codeclan", 2);
  person1 = new Person();
  person2 = new Person();
  person3 = new Person();

}

@Test
public void busStartsEmpty() {

  assertEquals(0, bus.personCount());
}

  @Test
  public void addPerson() {
    bus.addPerson(person1);
    assertEquals(1, bus.personCount());
  }

  @Test
  public void addTooManyPersons() {
    bus.addPerson(person1);
    bus.addPerson(person2);
    bus.addPerson(person3);
    assertEquals(2, bus.personCount());
  }

  @Test
  public void removePerson() {
    bus.addPerson(person1);
    bus.addPerson(person2);
    bus.removePerson();
    assertEquals(1, bus.personCount());
  }

}
