package com.testing;

public class Hello {
    public static void main(String[] args) {
        Greetings gr = new Greetings();
        StringBuilder greetingBuilder = new StringBuilder();
        greetingBuilder.append(gr.getRandomGreeting());
        greetingBuilder.append(" ");
        greetingBuilder.append(args[0]);
        greetingBuilder.append("!");
        System.out.println(greetingBuilder.toString());
    }
}
