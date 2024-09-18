/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author delia
 */
public class GeometriMain {
    
    //Method untuk menghitung dan menampilkan volume dan luas permukaan dari bangunRuang yang diberikan
    public static void hitungGeometri(String NamaBangunGeometri, Geometri bangunGeometri) {
        System.out.println(NamaBangunGeometri);
        System.out.println("Volume: " + bangunGeometri.volume());
        System.out.println("Luas Permukaan: " + bangunGeometri.luasPermukaan());
    }

    public static void main(String[] args) {
        Balok balok1 = new Balok(5, 1, 2);
        Kubus kubus1 = new Kubus(2);

        
        hitungGeometri("Balok",balok1);
        System.out.println();
        hitungGeometri("Kubus",kubus1);
    }
    
}
