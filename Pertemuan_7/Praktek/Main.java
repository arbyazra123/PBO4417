import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        //Memberikan data dummy ke initial app
        DummyData dummyData = new DummyData();


        ArrayList<Karyawan> dKaryawans = dummyData.seedKaryawan();
        ArrayList<Mobil> dMobils = dummyData.seedMobil();
        ArrayList<Transaction> transactions = new ArrayList<>();

        //Menampilkan text selamat datang dan bantuan
        System.out.println("Selamat datang di sistem HARPINDO KITA\nSolusi beli mobil impian murah dan terpercaya");
        main.showHelp();

        Scanner scanner = new Scanner(System.in);
        while (true) {

            int command = scanner.nextInt();
            if (command == 0) {
                break;
            } else if (command == 1) {
                main.showHelp();
            } else if (command == 2) {
                Karyawan karyawan = main.insertNewStaff();
                dKaryawans.add(karyawan);
                System.out.println();
                main.showKaryawan(dKaryawans);
                System.out.println();
                main.showHelp();
            } else if (command == 3) {
                Transaction createdTransaction = main.createTransaction(dMobils);
                transactions.add(createdTransaction);
                System.out.println();
                main.historyTransaction(transactions,dMobils);
                System.out.println();
                main.showHelp();
            } else if (command == 4) {
                main.historyTransaction(transactions,dMobils);
                System.out.println();
                main.showHelp();
            } else if (command == 5) {
                main.changeCarPrice(dMobils);
                System.out.println("SUKSES MENGUBAH");
                main.showAvailableCars(dMobils);
                System.out.println();
                main.showHelp();
            } else {
                scanner.close();
            }
        }
    }

    //Mencetak History Transaksi
    public void historyTransaction(ArrayList<Transaction> transaction,ArrayList<Mobil> dMobils) {
        System.out.println("HISTORY TRANSAKSI");
        if (transaction.size() == 0) {
            System.out.println("Transaksi Kosong");
            return;
        }
        for (Transaction t : transaction) {
            System.out.println("--------");
            System.out.println("ID : " + t.id);
            System.out.println("Tanggal Transaksi : " + t.dateCreated);
            System.out.println("ID Mobil : " + t.idMobil);
            System.out.println("ID Karyawan : " + t.idKaryawan);
            System.out.println("ID Pembeli : " + t.idPembeli);
            System.out.println("Total Bayar : Rp." + t.totalPrice(dMobils));
            System.out.println("--------");
        }
    }

    //Memperlihatkan Karyawan dalam Toko
    public void showKaryawan(ArrayList<Karyawan> karyawans) {
        System.out.println("DAFTAR KARYAWAN");
        for (Karyawan k : karyawans) {
            System.out.println("--------");
            System.out.println("ID : " + k.id);
            System.out.println("Name : " + k.name);
            System.out.println("BirthYear : " + k.birthYear);
            System.out.println("Age : " + k.calculateAge(k.birthYear));
            System.out.println("--------");
        }
    }

    //Mengubah harga mobil
    public void changeCarPrice(ArrayList<Mobil> dMobils) {
        Scanner scanner = new Scanner(System.in);

        showAvailableCars(dMobils);

        System.out.println("Pilih ID Mobil yang akan diubah harganya : ");
        String id = scanner.nextLine();
        System.out.println("Ubah Harga : ");
        String harga = scanner.nextLine();
        manipulateCarPrice(dMobils, Integer.parseInt(id), Long.parseLong(harga));
    }

    //Menambah Karyawan Baru
    public Karyawan insertNewStaff() {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        System.out.println("ID : ");
        String id = scanner.nextLine();
        karyawan.id = Integer.parseInt(id);

        System.out.println("Nama Karyawan : ");
        String name = scanner.nextLine();
        karyawan.name = name;

        System.out.println("Tahun Lahir (yyyy) : ");
        String birthYear = scanner.nextLine();
        karyawan.birthYear = Integer.parseInt(birthYear);

        System.out.println("Alamat : ");
        String alamat = scanner.nextLine();
        karyawan.alamat = alamat;
        // scanner.close();
        System.out.println("---SUKSES MENDAFTAR KARYAWAN---");
        return karyawan;
    }

    public void manipulateCarPrice(ArrayList<Mobil> dMobils, int idMobilChanged, long price) {
        for (Mobil mobil : dMobils) {
            if (mobil.id == idMobilChanged) {
                mobil.price = price;
            }
        }
    }

    //Memproses Transaksi
    public Transaction createTransaction(ArrayList<Mobil> dataMobil) {

        Scanner scanner = new Scanner(System.in);
        Pembeli pembeli = new Pembeli();

        System.out.println("ID : ");
        String id = scanner.nextLine();
        pembeli.id = Integer.parseInt(id);

        System.out.println("Nama Pembeli : ");
        String name = scanner.nextLine();
        pembeli.name = name;

        System.out.println("Tahun Lahir (yyyy) : ");
        String birthYear = scanner.nextLine();
        pembeli.birthYear = Integer.parseInt(birthYear);

        System.out.println("Alamat : ");
        String alamat = scanner.nextLine();
        pembeli.alamat = alamat;

        System.out.println("Borongan(Y/N) : ");
        String tipe = scanner.nextLine();
        pembeli.buyerType = tipe.toLowerCase() == "y" ? true : false;

        showAvailableCars(dataMobil);

        System.out.println();
        System.out.println("Pilih ID mobil yang akan dibeli : ");
        String idMobil = scanner.nextLine();
        System.out.println("Isi jumlah mobil yang akan dibeli : ");
        String amountCar = scanner.nextLine();
        System.out.println("Masukan ID Karyawan : ");
        String idKaryawan = scanner.nextLine();

        Date date = new Date();
        String currentDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        Transaction creatdTrans = new Transaction(date.getTime(), currentDate, Integer.parseInt(amountCar),
                Integer.parseInt(idMobil), Integer.parseInt(idKaryawan), Integer.parseInt(id));

        System.out.println("--- SUKSES MEMBELI ---");
        return creatdTrans;
    }

    //Meperlihatkan mobil mobil yang tersedia
    public void showAvailableCars(ArrayList<Mobil> dataMobil) {
        System.out.println("ID\tNama\t\t\tHarga");
        for (Mobil mobil : dataMobil) {
            System.out.println(mobil.id + "\t" + mobil.name + "\t\tRp." + String.valueOf(mobil.price));
        }
    }

    //Mencetak bantuan 
    public void showHelp() {
        System.out.println(
                "Berikut perintahnya :\n1.\tBantuan\n2.\tDaftar Karyawan\n3.\tPembelian\n4. History Transaksi\n5. Ubah harga mobil\n0. Keluar Program");
        System.out.println("Ketik salah satu angka diatas untuk memproses aksi");
    }
}
