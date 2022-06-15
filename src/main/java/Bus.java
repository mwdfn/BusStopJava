import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPassenger(Person person){
        if(passengers.size() < capacity){
            passengers.add(person);
        }
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void removePassenger(Person person) {
        passengers.remove(person);
    }

    public void addPassengersFromQueue(BusStop busStop,Person person){
        busStop.removePersonFromQueue(person);
        passengers.add(person);
//        if(passengers.size() < capacity){
    }

//    public void eatFishFromRiver(River river) {
//        Salmon salmon = river.removeFish();
//        belly.add(salmon);
//    }
}
