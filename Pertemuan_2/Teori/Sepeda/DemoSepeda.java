public class DemoSepeda {
    public static void main(String[] args){
        Sepeda sp = new Sepeda(
            "Merah",
            "Polygon",
            false
        );
        sp.toString();
        sp.naikAh(true);
        sp.toString();
        sp.genjot();
        sp.rem();
    }
}

class Sepeda {
    private String warna;
    private String merk;
    private boolean naik;

    public Sepeda() {
    };

    public Sepeda(String warna, String merk, boolean naik) {
        this.warna = warna;
        this.merk = merk;
        this.naik = naik;
    };

    public void naikAh(boolean naik){
        this.naik = naik;
    }

    public String warna(){
        return this.warna;
    }

    public String merk(){
        return this.merk;
    }

    public boolean apakahSayaNaik() {
        return this.naik;
    }

    public void genjot() {
        System.out.println("Sepedanya jalan, ngeeengg!");
    }

    public void rem() {
        System.out.println("Sepedanya berhenti, citttt!");
    }

    @Override
    public String toString() {
        System.out.println("Warnanya : "+this.warna);
        System.out.println("Merknya : "+this.merk);
        System.out.println("Apakah saya naik? : "+apakahSayaNaik());
        return super.toString();
    }
}