public class DemoMatematika {
    public static void main(String[] args){
        Matematika mat = new Matematika();
        mat.pertambahan(20, 20);
        mat.pengurangan(10, 5);
        mat.perkalian(10, 20);
        mat.pembagian(20, 2);
    }
}


class Matematika{
    public void pertambahan(int a,int b){
        int r = a+b;
        System.out.println("Pertambahan : "+a+" + "+b+" = "+r);
    }
    public void pengurangan(int a,int b){
        int r = a-b;
        System.out.println("Pengurangan : "+a+" - "+b+" = "+r);
    }
    public void perkalian(int a,int b){
        int r = a*b;
        System.out.println("Perkalian : "+a+" * "+b+" = "+r);
    }
    public void pembagian(int a,int b){
        int r = a/b;
        System.out.println("Pembagian : "+a+" / "+b+" = "+r);
    }

}