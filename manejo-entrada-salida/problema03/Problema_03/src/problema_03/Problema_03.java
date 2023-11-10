/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class Problema_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costo_minutos;
        double minutos_consumidos;
        double costo_total;

        System.out.println("ingrese el costo por minutos");
        costo_minutos = entrada.nextDouble();
        System.out.println("Ingrese el número de minutos consumidos en el mes.");
        minutos_consumidos = entrada.nextDouble();

        costo_total = costo_minutos * minutos_consumidos;

        System.out.printf("El valor de la plantilla de telefóno es: %.2f\n",
                            costo_total);
    }

}
