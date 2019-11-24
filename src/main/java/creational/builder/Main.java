package creational.builder;

import creational.builder.Email;

public class Main {

    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .setGreeting("Hello")
                .setMainText("This is main text")
                .setTitle("About Test").build();

        System.out.println(email);

    }
}
