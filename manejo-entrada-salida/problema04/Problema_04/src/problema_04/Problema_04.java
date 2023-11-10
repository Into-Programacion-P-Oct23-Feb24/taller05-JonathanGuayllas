/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_04;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author jdgua
 */
public class Problema_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double total;
        
        System.out.println("Ingresar el costo del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingresar el costo del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingresar el costo de la pantalla");
        pantalla = entrada.nextDouble();
        System.out.println("Ingresar el costo del ratón");
        raton = entrada.nextDouble();
        
        total = cpu + teclado + pantalla + raton;
        
        System.out.printf("Costo total de la computadora: %.2f\n", total);
    }
    
}
