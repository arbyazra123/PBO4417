public abstract class MobilHelper implements MobilInterface{

    public void introduceCar(Mobil mobil){
        System.out.println("Mobil "+mobil.name+" ("+mobil.type+"), dengan warna "+mobil.color+"yang elegan siap untuk menjelajahi nusantara. Dengan body tangguh berdimensi lebar "+mobil.height+",tinggi "+mobil.high+", panjang "+mobil.width+". Dapatkan mobil ini sekarang dengan harga Rp."+mobil.price);
        
    }

    @Override
    public void activateNOS() {
        System.out.println("NOS Activated, BOOSSSTT!");
    }

    @Override
    public void carSound() {
        System.out.println("BRUMMM, machine started");
    }
}
