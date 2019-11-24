package creational.singleton;

public class Main {

    public static void main(String[] args) {
        Email email = Email.getInstance();
        System.out.println(email.getMailSignature());
    }
}
