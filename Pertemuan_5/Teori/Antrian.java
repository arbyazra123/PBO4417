public class Antrian extends Penyakit {
    private String namaPelanggan;
    private boolean muntah;

    public Antrian(String namaPelanggan, boolean muntah) {
        this.namaPelanggan = namaPelanggan;
        this.muntah = muntah;

    }

    public String keluhan() {
        return this.diagnosa(this.muntah);
    }

    public String getName() {
        return this.namaPelanggan;
    }

}

class Penyakit {
    protected String namaRumahSakit = "UDINUS HEALTH CENTER";

    public String diagnosa(boolean muntah) {
        return muntah ? "Pasien ini kena demam" : "Pasien ini kena cacar";
    }
}