public class Condicionales {
    static int numero1 = 23;
    static int numero2 = 7;
    public static void main(String[] args){
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            System.out.println(numero2 + " es mayor que " + numero1);
        }
        // condicional para verificar numero par
        if(numero1 % 2 == 0) {
            System.out.println(numero1 + " es par");
        } else{
            System.out.println(numero1 + " es impar");
        }
           if(numero2 % 2 == 0) {
            System.out.println(numero2 + " es par");
        } else{
            System.out.println(numero2 + " es impar");
        }
        }

    }
