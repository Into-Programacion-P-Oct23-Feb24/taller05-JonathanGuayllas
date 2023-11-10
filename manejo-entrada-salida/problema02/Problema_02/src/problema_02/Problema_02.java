/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class Problema_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double hijo1;
        double hijo2;
        double hijo3;
        double gastos;

        System.out.println("Ingrese los gastos del primer hijo del padre de familia");
        hijo1 = entrada.nextDouble();
        System.out.println("Ingrese los gatos del segundo hijo del padre de familia");
        hijo2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo del padre de familia");
        hijo3 = entrada.nextDouble();

        gastos = hijo1 + hijo2 + hijo3;

        System.out.printf("Gastos totales de los hijos del padre de familia: %.2f\n",
                          gastos);
    }

}
