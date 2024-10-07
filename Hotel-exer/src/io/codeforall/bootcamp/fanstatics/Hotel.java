package io.codeforall.bootcamp.fanstatics;

public class Hotel {

    private Room[] rooms;
    private String hotelName;
    private int numberOfRooms;
    public Hotel(String hotelName, int numberOfRooms) {
        this.hotelName = hotelName;
        this.numberOfRooms = numberOfRooms;
        this.rooms = createRooms(numberOfRooms);
    }

        private Room[] createRooms(int numberOfRooms){

        rooms = new Room[numberOfRooms];

        for (int i = 0; i < numberOfRooms; i++) {
            rooms[i] = new Room(i);

            return rooms;
        }
    }

    }


