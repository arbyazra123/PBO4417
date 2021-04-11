package Transportasi;

/**
 *
 * @author goobe
 */
public class Mobil {
    boolean on;
    int gear;
    
    public Mobil(){
        on = false;
        gear = 1;
    }
    
    public void hidupkanMobil(){
        System.out.println("Mobil dinyalakan, grummpp");;
    }
    
    public void matikanMobil(){
        System.out.println("Mobil dimatikan, zztt");
    }
}