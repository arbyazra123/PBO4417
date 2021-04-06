
public class MotorVehicle extends Vehicle{
    public int sizeOfEngine=1;
    public String licensePlate="H 1 IDN";

    public MotorVehicle(){}
    public MotorVehicle(int sizeOfEngine,String licensePlate){
        this.sizeOfEngine = sizeOfEngine;
        this.licensePlate = licensePlate;
    }

    public int getSizeOfEngine(){
        return this.sizeOfEngine;
    }
    public String  getLicensePlate(){
        return this.licensePlate;
    }

}
