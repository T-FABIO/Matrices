package Operaciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("1. SUMA ");
        System.out.println("2. RESTA ");
        System.out.println("3. MULTIPLICACION ");
        System.out.print("\n Ingresar Operacion que decea realizar: ");
        int menu = input.nextInt();
        switch(menu){
            
            case 1: 
                System.out.println("suma");
                break;
            case 2:
                System.out.println("resta");
                break;
            case 3:
                
                // Pedir el tamaño de las matrices
                System.out.print("Ingrese el numero de filas de las matrices: ");
                int filas = input.nextInt();
                System.out.print("Ingrese el numero de columnas de las matrices: ");
                int columnas = input.nextInt();
                

                // Crear las matrices
                int[][] matrizA = new int[filas][columnas];
                int[][] matrizB = new int[filas][columnas];
                
                //verificar si se puede multiplicar las matrices
                if(matrizA.length == matrizB[0].length){
                    System.out.println("El numero de filas de la primera matriz no coinciden "
                            + "con el numero de columnas de las egunda matriz");
                    
                    break;
                }

                // Pedir el contenido de la primera matriz
                System.out.println("Ingrese los elementos de la primera matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matrizA[i][j] = input.nextInt();
                    }
                }

                // Pedir el contenido de la segunda matriz
                System.out.println("Ingrese los elementos de la segunda matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matrizB[i][j] = input.nextInt();
                    }
                }

                //Lugar en donde se almacena el resultado
                int[][] producto = new int[matrizB.length][matrizB[0].length];

                // Necesitamos hacer esto por cada columna de la segunda matriz (B)
                for (int a = 0; a < matrizB[0].length; a++) {
                    // Dentro recorremos las filas de la primera (A)
                    for (int i = 0; i < matrizA.length; i++) {
                        int suma = 0;
                        // Y cada columna de la primera (A)
                        for (int j = 0; j < matrizA[0].length; j++) {
                            // Multiplicamos y sumamos resultado
                            suma += matrizA[i][j] * matrizB[j][a];
                        }
                        // Lo acomodamos dentro del producto
                        producto[i][a] = suma;
                    }
                }

                // Recorrer producto
                System.out.print("Imprimiendo producto\n");
                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[0].length; j++) {
                        System.out.printf("%d ", producto[i][j]);
                    }
                    System.out.print("\n");
                }
                
                break;
        }
        
        
        
        
        
        
        
        
        
        
    }
}
