/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainClass {

    private static int Menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("           Menu Utama            ");
        System.out.println("---------------------------------");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Keluar");
        System.out.println("---------------------------------");
        System.out.print("Pilihan Anda? ");
        return input.nextInt();
    }

    private static int MenuAdmin() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("           Menu Admin            ");
        System.out.println("---------------------------------");
        System.out.println("1. Tambah Kamar");
        System.out.println("2. Tampilkan Kamar Tersedia");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        System.out.println("---------------------------------");
        System.out.print("Pilihan Anda? ");
        return input.nextInt();
    }

    private static int MenuCust() {

        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("           Menu Customer            ");
        System.out.println("------------------------------------");
        System.out.println("1. Tampilkan Kamar Tersedia");
        System.out.println("2. Pesan Kamar ");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        System.out.println("---------------------------------");
        System.out.print("Pilihan Anda? ");
        return input.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Admin admin = new Admin("Admin1", "admin123");
        Customer customer = new Customer("Customer1");

        Scanner input = new Scanner(System.in);
        int orderId = 0;

        // Main menu loop
        int menu = Menu();
        while (menu != 3) {
            switch (menu) {
                case 1:
                    System.out.print("Masukan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukan Password: ");
                    String password = scanner.nextLine();
                     if (admin.authenticate(name, password)) {
                        int AdminMenu = MenuAdmin();
                        while (AdminMenu != 3) {
                            switch (AdminMenu) {
                                case 1:
                                    System.out.println("1.1 Tambah Kamar");
                                    System.out.print("Nomor Kamar: ");
                                    String roomNumber = scanner.nextLine();
                                    System.out.print("Tipe Kamar: ");
                                    String roomType = scanner.nextLine();
                                    Room room = new Room(roomNumber, roomType);
                                    admin.addRoom(hotel, room);
                                    break;

                                case 2:
                                    System.out.println("1.2 Tampilkan Kamar tersedia");
                                    hotel.displayAvailableRooms();
                                    break;

                                case 3:
                                    System.out.println("Terima kasih admin");
                                    break;
                            }
                            AdminMenu = MenuAdmin();
                        }
                        break;

                    } else {
                        System.out.println("Nama dan password salah");
                        menu = Menu();
                    }
                    break;

                case 2:
                    System.out.print("Masukan Nama: ");
                    String nameCust = scanner.nextLine();
                    Customer customer1 = new Customer(nameCust);
                    int CustMenu = MenuCust();
                    while (CustMenu != 3) {
                        switch (CustMenu) {

                            case 1:
                                System.out.println("2.1 Tampilkan Kamar tersedia");
                                hotel.displayAvailableRooms();
                                break;

                            case 2:  // Pesan Kamar
                                System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                                String roomToBook = scanner.nextLine();
                                customer1.bookRoom(hotel, roomToBook);
                                break;

                            case 3:
                                System.out.println("Terima kasih Customer");
                                break;
                        }
                        CustMenu = MenuCust();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu Pilihan Salah");
                    break;
            }
            menu = Menu();
        }
        System.out.println("Terima kasih telah menggunakan Aplikasi saya");
    }

}
