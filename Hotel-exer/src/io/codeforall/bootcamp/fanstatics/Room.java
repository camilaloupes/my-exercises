package io.codeforall.bootcamp.fanstatics;

import java.util.NavigableMap;

public class Room {

    private int roomNumber;
    private boolean availability;

    public Room(int number) {
        this.roomNumber = number;
        this.availability = true;
    }

    public int isAvailability() {
        if (availability) return roomNumber;
        else System.out.println("No rooms available.");
        return 0;
    }
}