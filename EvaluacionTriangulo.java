import java.util.Scanner;

public class EvaluacionTriangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Ingrese el lado 1: ");
        lado1 = teclado.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        lado2 = teclado.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        lado3 = teclado.nextDouble();

        // Verificar si forman un triángulo
        if ((lado1 + lado2 > lado3) &&
            (lado1 + lado3 > lado2) &&
            (lado2 + lado3 > lado1)) {

            System.out.println("Sí forman un triángulo.");

            // Clasificación
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es Isósceles.");
            } else {
                System.out.println("El triángulo es Escaleno.");
            }

        } else {
            System.out.println("No forman un triángulo.");
        }
    }
}