/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author User
 */
public class Room implements Bookable {

    private String roomNumber;
    private String roomType;
    private boolean isAvailable;

    public Room(String roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;  // Kamar tersedia secara default
    }
    
     @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    @Override
    public void book() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Kamar " + roomNumber + " berhasil dipesan.");
        } else {
            System.out.println("Kamar " + roomNumber + " sudah tidak tersedia.");
        }
    }
}
