package tallerCiclos;
import java.util.Scanner;

public class EjercicioUno {
       static Scanner teclado = new Scanner(System.in);
        //variable contadora de las veces que hay un dulce defectuoso
       static int contador_consecutivo_dulce_defectuoso = 0;
       static double peso_dulce = 0.0;
       static int contador_dulce_admitido = 0;
       static int total_dulces = 0;
       static double porcentaje_dulces_defectuosos = 0.0;
       static int dulces_defectuosos = 0;

    public static void main(String[] args) {
     while(true){
        System.out.println("ingrese el peso del dulce");
        peso_dulce = teclado.nextDouble();
        total_dulces = total_dulces + 1;
        if (peso_dulce >= 8 && peso_dulce <= 12){
            contador_dulce_admitido = contador_dulce_admitido + 1;
        }
        if (peso_dulce > 12){
            contador_consecutivo_dulce_defectuoso = contador_consecutivo_dulce_defectuoso + 1;
            dulces_defectuosos = dulces_defectuosos + 1;
        System.out.println("dulce defectuoso, cuidado");
         }else if (peso_dulce < 8) {
            contador_consecutivo_dulce_defectuoso = contador_consecutivo_dulce_defectuoso + 1;
            dulces_defectuosos = dulces_defectuosos + 1;
            System.out.println("dulce defectuoso, cuidado");
         }else{
            contador_consecutivo_dulce_defectuoso = 0;
         }
         if(contador_consecutivo_dulce_defectuoso == 3){
            System.out.println("Detecion de emergencia ");
            break;
         }else if (peso_dulce == 0){
            System.out.println("toma de datos terminada, la cantidad de dulces admitidos fue de: " + contador_dulce_admitido);
            System.out.println("la cantidad total de dulces fue de: " + total_dulces);
            break;
         }
     }
         System.out.println("toma de datos terminada, la cantidad de dulces admitidos fue de: " + contador_dulce_admitido);
          System.out.println("la cantidad total de dulces fue de: " + total_dulces);
          porcentaje_dulces_defectuosos = dulces_defectuosos * 100 / total_dulces ;
          System.out.println("el porcentaje de dulces defectuosos fue de: " + porcentaje_dulces_defectuosos + "%");
        teclado.close();
 }
}

