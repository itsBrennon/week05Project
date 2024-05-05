//Create an interface named Logger
// Add two void methods to the Logger interface, each should take a String as an argument
interface Logger {
    void log(String message);
    void error(String message);
}
//Create two classes that implement the Logger interface(AsteriskLogger/ SpacedLogger)
//Implemented the AsteriskLogger methods
class AsteriskLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
}


//Implement the SpacedLogger methods
class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            spacedMessage.append(c).append(" ");
        }
        System.out.println(spacedMessage.toString().trim());
    }

    @Override
    public void error(String message) {
        System.out.print("ERROR: ");
        log(message);
    }
}

//Create a class named App that has a main method
public class App {
    public static void main(String[] args) {
        // Instantiate loggers
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test methods
        asteriskLogger.log("Hello from AsteriskLogger!");
        asteriskLogger.error("Something went wrong with AsteriskLogger.");

        spacedLogger.log("Hello from SpacedLogger!");
        spacedLogger.error("Another error occurred with SpacedLogger.");
    }
}

