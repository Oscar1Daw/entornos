package Adivino;
import java.util.Scanner;
/**
 * @author oscar quinto coll
 * @version 25.01.2018
 */
public class main {

	/**
	 * @param args
	 * 
	 * El programa produce un bucle
	 * En este bucle pide el valor de X y lo compara con N
     * En base a la comparación, indica si X es superior o inferior a N
     * El bucle contiene un contador que indica el número de veces que se intenta adivinar el bucle
     * 
     * Si X es mayor que N: Mustra "Te pasaste Amigo"
     * Si X es menor que N: Muestra "Casi cerca ..."
     * 
     * int x número entero que se cree correcto
     * int n número entero cuyo valor se desconoce
     * int cont número entero de veces que hemos intentado adivinar el bucle
     * 
     * El bucle perdura mientras N sea diferente de X
     * 
     * @throws InputMismatchException si X es un número decimal, contiene espacios o letras
	 */
	public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}