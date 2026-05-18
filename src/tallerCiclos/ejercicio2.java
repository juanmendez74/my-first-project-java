package tallerCiclos;
import java.util.Scanner;



public class ejercicio2 {

    static Scanner teclado = new Scanner(System.in);
    static double peso_persona = 0.0;
    static double peso_total = 0.0;
    static int contador_personas = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("ingrese el peso de la persona");
            peso_persona = teclado.nextDouble();
            peso_total = peso_total + peso_persona;
            contador_personas = contador_personas + 1;
            if (peso_persona == -1) {
                System.out.println("no hay mas personas en la fila, cerrando puertas");
                break;
            }

            if (peso_total + peso_persona > 1000) {
                System.out.println("peso excedido, la persona no puede subir, cerrando puertas");
                break;
            }

            if (contador_personas == 8) {
                System.out.println("cupo lleno, cerrando puertas");
                break;
            }
            System.out.println("persona subio, peso acumulado: " + peso_total + " kg");
        }

        System.out.println("personas que subieron: " + contador_personas);
        System.out.println("peso total real: " + peso_total + " kg");
        teclado.close();
    }
}