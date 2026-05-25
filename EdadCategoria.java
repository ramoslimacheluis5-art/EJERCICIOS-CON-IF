import java.util.Scanner;

public class EdadCategoria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Categoría: Niño");
        }

        if (edad >= 13 && edad <= 17) {
            System.out.println("Categoría: Adolescente");
        }

        if (edad >= 18 && edad <= 64) {
            System.out.println("Categoría: Adulto");
        }

        if (edad >= 65) {
            System.out.println("Categoría: Adulto mayor");
        }

        if (edad < 0) {
            System.out.println("Edad inválida");
        }
    }
}