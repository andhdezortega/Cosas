import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (true) {
            System.out.print("Ingresa un número: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break; 
            }

            suma += num; 
        }

        System.out.println("La suma total de los números ingresados es: " + suma);
        scanner.close();
    }
}
