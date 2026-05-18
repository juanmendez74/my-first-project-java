package jerciciosPracticos;

import java.util.Scanner;


public class Ejercicio1 {
       static Scanner teclado = new Scanner(System.in);
        //variable contadora de las veces que T>100
       static int contador_consecutivo = 0;
       static double temperatura = 0.0;

    public static void main(String[] args) {
     while(true){
        System.out.println("ingrese la temperatura de la planta");
        temperatura = teclado.nextDouble();
        if (temperatura > 100){
            contador_consecutivo = contador_consecutivo + 1;
        System.out.println("temperatura alta, cuidado");
        }else{
            contador_consecutivo = 0;
        }
        if(contador_consecutivo == 3){
            System.out.println("Alarma activada");
            break;
        }
     }
        System.out.println("toma de datos teminada, ESTADO DE ALERTA");
        teclado.close();
 }
}
