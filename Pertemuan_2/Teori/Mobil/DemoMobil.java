public class DemoMobil {
    public static void main(String[] args){
        Mobil2 mob = new Mobil2(
            1,
            false
        );
        mob.toString();
        mob.hidupkan();
        mob.gantiGigi(2);
        mob.toString();
        mob.matikan();
        mob.gantiGigi(1);
        mob.toString();
    }
}

class Mobil2 {
    private int gigi;
    private boolean hidup;

    Mobil2() {
    };

    Mobil2(int gigi, boolean hidup) {
        this.gigi = gigi;
        this.hidup = hidup;
    };

    public void hidupkan() {
        this.hidup = true;
        System.out.println("Mobilnya hidup, brummm!");
    }
    public void matikan() {
        this.hidup = false;
        System.out.println("Mobilnya mati, sssstt!");
    }

    public void gantiGigi(int gigi) {
        this.gigi = gigi;
        System.out.println("Ganti gigi ke "+gigi+", ngengg!");
    }

    @Override
    public String toString() {
        System.out.println("Mobil hidup : "+this.hidup);
        System.out.println("Mobil gigi : "+this.gigi);
        return super.toString();
    }
}