package com.company;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();

        Clock clock1 = new Clock(generator.nextInt(24), generator.nextInt(60));
        Clock clock2 = new Clock(generator.nextInt(24), generator.nextInt(60));
        Clock clock3 = new Clock(generator.nextInt(24), generator.nextInt(60));
        Clock clock4 = new Clock(generator.nextInt(24), generator.nextInt(60));
        Clock clock5 = new Clock(generator.nextInt(24), generator.nextInt(60));
        Clock clock6 = new Clock(generator.nextInt(24), generator.nextInt(60));
        Clock clock7 = new Clock(23, 59);


        LinkedList<Clock> clocks = new LinkedList<>();
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);
        clocks.add(clock5);
        clocks.add(clock6);
        clocks.add(clock7);


        for (Clock clock : clocks) {
            System.out.println(clock);
            clock.addOneMinute();
            System.out.println(clock);
            System.out.println("================");

        }
    }
}
