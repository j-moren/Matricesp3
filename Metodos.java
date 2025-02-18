
import java.util.Scanner;



public class Metodos {

    public int [][] solicitarDimension() {

        Scanner sc = new Scanner (System.in); // Crear un objeto Scanner para leer la Entrada

        System.out.println("Ingrese el Número de la Fila de la Matriz: "); // Solicitar el Número de la Fila
        int i = sc.nextInt(); // Lee el número de las Filas

        System.out.println("Ingrese el Número de las Columnas de la Matriz"); // Solicitar el Número de la Columna
        int j = sc.nextInt(); // Lee el número de las Columnas

        int [][] matriz = new int[i][j];

        return matriz;
    
    }

    
}
