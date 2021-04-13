public class MotorVehicle extends Vehicle{
    public int sizeofEngine = 1;
    public String licencePlate = "H 1 IDN";
    
    public MotorVehicle(){}
    public MotorVehicle(int sizeEng, String lcPlate){
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }
    
    public int getSizeOfEngine(){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}