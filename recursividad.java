import java.util.Scanner;
 
 
public class recursividad {
    static Scanner scanner = new Scanner(System.in);

    public static int invertirNumero(int num) {
        if (num < 10) {
            return num;
        }
        int ultimoDigito = num % 10;
        int restoInvertido = invertirNumero(num / 10);
        return Integer.parseInt(String.valueOf(ultimoDigito) + String.valueOf(restoInvertido));
    }

    public static void aaa() {
        int numero;
        boolean contieneCero;
        do {
            System.out.print("Ingrese un número que no contenga el dígito cero: ");
            numero = scanner.nextInt();
            contieneCero = contieneCero(numero);
            if (contieneCero) {
                System.out.println("Error: El número no puede contener el dígito cero. Por favor, ingrese otro número.");
            }
        } while (contieneCero);
        
        int numeroInvertido = invertirNumero(numero);
        System.out.println("El número invertido es: " + numeroInvertido);
    }
    
    private static boolean contieneCero(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}

 
 