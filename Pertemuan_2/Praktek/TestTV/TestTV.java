public class TestTV {
    public static void main(String[] args){
        Manusia man1 = new Manusia("Arby Azra");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
    }
}

class Manusia {
    private String nama;
    private boolean punyaTV;

    public Manusia() {
    };

    public Manusia(String name) {
        this.nama = name;
    };

    public String namaSaya(){
        return this.nama;
    }

    public void beliTV(TV tiviku){
        this.punyaTV = true;
    }

    public void jualSemuaTV(){
        this.punyaTV = false;
    }

    public boolean cekTV(){
        return this.punyaTV;
    }
}

class TV {
    boolean on = false;
    int channel = 3;
    int volumeLevel = 7;

    TV() {
        this.on = false;
        this.channel = 2;
        this.volumeLevel = 3;
    }

    void turnOn() {
        this.on = true;
    }

    void turnOff() {
        this.on = false;
    }

    void setChannel(int newChannel) {
        checkWhetherInputIsInRange(newChannel, true);
        this.channel = newChannel;
    }

    void setVolume(int newVolumeLevel) {
        checkWhetherInputIsInRange(newVolumeLevel, false);
        this.volumeLevel = newVolumeLevel;
    }

    void volumeUp() {
        checkWhetherInputIsInRange(volumeLevel, false);
        this.volumeLevel += 1;
    }

    void volumeDown() {
        checkWhetherInputIsInRange(volumeLevel, false);
        this.volumeLevel -= 1;
    }

    void channelUp() {
        checkWhetherInputIsInRange(channel, true);
        this.channel += 1;
    }

    void channelDown() {
        checkWhetherInputIsInRange(channel, true);
        this.channel -= 1;
    }

    void checkWhetherInputIsInRange(int value, boolean isChannel) {
        if (isChannel == true) {
            if (value > 120 || value < 1) {
                System.out.println("Channel tidak valid, program selesai");
                System.exit(0);
            }
        } else {
            if (value > 7 || value < 1) {
                System.out.println("Volume tidak valid, program selesai");
                System.exit(0);
            }
        }

    }
}