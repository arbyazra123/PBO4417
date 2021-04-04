import java.io.*;
import java.util.*;

public class StackBuku {

    public static void stack_push(Stack<Buku> stack)
    {
        stack.push(new Buku(
            "The Witcher 3",
            4
        ));
        stack.push(new Buku(
            "Dunia Sophie",
            2
        ));
        stack.push(new Buku(
            "Sapiens",
            1
        ));
    }
      
    public static void stack_pop(Stack<Buku> stack)
    {
        System.out.println("Pop Operation:");
  
        for(int i = 0; i < 3; i++)
        {
            Buku y = (Buku) stack.pop();
            System.out.println(y.getNama());
        }
    }
  
    public static void stack_peek(Stack<Buku> stack)
    {
        Buku element = (Buku) stack.peek();
        System.out.println("Elemen paling atas: " + element.getNama());
    }
    
}
