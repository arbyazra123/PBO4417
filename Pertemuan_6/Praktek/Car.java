public class Car extends MotorVehicle{
    boolean seatbelt = false;

    public Car() {}
    
    public void setSeatBelt(boolean seatbelt){
        this.seatbelt = seatbelt;
    }
    public boolean getSeatBelt(){
        return seatbelt;
    }
}