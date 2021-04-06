
public class MotorVehicle extends Vehicle{
    public int sizeOfEngine=1;
    public String licensePlate="H 1 IDN";

    public MotorVehicle(){}
    public MotorVehicle(int sizeEng,String lcPlate){
        this.sizeOfEngine = sizeEng;
        this.licensePlate = lcPlate;
    }

    public int getSizeOfEngine(){
        return this.sizeOfEngine;
    }
    public String  getLicensePlate(){
        return this.licensePlate;
    }

}
