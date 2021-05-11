
public class Mobil extends MobilHelper{
    public int id;
    public String name;
    public String color;
    public double width;
    public double height;
    public double high;
    public long price;
    public int stok;
    public String type;

    public Mobil() {
        this.id = 0;
        this.name = "Mustang GT";
        this.color = "Black";
        this.width = 6.5;
        this.height = 3.4;
        this.high = 2.1;
        this.stok = 100;
        this.type = "sedan";
        this.price = 900000000;
    }

    public Mobil(int id, String name, String color, double width, double height, double high, int stok,long price,String type) {
        
        this.id = id;
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
        this.high = high;
        this.stok = stok;
        this.price = price;
        this.type = type;
    }

    @Override
    public void introduceCar(Mobil mobil) {
        super.introduceCar(this);
    }
}