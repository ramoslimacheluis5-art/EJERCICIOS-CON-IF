import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese un año: ");
        anio = teclado.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
}