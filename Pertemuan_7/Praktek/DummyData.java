import java.util.ArrayList;

public class DummyData {
    public ArrayList<Mobil> seedMobil() {
        ArrayList<Mobil> dataMobil = new ArrayList<Mobil>();
        Mobil mob = new Mobil(102, "Mustang GT", "Black", 6.5, 3.4, 2.1, 100, 10000000,"sedan");
        dataMobil.add(mob);
        mob = new Mobil(101, "Isuzu Elf NLR-55", "Silver", 10.5, 3.4, 3.5, 5, 50000000,"minibus");
        dataMobil.add(mob);
        mob = new Mobil(105, "Bugatti Veyron", "Red - Black", 8.5, 3.1, 2.23, 2, 90000000,"bus");
        dataMobil.add(mob);
        return dataMobil;
    }

    public ArrayList<Karyawan> seedKaryawan() {
        ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
        Karyawan mob = new Karyawan(1, "Arby Azyumardi Azra", 2001, "Tegal");
        dataKaryawan.add(mob);
        mob = new Karyawan(2, "Mardi Lardi", 1995, "Pemalang");
        dataKaryawan.add(mob);
        mob = new Karyawan(3, "Darbi Budiawan", 1999, "Jakarta");
        dataKaryawan.add(mob);
        return dataKaryawan;
    }
    
}