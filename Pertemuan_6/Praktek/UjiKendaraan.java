public class UjiKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        Bicycle b = new Bicycle();
        MotorVehicle c = new MotorVehicle();
        MotorCycle d =new MotorCycle();
        Car e = new Car();
        
        a.goStraight();
        b.ringBell();
        System.out.println(c.licencePlate);;
        System.out.println(d.sizeofEngine);
        System.out.println(e.getSeatBelt());
        
    }
    
}