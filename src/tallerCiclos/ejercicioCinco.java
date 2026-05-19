package tallerCiclos;
import java.util.Scanner;

public class ejercicioCinco {
    static Scanner teclado = new Scanner(System.in);
    static int numero_original = 0;
    static int numero_invertido = 0;
    static int digito = 0;
    static int auxiliar = 0;

    public static void main(String[] args) {
        System.out.println("ingrese un numero entero positivo");
        numero_original = teclado.nextInt();

        auxiliar = numero_original;

        while (auxiliar > 0) {
            digito = auxiliar % 10;
            numero_invertido = numero_invertido * 10 + digito;
            auxiliar = auxiliar / 10;
        }

        System.out.println("el numero original fue: " + numero_original);
        System.out.println("el numero invertido es: " + numero_invertido);

        if (numero_original == numero_invertido) {
            System.out.println("el numero es un palindromo");
        } else {
            System.out.println("el numero no es un palindromo");
        }

        teclado.close();
    }
}