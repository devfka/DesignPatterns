package creational.singleton;

public class Email {

    private volatile static Email onlyInstance;

    private Email() {
    }

    public String getMailSignature() {
        return "This is mail signature..";
    }

    // Create a static method for object creation
    synchronized public static Email getInstance() {

        // Only instantiate the object when needed.
        /*if (onlyInstance == null) {
            onlyInstance = new Email();
        }*/

       //Thready Safe and double checked locking
        if (onlyInstance == null) {
            synchronized (Email.class) {
                if (onlyInstance == null) {
                    onlyInstance = new Email();
                }
            }
        }

        return onlyInstance;
    }
}


