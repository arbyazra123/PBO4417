class Animal {
    public String flying(boolean isFlying) {
        return isFlying ? "Kita bisa terbang looo" : "Ehm, Kita gabisa terbang :(";
    }

    public String has4Foots(boolean has4Foots) {
        return has4Foots ? "Kita punya 4 kakii" : "Kita bukan kaum 4 kaki";
    }

    public String isCarnivore(boolean isCarnivore) {
        return isCarnivore ? "Kita karnivora, hati2 kalian!"
                : "Kita bukan karnivora, karnivora itu hanya untuk hewan jahat!";
    }
}

public class Mamalia extends Animal {
    private String name;
    private String sounds;
    private boolean isFlying;
    private boolean has4Foots;
    private boolean isCarnivore;

    public Mamalia(String name, String sounds, boolean isFlying, boolean has4Foots, boolean isCarnivora) {
        this.name = name;
        this.sounds = sounds;
        this.isFlying = isFlying;
        this.has4Foots = has4Foots;
        this.isCarnivore = isCarnivora;
    }

    public void introducing() {
        System.out.println("Namaku adalah " + name + ", dan saya Mamalia, " + sounds + this.flying(isFlying) + ", "
                + this.has4Foots(has4Foots) + ", " + this.isCarnivore(isCarnivore) + ".");

    }
}