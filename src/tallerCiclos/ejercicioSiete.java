package tallerCiclos;
import java.util.Scanner;

public class ejercicioSiete {
    static Scanner teclado = new Scanner(System.in);
    static char resultado = ' ';
    static int puntos_totales = 0;
    static int racha_invicto_actual = 0;
    static int mayor_racha_invicto = 0;
    static int racha_derrotas_actual = 0;
    static int mayor_racha_derrotas = 0;

    public static void main(String[] args) {

        for (int partido = 1; partido <= 20; partido++) {

            System.out.println("ingrese el resultado del partido " + partido + " (G, E, P)");
            resultado = teclado.next().charAt(0);

            if (resultado == 'G') {
                puntos_totales = puntos_totales + 3;
                racha_invicto_actual = racha_invicto_actual + 1;
                if (racha_derrotas_actual > mayor_racha_derrotas) {
                    mayor_racha_derrotas = racha_derrotas_actual;
                }
                racha_derrotas_actual = 0;
            } else if (resultado == 'E') {
                puntos_totales = puntos_totales + 1;
                racha_invicto_actual = racha_invicto_actual + 1;
                if (racha_derrotas_actual > mayor_racha_derrotas) {
                    mayor_racha_derrotas = racha_derrotas_actual;
                }
                racha_derrotas_actual = 0;
            } else if (resultado == 'P') {
                racha_derrotas_actual = racha_derrotas_actual + 1;
                if (racha_invicto_actual > mayor_racha_invicto) {
                    mayor_racha_invicto = racha_invicto_actual;
                }
                racha_invicto_actual = 0;
            }
        }


        System.out.println("puntos totales: " + puntos_totales);
        System.out.println("mayor racha invicto: " + mayor_racha_invicto + " partidos");
        System.out.println("peor racha de derrotas: " + mayor_racha_derrotas + " partidos");

        teclado.close();
    }
}
