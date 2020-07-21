import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

private Bus bus;
private Person person1, person2;

@Before
public void before() {
  bus = new Bus("codeclan", 3);
  person1 = new Person();
  person2 = new Person();

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

}
