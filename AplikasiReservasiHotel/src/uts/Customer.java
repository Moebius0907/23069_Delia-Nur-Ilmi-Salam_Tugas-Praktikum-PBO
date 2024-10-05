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
class Customer extends Person{
    private String name;

    public Customer(String name) {
        super(name);
    }

    public void bookRoom(Hotel hotel, String roomNumber) {
        Room room = hotel.getRoomByNumber(roomNumber);
        if (room != null && room.isAvailable()) {
            room.book();
            Pesanan pesanan = new Pesanan(name, room);
            pesanan.displayDetailPesanan();
        } else {
            System.out.println("Kamar " + roomNumber + " tidak tersedia atau tidak ditemukan.");
        }
    }
}
