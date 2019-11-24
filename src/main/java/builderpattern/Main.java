package builderpattern;

public class Main {

    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .setGreeting("Hello")
                .setMainText("This is main text")
                .setTitle("About Test").build();

    }
}