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
        String descripcion;
        int cantidad_requerida;
        double precio_unitario;
        double descuento;
        double precio_total;
        System.out.println("Ingresar la descripción del producto");
        descripcion = entrada.nextLine();
        System.out.println("Ingresar la cantidad requerida");
        cantidad_requerida = entrada.nextInt();
        System.out.println("Ingresar el precio unitario");
        precio_unitario = entrada.nextInt();
        descuento = 0.15;
        precio_total = cantidad_requerida * precio_unitario;
        if (cantidad_requerida > 50) {
           precio_total = precio_total - (precio_total * descuento);      
           System.out.printf("El valor total a pagar es: %.2f\n", precio_total);
        } else {
                System.out.printf("El valor total a pagar es: %.2f\n", 
                        precio_total);     
        }
    }
    
}
