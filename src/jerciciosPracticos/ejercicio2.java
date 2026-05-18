package jerciciosPracticos;

public class ejercicio2 {
static int numero = 1;
static int acumulador3 = 0;
static int acumulador5 = 0;
static int acumulador_ambos = 0;
public static void main(String[] args) {
    for(numero = 1; numero < 51; numero++){
     if(numero %3 == 0 && numero %5 == 0){
        acumulador_ambos = acumulador_ambos + 1;
      }else if (numero %5 == 0){
        acumulador5 = acumulador5 + 1;
      } else if (numero %3 == 0){
        acumulador3 = acumulador3 + 1;
      }
    }
System.out.println("la cantidad de numeros divisibles por 5 y por 3 son: " + acumulador_ambos);
System.out.println("la cantidad de numeros divisibles por 5 son: " + acumulador5);
System.out.println("la cantidad de numeros divisibles por 3 son: " + acumulador3);
}
}

