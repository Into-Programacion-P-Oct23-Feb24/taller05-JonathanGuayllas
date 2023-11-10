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
        
        double b;
        double a;
        double area;
        
        System.out.println("Ingrese la base del triángulo");
        b = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        a = entrada.nextDouble();
    
        area = (b * a)/2;
        
        System.out.printf("El área del triángulo es: %.2f\n", area);
    }
    
}
