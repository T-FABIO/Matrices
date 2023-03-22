/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("1. SUMA ");
        System.out.println("2. RESTA ");
        System.out.println("3. MULTIPLICACION ");
        System.out.print("\n Ingresar Operacion que decea realizar: ");
        int menu = input.nextInt();
        switch(menu){
            
            case 1: 
                
                
                
                break;
            case 2:
                System.out.println("resta");
                break;
            case 3:
                
                System.out.println("\n-----/-----/-----/-----/-----/-----\n");
                
                // Pedir el tamaño de las matrices
                System.out.print("Ingrese el numero de filas de la primera matriz: ");
                int filasm1 = input.nextInt();
                System.out.print("Ingrese el numero de columnas de la primera matriz: ");
                int columnasm1 = input.nextInt();
                
                System.out.print("Ingrese el numero de filas de la segunda matriz: ");
                int filasm2 = input.nextInt();
                System.out.print("Ingrese el numero de columnas de la tercera matriz: ");
                int columnasm2 = input.nextInt();
                
               

                // Crear las matrices
                int[][] matrizA = new int[filasm1][columnasm1];
                int[][] matrizB = new int[filasm2][columnasm2];
                
                //verificar si se puede multiplicar las matrices
                if(matrizA[0].length != matrizB.length){
                    System.out.println("\n!El numero de filas de la primera matriz no coinciden con el numero de columnas de las egunda matriz!\n");
                    
                    break;
                }
                
                // Pedir el contenido de la primera matriz
                System.out.println("Ingrese los elementos de la primera matriz:");
                for (int i = 0; i < filasm1; i++) {
                    for (int j = 0; j < columnasm1; j++) {
                        matrizA[i][j] = input.nextInt();
                    }
                }

                // Pedir el contenido de la segunda matriz
                System.out.println("Ingrese los elementos de la segunda matriz:");
                for (int i = 0; i < filasm2; i++) {
                    for (int j = 0; j < columnasm2; j++) {
                        matrizB[i][j] = input.nextInt();
                    }
                }

                //Lugar en donde se almacena el resultado
                int[][] producto = new int[matrizA.length][matrizB[0].length];

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
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizB[0].length; j++) {
                        System.out.printf("%d ", producto[i][j]);
                    }
                    System.out.print("\n");
                }
                
                
                
                break;
                
        }
        
        
        
    }
    
}
