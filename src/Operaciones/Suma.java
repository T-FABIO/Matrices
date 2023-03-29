package Operaciones;

import java.util.Scanner;

public class Suma {

    int[][] matrizA;
    int[][] matrizB;
    int[][] matrizR;

    public void pedirMatriz() {
        Scanner pm = new Scanner(System.in);

        System.out.println("\n-----/-----/-----/-----/-----/-----\n");

        // Pedir el tamaño de las matrices
        System.out.print("Ingrese el numero de filas de las matrices: ");
        int filas = pm.nextInt();
        System.out.print("Ingrese el numero de columnas de las matrices: ");
        int columnas = pm.nextInt();

        //verificar si se pueden sumar las matrices
        if (filas != columnas) {
            System.out.println("las matrices no se pueden sumar");
        } else {
            matrizA = new int[filas][columnas];
            matrizB = new int[filas][columnas];
            matrizR = new int[filas][columnas];
        }

        // Pedir el contenido de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizA[i][j] = pm.nextInt();
            }
            System.out.println("\n");
        }

        // Pedir el contenido de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizB[i][j] = pm.nextInt();
            }
        }

        

    }
    
    
    public void sumaMatrices(){
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizR[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
   
    }
    
    
    public void imprimirResultado(){
        // Recorrer producto
        System.out.print("Imprimiendo producto\n");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.printf("%d ", matrizR[i][j]);
            }
            System.out.print("\n");
        }
    }

}
    
    
    
    

