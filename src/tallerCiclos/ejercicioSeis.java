package tallerCiclos;
import java.util.Scanner;
public class ejercicioSeis {   
    static Scanner teclado = new Scanner(System.in);
    static int riego_encendido_min = 0;
    static double humedad = 0.0;
    static int estres_hidrico = 0;
    static boolean riesgo_encendido = false;
    static boolean riego_automatico = false;
    static boolean estres_critico = false;
    public static void main(String[] args) {
        System.out.println("ingresa la humedad inicial (de 0 a 100)");
        humedad = teclado.nextDouble();
        for (int minuto = 1; minuto <= 24; minuto++){
            System.out.println("minuto: " + minuto + " humedad actual: " + humedad + "%");
            humedad = teclado.nextDouble();
            if (humedad < 40){
                riego_automatico = true;
                humedad = humedad + 5;
                System.out.println("riego activado");
            }else if (humedad > 60){
                riego_automatico = false;
                humedad = humedad - 3;
                System.out.println("riego desactivado");
            }
            if (riego_automatico){
                riego_encendido_min = riego_encendido_min + 1;
            }
            if (humedad < 15){
                estres_hidrico = estres_hidrico + 1;
                System.out.println("cuidado, estres hidrico");
            }else {
                estres_hidrico = 0;
            }
            if (estres_hidrico >= 2){
                estres_critico = true;
                System.out.println("ESTRES HIDRICO CRITICO");
            }
        }
        System.out.println("reporte final");
        System.out.println( "minutos totales de riego encendido: " + riego_encendido_min);
        if (estres_critico){
            System.out.println("hubo estres hidrico critico por una humedad inferior al 15%");
        }else {
            System.out.println("no hubo estres hidrico critico");
        }
        teclado.close();
    }
}   
