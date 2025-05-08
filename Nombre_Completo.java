import java.util.Scanner;
public class Nombre_Completo{
    public static void main(String args[]){
        Scanner almacenar = new Scanner(System.in);
       System.out.println("Escribe tu nombre: ");
       String nombre = almacenar.nextLine();
       System.out.println("Escribe tu apellido paterno: ");
       String apellidoPaterno = almacenar.nextLine();
       System.out.println("Escribe tu apellido materno: ");
       String apellidoMaterno = almacenar.nextLine();

       System.out.println("El nuevo nombre completo es : "+nombre + apellidoPaterno + apellidoMaterno);

    }
}