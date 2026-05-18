package tallerCiclos;
import java.util.Scanner;
public class ejercicioTres {
    static Scanner teclado = new Scanner(System.in);
    static int digito_actual = 0;
    static int digito_anterior = -1;
    static int digito_ante_anterior = -1;
    static int contador_consecutivo = 0;
    static boolean contrasena_segura = true;
    public static void main(String[] args) {    
        System.out.println("ingrese los digitos de la contrasena uno por uno (negativo para terminar)");
        while (true) {
            System.out.println("ingrese un digito");
            digito_actual = teclado.nextInt();
            if (digito_actual < 0) {
                System.out.println("fin de ingreso de digitos");
                break;
            }
            if (digito_actual == digito_anterior && digito_actual == digito_ante_anterior && digito_ante_anterior != -1) {
                contrasena_segura = false;
                System.out.println("contrasena poco segura mismo digito consecutivos: " + digito_ante_anterior + " " + digito_anterior + " " + digito_actual);
                break;
            }
            if (digito_ante_anterior != -1 && digito_actual == digito_anterior + 1 && digito_anterior == digito_ante_anterior + 1) {
                contrasena_segura = false;
                System.out.println("contrasena poco segura secuencia ascendente consecutiva: " + digito_ante_anterior + " " + digito_anterior + " " + digito_actual);
                System.out.println("contrasena rechazada inmediatamente");
                break;
            }
            digito_ante_anterior = digito_anterior;
            digito_anterior = digito_actual;
            System.out.println("digito aceptado");
        }
        if (contrasena_segura) {
            System.out.println("Contrasena Segura");
        } else {
            System.out.println(" Contrasena Insegura");
        }
        teclado.close();
    }
}