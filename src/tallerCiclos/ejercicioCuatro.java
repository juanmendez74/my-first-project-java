package tallerCiclos;
import java.util.Scanner;

public class ejercicioCuatro {

    static Scanner teclado = new Scanner(System.in);
    static double saldo = 0.0;
    static int codigo = 0;
    static int viaje_anterior = -1;
    static boolean tarjeta_bloqueada = false;

    public static void main(String[] args) {

        System.out.println("ingrese el saldo inicial de la tarjeta");
        saldo = teclado.nextDouble();

        while (true) {
            System.out.println("saldo actual: " + saldo);
            System.out.println("ingrese el codigo del viaje (1-bus, 2-metro, 3-transbordo, 4-recargar, 0-salir)");
            codigo = teclado.nextInt();

            if (codigo == 0) {
                System.out.println("programa finalizado");
                break;
            }
            if (saldo < -4000) {
                tarjeta_bloqueada = true;
                System.out.println("saldo negativo critico, tarjeta bloqueada");
            } else if (saldo < 0) {
                tarjeta_bloqueada = true;
            }

            if (tarjeta_bloqueada) {
                if (codigo == 4) {
                    System.out.println("ingrese el monto a recargar");
                    saldo = saldo + teclado.nextDouble();
                    tarjeta_bloqueada = false;
                    viaje_anterior = -1;
                    System.out.println("tarjeta recargada, saldo actual: " + saldo);
                } else {
                    System.out.println("tarjeta bloqueada, ingrese codigo 4 para recargar");
                }
                continue;
            }

            if (codigo == 1) {
                saldo = saldo - 2500;
                viaje_anterior = 1;
                System.out.println("viaje en bus descontado, saldo: " + saldo);
            } else if (codigo == 2) {
                 viaje_anterior = 2;
                if (viaje_anterior == 2) {
                    saldo = saldo - 1600;
                    System.out.println("descuento aplicado, saldo: " + saldo);
                } else {
                    saldo = saldo - 3200;
                    System.out.println("viaje en metro descontado, saldo: " + saldo);
                }
                viaje_anterior = 2;
            } else if (codigo == 3) {
                saldo = saldo - 1000;
                viaje_anterior = 3;
                System.out.println("viaje en transbordo descontado, saldo: " + saldo);
            } else {
                System.out.println("codigo invalido, intente de nuevo");
                continue;
            }

            if (saldo < -4000) {
                saldo = -4000;
                tarjeta_bloqueada = true;
                System.out.println("saldo negativo critico, tarjeta bloqueada");
            } else if (saldo < 0) {
                tarjeta_bloqueada = true;
                System.out.println("saldo negativo, tarjeta bloqueada");
            }
        }
        System.out.println("saldo final de la tarjeta: " + saldo);
        teclado.close();
    }
}
