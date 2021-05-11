import java.util.ArrayList;

public class Transaction {
    public long id;
    public String dateCreated;
    public int jumlahMobil;
    public int idMobil;
    public int idKaryawan;
    public int idPembeli;

    public Transaction(long id, String dateCreated, int jumlahMobil,int idMobil, int idKaryawan,int idPembeli){
        this.id = id;
        this.dateCreated = dateCreated;
        this.jumlahMobil = jumlahMobil;
        this.idMobil = idMobil;
        this.idKaryawan = idKaryawan;
        this.idPembeli = idPembeli;
    }

    

    public Pembeli getPembeli(ArrayList<Pembeli> data){
        for(Pembeli pembeli : data){
            if(pembeli.id==idPembeli){
                return pembeli;
            }
        }
        return null;
    }

    public Mobil getInfoMobil(ArrayList<Mobil> data){
        for(Mobil mobil : data){
            if(mobil.id==idMobil){
                return mobil;
            }
        }
        return null;
    }

    public Karyawan getKaryawan(ArrayList<Karyawan> data){
        for(Karyawan karywan : data){
            if(karywan.id==idKaryawan){
                return karywan;
            }
        }
        return null;
    }

    public double totalPrice(ArrayList<Mobil> data){
        Mobil mobil = getInfoMobil(data);
        return jumlahMobil * mobil.price * 0.10;
    }

}
