import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;
    @Before
    public void before(){
        bus = new Bus("Glasgow", 5);
        person = new Person();
        busStop = new BusStop("Glasow Bus Stop");
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void canAddPassenger(){
        assertEquals(4, bus.getPassengerCount());
    }

    @Test
    public void canAddPassengerIfCapacityAllows(){
        assertEquals(4,bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.removePassenger(person);
        assertEquals(3,bus.getPassengerCount());
    }

    @Test
    public void canTakePersonFromQueueAndAddToBus(){
        bus.addPassengersFromQueue(busStop, person);
        assertEquals(5, bus.getPassengerCount());
    }

}
