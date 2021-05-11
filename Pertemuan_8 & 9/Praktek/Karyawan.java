public class Karyawan extends User{
    public int id;
    public String name;
    public int birthYear;
    public String alamat;

    public Karyawan(){
        
        
        this.id = 0;
        this.name = "Arby Azyumardi Azra";
        this.birthYear = 2001;
        this.alamat = "Tegal";
        
    }

    public Karyawan(int id,String name, int birthYear,String alamat){
        super(id,name,birthYear,alamat);
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.alamat = alamat;
    };

    
}
