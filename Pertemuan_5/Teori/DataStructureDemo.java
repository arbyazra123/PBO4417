import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.*;
import java.util.Queue;

public class DataStructureDemo {
    public static void main(String[] args) {
        DataStructureDemo ds = new DataStructureDemo();
        System.out.println("Contoh Implmentasi ArrayList: ");
        ds.runArrayList();
        System.out.println("\nContoh Implmentasi Stack : ");
        ds.runStack();
        System.out.println("\nContoh Implmentasi Queue :");
        ds.runQueue();
    }

    public void runArrayList() {
        ArrayList<Mamalia> mamalias = new ArrayList<Mamalia>();
        mamalias.add(new Mamalia("Singa", "Wrauuuuuuuuu!", false, true, true));
        mamalias.add(new Mamalia("Kelelawar", "Krak krak krak!", true, false, false));
        mamalias.add(new Mamalia("Kambing", "Mbekk!", false, true, false));
        System.out.println(mamalias);
        for (int i = 0; i < mamalias.size(); i++) {
            Mamalia item = mamalias.get(i);
            item.introducing();
        }
    }

    public void runLinkedList() {
        LinkedList<Buku> books = new LinkedList<Buku>();
        books.add(new Buku(
            "The Witcher 3",
            4
        ));
        books.add(new Buku(
            "Dunia Sophie",
            2
        ));
        books.add(new Buku(
            "Sapiens",
            1
        ));
        System.out.println(books);
        Buku fb = books.getFirst();
        Buku lb = books.getLast();
        System.out.println("Buku pertama : "+fb.petunjuk());
        System.out.println("Buku terakhir : "+lb.petunjuk());
    }

    public void runQueue(){
        Queue<Antrian> antrians = new LinkedList<Antrian>();
        antrians.add(new Antrian(
            "Arby",
            true
        ));
        antrians.add(new Antrian(
            "Davi",
            true
        ));
        antrians.add(new Antrian(
            "Ilham",
            true
        ));
        antrians.add(new Antrian(
            "Candra",
            true
        ));
        System.out.println("Jumlah antrian "
                           + antrians);
        Antrian terhapus = antrians.remove();
        System.out.println("Antrian yang dihapus-"
                           + terhapus.getName());
        System.out.println(antrians);
        Antrian head = antrians.peek();
        System.out.println("Antrian paling awal-"
                           + head.getName());
  
    }
    
    public void runStack(){
        Stack<Buku> stack = new Stack<Buku>();
  
        StackBuku.stack_push(stack);
        StackBuku.stack_pop(stack);
        StackBuku.stack_push(stack);
        StackBuku.stack_peek(stack);
    }
}
