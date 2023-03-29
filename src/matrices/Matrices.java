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
                System.out.println("\n Suma");
                Suma suma = new Suma();
                suma.pedirMatriz();
                suma.sumaMatrices();
                suma.imprimirResultado();
                
                     
            break;
            
            case 2:
                System.out.println("\n Resta");
                Resta resta = new Resta();
                resta.pedirMatriz();
                resta.sumaMatrices();
                resta.imprimirResultado(); 
            break;
            
            case 3:
                System.out.println("\n Multiplicacion");            
                Multiplicacion multiplicacion = new Multiplicacion();
                multiplicacion.pedirMatrices();
                multiplicacion.imprimirMatriz();
                
            break;
        }
    }

}
