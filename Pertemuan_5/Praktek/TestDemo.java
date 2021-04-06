public class TestDemo {
    public static void main(String[] args){
        MotorVehicle m = new MotorVehicle(6,"A 12 BY");
        System.out.println("Jumlah Mesin Motor : "+m.getSizeOfEngine());
        System.out.println("Plat Nomor Motor : "+m.getLicensePlate());
        
        System.out.println("Motornya ");
        m.goStraight();
        m.turnLeft();
        m.turnRight();

        System.out.println('\n');

        Bicycle b = new Bicycle();
        b.ringBell();
        System.out.println("Sepedanya ");
        b.goStraight();
        b.turnLeft();
        b.turnRight();

    }
}
