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

    public List<Location> getAllLocations() {
        return Arrays.stream(map).flatMap(Arrays::stream).toList();
    }

    public Location getLocation(int x, int y) {
        return map[x][y];
    }
    public void setLocation(Location location, int x, int y) {
        map[x][y] = location;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}