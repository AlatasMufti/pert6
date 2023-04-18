package Baru;

import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {

    public static void main(String[]args ) {

        Mobil mobilnya = new Mobil();
        Bicycle bicyclenya = new Bicycle();

        mobilnya.merk();
        mobilnya.warna();
        mobilnya.tahun_pembuatan();

        System.out.println(mobilnya);

        bicyclenya.jenis();
        bicyclenya.warna();
        bicyclenya.roda();

        System.out.println(bicyclenya);

    }
    
}
