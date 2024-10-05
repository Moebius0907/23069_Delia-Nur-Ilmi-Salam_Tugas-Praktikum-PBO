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
class Admin extends Person{
    private String password;

    public Admin(String name, String password) {
        super(name);  // Meneruskan ke superclass (Person)
        this.password = password;
    }

    public void addRoom(Hotel hotel, Room room) {
        hotel.addRoom(room);
        System.out.println("Admin " + name + " menambahkan kamar " + room.getRoomNumber());
    }
    
     public boolean authenticate(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }
}
