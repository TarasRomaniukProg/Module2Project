package org.example;

import org.example.entities.Island;
import org.example.game.Render;
import org.example.game.Runner;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(100,20);
        Runner runner = new Runner(island);
        Render render = new Render(island);
        runner.initialise();

        String field = render.render();

        System.out.println(field);

        runner.run();
    }
}