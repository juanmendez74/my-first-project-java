public class CiclosConContinue {
public static void main(String[] args) {
    System.out.println("-----envio material clase-----");
    for(int estudiante = 1; estudiante <= 16; estudiante++){
        if(estudiante == 8){
            System.out.println( "alumno # " + estudiante + " estudiante PERDIO ASIGNATURA");
            continue;
        }
        System.out.println("alumno # " + estudiante + " enviando material..");
    }
    System.out.println("----envio finalizado----");
}
}
