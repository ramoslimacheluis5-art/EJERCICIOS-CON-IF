import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        nota3 = teclado.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 11) {
            System.out.println("Estado: Aprobado");
        } else if (promedio < 11 && promedio > 8) {
            System.out.println("Estado: Recuperación");
        } else {
            System.out.println("Estado: Desaprobado");
        }
    }
}