import java.util.Scanner;

public class EvaluacionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la nota (0 - 10): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida.");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 6) {
            System.out.println("Aprobado");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota < 10) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Excelente, tienes matrícula de honor");
        }

        scanner.close();
    }

    @Override
    public String toString() {
        return "EvaluacionNotas []";
    }
}
