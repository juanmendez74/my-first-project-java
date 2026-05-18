package tallerCiclos;

import java.util.Scanner;

public class ejercicio3 {

    static Scanner teclado = new Scanner(System.in);
    static int digito_actual = 0;
    static int digito_anterior = -1;
    static int digito_ante_anterior = -1;
    static int contador_consecutivo = 0;
    static boolean contrasena_segura = true;
    static String motivo_rechazo = "";

    public static void main(String[] args) {

        System.out.println("ingrese los digitos de la contrasena uno por uno (negativo para terminar)");

        while (true) {
            System.out.println("ingrese un digito");
            digito_actual = teclado.nextInt();

            if (digito_actual < 0) {
                System.out.println("fin de ingreso de digitos");
                break;
            }

            // verificar si es el mismo digito tres veces seguidas
            if (digito_actual == digito_anterior && digito_actual == digito_ante_anterior && digito_ante_anterior != -1) {
                contrasena_segura = false;
                motivo_rechazo = "tres digitos iguales seguidos: " + digito_actual + ", " + digito_actual + ", " + digito_actual;
                System.out.println("contrasena rechazada inmediatamente");
                break;
            }

            // verificar si es una secuencia ascendente de tres consecutivos
            if (digito_ante_anterior != -1 && digito_actual == digito_anterior + 1 && digito_anterior == digito_ante_anterior + 1) {
                contrasena_segura = false;
                motivo_rechazo = "secuencia ascendente consecutiva: " + digito_ante_anterior + ", " + digito_anterior + ", " + digito_actual;
                System.out.println("contrasena rechazada inmediatamente");
                break;
            }

            // actualizar historial de digitos
            digito_ante_anterior = digito_anterior;
            digito_anterior = digito_actual;

            System.out.println("digito aceptado");
        }

        if (contrasena_segura) {
            System.out.println(">>> Contrasena Segura");
        } else {
            System.out.println(">>> Contrasena Insegura");
            System.out.println("motivo: " + motivo_rechazo);
        }

        teclado.close();
    }
}