/**
 * This Class Demonstrates teh implementation of a custom Event Listener
 * <p>
 * Eric J. Feight
 * 4/30/2020
 */

public class EventListenerTest {
    public static void main(String[] args) {

        // Create Event Source
        myEventSource esBob = new myEventSource("Bob");

        // Create Listeners
        myListener elSally = new myListener("Sally");
        myListener elMary = new myListener("Mary");

        // Register Listeners
        esBob.addListener(elSally);
        esBob.addListener(elMary);

        // Trigger an event
        esBob.initiateEvent();

        // Trigger another event
        esBob.initiateEvent();
    }
}
