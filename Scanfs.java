import java.util.Scanner;
public class Scanfs{
    public static void main(String args[]){
        Scanner almacenar = new Scanner(System.in);
       System.out.println("Escribe tu nombre: ");
       String nombre = almacenar.nextLine();
       System.out.println("El nuevo nombre es: "+nombre);

       System.out.println("Ingresa la incial de tu nombre: ");
        char inicial = Scanner.next().charAt(0);
        System.out.println("Ingresa tu edad ");
        int edad =Scanner.nextInt();
        System.out.println("Ingresa tu estatura en metros (ejemplo: 3.98): ");
        double estatura = Scanner.nextDouble();
        System.out.println("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = Scanner.nextBoolean();
    }
}