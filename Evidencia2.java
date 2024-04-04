import java.util.Scanner;

public class Evidencia2{
    public static void main(String[] args) {

        boolean ciclo = true;

        while(ciclo){

            Scanner scanner = new Scanner(System.in);
            space();
            System.out.println("TEST CARRERA UNIVERSITARIA: ");
            System.out.print("Iniciar Test - Presiona 1 \nSalir del Test - Presiona 2 \nElige una opcion: ");
            int opcion = scanner.nextInt();


            if(opcion == 1){
                space();
                space();
                space();
            }
            else if(opcion == 2){
                ciclo = false;
            }
            else{
                space();
                System.out.println("Elige una opcion valida!!!");
                space();
            }
            space();

        }

    }

    public static void space(){

        System.out.println("\n\n");
    }
}