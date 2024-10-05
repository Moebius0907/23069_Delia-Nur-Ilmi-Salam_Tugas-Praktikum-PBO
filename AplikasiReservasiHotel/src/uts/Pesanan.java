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
public class Pesanan {
    private String customerName;
    private Room room;

    public Pesanan(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
    }

    public void displayDetailPesanan() {
        System.out.println("Nama Customer: " + customerName);
        System.out.println("Kamar: " + room.getRoomNumber() + " - " + room.getRoomType());
    }
}
