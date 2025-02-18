// Realice un algoritmo que llene una matriz de 5 * 5. Calcular la suma de cada fila y almacenarla en un vector, la suma de cada columna y almacenarla en otro vector

public class matrizSuma {
    
    public static void main (String[] args){
                
        Metodos metodos = new Metodos(); // Se crea Instancia de Metodos

        int [][] matriz = metodos.solicitarDimension(); // Solicitar la dimensión de la Matriz

        metodos.llenarMatriz(matriz); // llenar Matriz con Valores Aleatorios

        int[] filaSuma = new int[matriz.length]; // arreglo para Almacenar la suma de las Filas 
        int[] columnaSuma = new int[matriz[0].length]; // Arreglo para Almacenar la suma de las columnas

        metodos.calcularSumas(matriz, filaSuma, columnaSuma); // Calcular las Sumas de las filas y Columnas

        metodos.imprimirResultados(filaSuma, columnaSuma); // Imprimir los Resultados
    
    }
    
}
