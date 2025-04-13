import java.util.Scanner;

public class ValidarNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Introduce una nota (0 a 10): ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota no válida. Intenta de nuevo.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida ingresada: " + nota);
        scanner.close();
    }
}
