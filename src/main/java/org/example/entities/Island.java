package org.example.entities;


import java.util.Arrays;
import java.util.List;

public class Island {
    private static Location[][] map;
    private static int width;
    private static int height;

    public Island(int width, int height) {
        map = new Location[width][height];
        Island.height = height;
        Island.width = width;
    }

    public static List<Location> getAllLocations() {
        return Arrays.stream(map).flatMap(Arrays::stream).toList();
    }

    public static Location getLocation(int x, int y) {
        return map[x][y];
    }
    public static void setLocation(Location location, int x, int y) {
        map[x][y] = location;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}