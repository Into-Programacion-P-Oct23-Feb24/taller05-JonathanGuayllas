/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class Problema_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valor_kilovatio_hora;
        int kilovatios_consumidos;        
        int edad;
        double total;
        double descuento;
        System.out.println("Ingresar el valor de kilovatio/hora");
        valor_kilovatio_hora = entrada.nextDouble();
        System.out.println("Ingresar el valor de kilovatios consumidos en el mes");
        kilovatios_consumidos = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        descuento = 0.10;
        total = (valor_kilovatio_hora * kilovatios_consumidos);
        if (edad > 65 ) {
           total = total - (total * descuento);
           System.out.printf("El valor total a pagar es: %.2f\n", total);
        } else {
        System.out.printf("El valor total a pagar es: %.2f\n", total);
        }
    }
    
}
