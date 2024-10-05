/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Hotel {
    private ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayAvailableRooms() {
        System.out.println("Daftar kamar yang tersedia:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Kamar " + room.getRoomNumber() + " - " + room.getRoomType());
            }
        }
    }

    public Room getRoomByNumber(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null;
    }
}
