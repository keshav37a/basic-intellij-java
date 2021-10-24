package com.testing;

import java.util.Random;

public class Greetings {
    String [] greetings = {"hello", "hola", "Namaste"};
    Random r = new Random();

    String getRandomGreeting(){
        String gr = greetings[r.nextInt(3)];
        return gr;
    }
}
