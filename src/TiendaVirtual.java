import java.util.Scanner;

public class TiendaVirtual {
    public static void main(String[] args) {
        String [] productos = {"Manzana", "Pan", "Leche", "Huevos", "Queso"};
        double[] precios = {10.00, 20.00, 25.00, 30.00, 50.00};
        Scanner consola = new Scanner(System.in);

        double total = 0;
        StringBuilder resumenCompra = new StringBuilder();
        int opcion;
        System.out.println("Bienvenido a la Tienda Virtual");

        do {
            //Mostrar Menu

        System.out.println("1. Manzana = $10.00");
        System.out.println("2. Pan = $20.00");
        System.out.println("3. Leche = $25.00");
        System.out.println("4. Huevos = $30.00");
        System.out.println("5. Queso = $50.00");
        System.out.println("Selecciona el producto: o 0 para salir: ");

        //Leer la opcion del usuario
        opcion = consola.nextInt();

            if (opcion > 0 && opcion <= productos.length) {
                total += precios[opcion - 1];
                resumenCompra.append("- ").append(productos[opcion - 1]).append(": $").append(precios[opcion - 1]).append("\n");
                System.out.println("Has agregado: " + productos[opcion - 1] + " - $" + precios[opcion - 1]);
            } else if (opcion != 0) {
                System.out.println("Opción inválida, intenta nuevamente.");
            }

        }while (opcion!= 0);
        // Mostrar Resumen de compra
        System.out.println("\n Resumen de tu compra:" + resumenCompra);
        System.out.println("Total: $" + total);
        System.out.println("\n Gracias por tu compra!");
    }
}
