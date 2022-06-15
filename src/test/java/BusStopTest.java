import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    @Before
    public void before(){
        busStop = new BusStop("Glasow Bus Stop");
        busStop.addPersonToQueue(person);
    }

    @Test
    public void busStopHasAName(){
        assertEquals("Glasow Bus Stop", busStop.getBusStopName());
    }

    @Test
    public void canAddPersonToQueue(){
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePerson(){
        busStop.removePersonFromQueue(person);
        assertEquals(0, busStop.getQueueLength());
    }

}
