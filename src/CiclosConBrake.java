public class CiclosConBrake {
    //revisar archivos y salir del ciclo una vez encuentre el archivo malisioso
    public static void main(String[] args) {
        System.out.println("------iniciando scaneo de seguridad------");
        for(int archivo=1; archivo <= 10; archivo++){
            if (archivo ==4){
                System.out.println("alerta\n el archivo #" + archivo + " esta corrupto");
                break;
            }
            System.out.println("archivo #" + archivo + " analizado");
        }
        System.out.println("------scaneo de seguridad finalizado------");
    }
}
