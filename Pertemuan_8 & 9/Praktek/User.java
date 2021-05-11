public abstract class User {
    int id;
    String name;
    int birthYear;
    String alamat;
    User(){}
    User(int id,String name, int birthYear,String alamat){
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.alamat = alamat;
    };

    public int calculateAge(){
        return 2021-this.birthYear;
    }


    public int calculateAge(int birthyear){
        return 2021-birthyear;
    }
    
    public void info(){
        System.out.println("ID\t: "+id);
        System.out.println("Name\t: "+id);
        System.out.println("BirthYear\t: "+id);
        System.out.println("Age\t: "+calculateAge());
        System.out.println("Alamat\t: "+alamat);
    }
}