package programas;

import java.util.Scanner;

public class ProyectoFinal {
    public static void main(String[] args) {
        int n1, n2, n3, producto,suma;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar número 1: ");
        n1 = lectura.nextInt();
        
        System.out.print("Ingresar número 2: ");
        n2 = lectura.nextInt();
        
        System.out.print("Ingresar número 3: ");
        n3 = lectura.nextInt();

        // Procesamiento
        producto = n1 * n2 * n3;
        suma=n1+n2+n3;

        // Salida de resultados
        System.out.println("El producto de los tres números es: " + producto);
        System.out.println("Suma de los tres números es: " + suma);
    }
}
