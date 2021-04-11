import Transportasi.Bicycle;
import Transportasi.Mobil;
/**
 *
 * @author goobe
 */
public class TransportasiDemo {
    public static void main(String[] args){
        Mobil mb = new Mobil();
        Bicycle spd = new Bicycle();
        
        spd.ringBell();
        mb.hidupkanMobil();
        mb.matikanMobil();
    }
}