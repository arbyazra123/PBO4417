public class DemoBuku {
    public static void main(String[] args){
        Buku bu1 = new Buku(
            "PBO",
            "Indra",
            "Elex",
            "2007"
        );
        bu1.toString();
        bu1 = new Buku(
            "Java",
            "Ajib",
            "Andi",
            "2007"
        );
        bu1.toString();
    }
}

class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;

    public Buku() {
    };

    public Buku(String judul, String pengarang, String penerbit, String tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    };

    @Override
    public String toString() {
        System.out.println("Judul\t : "+this.judul);
        System.out.println("Pengarang\t : "+this.pengarang);
        System.out.println("Penerbit\t : "+this.penerbit);
        System.out.println("Tahun\t : "+this.tahun);
        return super.toString();
    }
}