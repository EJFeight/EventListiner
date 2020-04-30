/**
 * This class creates Listeners that respond to Events
 * <p>
 * Eric  J. Feight
 * 4/30/2020
 */

public class myListener implements myEventListener {

    // Member Variables
    String strListenerName = null;

    // Constructor Method
    public myListener(String strName) {
        this.strListenerName = strName;
    }

    // Event Notification
    @Override
    public void myEventNotification(String strEventSourceName, int intEventData) {

        // Event Response
        System.out.println(strListenerName + " has been notified of an event generated by " + strEventSourceName +
                " with a value of " + intEventData + ".");
    }
}
