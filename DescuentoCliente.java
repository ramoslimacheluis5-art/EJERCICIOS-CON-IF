import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double compra, descuento, total;
        String tipoCliente;

        System.out.print("Ingrese el monto de compra: ");
        compra = teclado.nextDouble();

        teclado.nextLine(); // limpiar buffer

        System.out.print("Ingrese el tipo de cliente (VIP o NORMAL): ");
        tipoCliente = teclado.nextLine();

        if (compra > 500 && tipoCliente.equalsIgnoreCase("VIP")) {
            descuento = compra * 0.20;
        } else if (compra > 500) {
            descuento = compra * 0.10;
        } else {
            descuento = 0;
        }

        total = compra - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}