import java.util.Scanner;

public class SalarioBonificacion {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salario, bono;
        int anios;

        System.out.print("Ingrese el salario: ");
        salario = teclado.nextDouble();

        System.out.print("Ingrese los años de trabajo: ");
        anios = teclado.nextInt();

        if (anios > 5 && salario < 2000) {
            bono = 500;
            System.out.println("Tiene bono completo.");
        } else if (anios > 5 || salario < 2000) {
            bono = 250;
            System.out.println("Tiene bono menor.");
        } else {
            bono = 0;
            System.out.println("No tiene bono.");
        }

        System.out.println("Bono: " + bono);
        System.out.println("Salario total: " + (salario + bono));
    }
}