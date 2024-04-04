import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        int goku;

        do {
            System.out.println("·········································································");
            System.out.println("                                  Menú                                   ");
            System.out.println("                                                                         ");
            System.out.println("Ingrese un numero.......................................................1");
            System.out.println("Salir ..................................................................2");
            System.out.println("                                                                         ");
            System.out.println("·········································································");
            System.out.print("Elija opción: ");

            goku = scanner.nextInt();

            switch (goku) {
                case 1:
                    recursividad.aaa();
                    break;

                case 2:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-5).");
            }
        } while (goku != 2);

        scanner.close();
    }
}

