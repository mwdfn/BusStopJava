import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getBusStopName() {
        return name;
    }

    public int getQueueLength() {
        return queue.size();
    }

    public void addPersonToQueue(Person person) {
        queue.add(person);
    }

    public void removePersonFromQueue(Person person) {
        queue.remove(person);
    }
}
