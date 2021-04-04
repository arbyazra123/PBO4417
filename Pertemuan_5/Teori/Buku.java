public class Buku extends Library {
    private String nama;
    private int nomorRak;

    public Buku(String nama, int nomorRak) {
        this.nama = nama;
        this.nomorRak = nomorRak;
    }

    public String getNama(){
        return this.nama;
    }

    public String petunjuk() {
        return this.rak(this.nomorRak, this.nama);
    }

    
}

class Library {
    protected String name = "DINUS LIBRARY";

    public String rak(int nomorRak, String namaBuku) {
        return "Buku " + namaBuku + " dalam rak nomor " + nomorRak;
    }
}
