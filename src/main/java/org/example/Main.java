package org.example;

import org.example.entities.Island;
import org.example.game.Render;
import org.example.game.Runner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        new Island(100,20);
        Runner.initialise();
        String field = Render.render();

        System.out.println(field);

        Runner.run();
    }
}