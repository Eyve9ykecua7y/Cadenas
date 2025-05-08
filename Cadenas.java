import java.util.Scanner;
public class Cadenas{
    public static void main(String args[]){
        Scanner almacenar = new Scanner(System.in);
       System.out.println("Escribe tu nombre: ");
       String nombre = almacenar.nextLine();

       System.out.println("El nuevo nombre es: "+nombre);

    }
}