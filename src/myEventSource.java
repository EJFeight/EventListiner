import java.util.ArrayList;
import java.util.Random;

/**
 * This class is used to instantiate Event Source Objects
 * Event Source Objects must create a collection to hold myListener Objects
 * <p>
 * Eric J. Feight
 * 4/30/2020
 */

public class myEventSource {

    // Member Variables
    private String strEventSourceName = null;
    private Random randomGenerator = new Random();
    private int intEventSourceData = 0;

    // Event Initiator Constructor
    public myEventSource(String sourceName) {
        this.strEventSourceName = sourceName;
    }

    // Create Collection to hold Event Listeners
    ArrayList<myEventListener> listeners = new ArrayList<>();

    // Add Listener Method
    public void addListener(myEventListener listener) {
        listeners.add(listener);
    }

    // Event Method
    // This is the actual Event
    public void initiateEvent() {
        intEventSourceData = randomGenerator.nextInt(100);
        System.out.println("\n" + strEventSourceName + " has triggered an event with a value of: " +
                intEventSourceData);

        // Notify all Registered Listeners
        for (myEventListener l : listeners)
            l.myEventNotification(strEventSourceName, intEventSourceData);
    }
}
