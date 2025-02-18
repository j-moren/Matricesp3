
import java.util.Random;
import java.util.Scanner;



public class Metodos {

    public int [][] solicitarDimension() {

        Scanner sc = new Scanner (System.in); // Crear un objeto Scanner para leer la Entrada

        System.out.println("Ingrese el Número de la Fila de la Matriz: "); // Solicitar el Número de la Fila
        int i = sc.nextInt(); // Lee el número de las Filas

        System.out.println("Ingrese el Número de las Columnas de la Matriz"); // Solicitar el Número de la Columna
        int j = sc.nextInt(); // Lee el número de las Columnas

        int [][] matriz = new int[i][j];

        sc.close();

        return matriz;
        
    }
    public void llenarMatriz(int [][] matriz) {
        Random rand = new Random(); // Crear Objeto Random para Llenar Valores Aleatorios de 0 a 100

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = rand.nextInt(101); // Generar Números de 0 a 100
                
            }
        }
    }
    public void calcularSumas (int[][] matriz, int[] filaSuma, int[] columnaSuma) {
        
        for (int i = 0; i < matriz.length; i++) {
            filaSuma[i] = 0; // Inicializamos los vectores de las Sumas, pra este caso la de las filas               
        }
        for (int j = 0; j < matriz [0].length; j++) {
            columnaSuma[j] = 0; // Inicializamos las Columnas
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                filaSuma[i] += matriz[i][j]; // Calculamos la Sumas de las filas 
                columnaSuma[j] += matriz[i][j]; // Calculamos las Suma de las Columnas
            }
        }        
    }
    public void imprimirResultados (int [] filaSuma, int[] columnaSuma) {

        for (int i = 0; i < filaSuma.length; i++) {
            System.out.println("Suma de la Fila " + (i+1) + " es: " + filaSuma[i]);
        }
        for (int j = 0; j < columnaSuma.length; j++) {
            System.out.println("Suma de la columna " + (j+1) + " es: " + columnaSuma[j]);
        }
    }
}
