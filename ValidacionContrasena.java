import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contrasena;

        System.out.print("Ingrese una contraseña numérica: ");
        contrasena = teclado.nextInt();

        if (contrasena > 1000 && contrasena < 9999) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
        }
    }
}