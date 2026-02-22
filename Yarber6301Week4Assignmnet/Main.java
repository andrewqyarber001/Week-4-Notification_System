/**
 * Main class to demonstrate the use of NotificationMedium interface and its implementations.
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public class Main {

    /**
     * The main method to demonstrate the functionality of the AlertSystem with different notification mediums (EmailService and SMSService).
     * @param args Command-line arguments (not used in this demonstration).
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();

        // Set the notification medium to EmailService and send a notification
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("This is an email notification.");

        // Set the notification medium to SMSService and send a notification
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("This is an SMS notification.");

        // Demonstrate retrieving from the collection
        System.out.println("\n--- Notification History ---");
        for (String log : alertSystem.getHistory()) {
            System.out.println("Logged: " + log);
}
    }   
}

// Gemini 3.0 was consulted for the best way to map out these files.
// Gemini recomended to use 5 seperate files as to not create a "GOD File"
// Gemini was also used to find typos and inconsistencies
// Code completions within VS Code were alse used to speed up/help with the coding process.