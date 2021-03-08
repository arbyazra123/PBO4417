
public class MainTV{

    public static void main(String[] args){

        TV tvku = new TV();
        System.out.println("status TV : "+(tvku.on?"Nyala":"Mati"));
        tvku.turnOn();
        System.out.println("status TV : "+(tvku.on?"Nyala":"Mati"));

        tvku.setChannel(20);
        tvku.channelUp();
        tvku.channelUp();
        tvku.channelDown();
        System.out.println("channel TV : "+tvku.channel);

        tvku.setVolume(4);
        tvku.volumeUp();
        tvku.volumeUp();
        tvku.volumeDown();
        System.out.println("volume TV : "+tvku.volumeLevel);

        tvku.setVolume(10);
        System.out.println("volume TV : "+tvku.volumeLevel);

    }
}

class TV {
    boolean on=false;
    int channel=3;
    int volumeLevel = 7;

    TV() {
        this.on = false;
        this.channel = 2;
        this.volumeLevel = 3;
    } 

    void turnOn(){
        this.on=true;
    }
    void turnOff(){
        this.on=false;
    }
    void setChannel(int newChannel){
        checkWhetherInputIsInRange(newChannel,true);
        this.channel = newChannel;
    }
    void setVolume(int newVolumeLevel){
        checkWhetherInputIsInRange(newVolumeLevel,false);
        this.volumeLevel = newVolumeLevel;
    }
    void volumeUp(){
        checkWhetherInputIsInRange(volumeLevel,false);
        this.volumeLevel+=1;
    }
    void volumeDown(){
        checkWhetherInputIsInRange(volumeLevel,false);
        this.volumeLevel-=1;
    }
    void channelUp(){
        checkWhetherInputIsInRange(channel,true);
        this.channel+=1;
    }
    void channelDown(){
        checkWhetherInputIsInRange(channel,true);
        this.channel-=1;
    }

    void checkWhetherInputIsInRange(int value,boolean isChannel){
        if(isChannel==true){
            if(value>120||value<1){
                System.out.println("Channel tidak valid, program selesai");
                System.exit(0);
            }
        } else {
            if(value>7||value<1){
                System.out.println("Volume tidak valid, program selesai");
                System.exit(0);
            }
        }
        
    }
}
