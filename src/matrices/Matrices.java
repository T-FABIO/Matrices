package matrices;
import Operaciones.Multiplicacion;
import Operaciones.Resta;
import Operaciones.Suma;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. SUMA ");
        System.out.println("2. RESTA ");
        System.out.println("3. MULTIPLICACION ");
        System.out.print("\n Ingresar Operacion que decea realizar: ");
        int menu = input.nextInt();
        switch (menu) {

            case 1:
                System.out.println("suma");
                Suma suma = new Suma();
                suma.pedirMatriz();
                suma.sumaMatrices();
                suma.imprimirResultado();
                
                     
            break;
            
            case 2:
                System.out.println("resta");
                Resta resta = new Resta();
                resta.pedirMatriz();
                resta.sumaMatrices();
                resta.imprimirResultado();
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
                if (matrizA[0].length != matrizB.length) {
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

                Multiplicacion multiplicacion = new Multiplicacion();
                
                // Recorrer producto
                System.out.print("Imprimiendo producto\n");

                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[0].length; j++) {
                        System.out.printf("%d ", multiplicacion.multiplicar(matrizA, matrizB)[i][j]);
                    }
                    System.out.print("\n");
                }

            break;
        }
    }

}
