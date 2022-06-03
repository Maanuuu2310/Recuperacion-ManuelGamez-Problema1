import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> impresora = new ArrayList<String>();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (!salir) {

            System.out.println("Indica una de las siguientes funciones");

            System.out.println("1 - Encender impresora.\n");
            System.out.println("2 - Apagar impresora.\n");
            System.out.println("3 - Añadir trabajo.\n");

            System.out.println("4 - Ver lista de trabajos.\n");
            System.out.println("5 - imprimir.\n");
            System.out.println("6 - Salir.\n");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 :
                    System.out.println("Impresora Encendida " + "\n");
                    String on = sc.nextLine();
                    break;

                case 2:
                    System.out.println("Impresora Apagada " + "\n");
                    String off = sc.nextLine();
                    break;

                case 3:
                    System.out.println("Añade un trabajo " + "\n");
                    String trabajo = sc.next();
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("ver lista de trabajos " + "\n");
                    for (int i = 0; i < impresora.size(); i++) {
                        System.out.println(impresora.get(i));
                        break;
                    }
                case 5:
                    System.out.println("imprimiendo trabajos " + "\n");
                    for (int i = 0; i < impresora.size(); i++) {
                        System.out.println(impresora.get(i));
                        System.out.println("imprimiendo trabajos" + impresora.remove(i));
                        break;
                    }
                case 6:
                    salir = true;
                    System.out.println("saliendo del menu ten un buen dia rey <3 nos vemos en cocina " + "\n");
                    break;
            }
        }
    }
}

