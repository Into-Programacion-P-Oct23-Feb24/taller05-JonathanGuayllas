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

        int dias_hospedaje;
        double precio_habitacion;
        double subtotal;
        double descuento;
        double precio_total;
        System.out.println("Ingrese los días de hospedaje");
        dias_hospedaje = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitación");
        precio_habitacion = entrada.nextDouble();

        if ((dias_hospedaje > 5) && (dias_hospedaje <= 10)) {
            descuento = 0.10;
            subtotal = dias_hospedaje * precio_habitacion;
            descuento = subtotal * descuento;
            precio_total = subtotal - descuento;
            System.out.printf("""
                              El subtotal por pagar es: %.2f
                              El descuento realizado es: %.2f
                              El precio total por pagar es: %.2f
                              """, subtotal, descuento, precio_total);
        } else {
            if ((dias_hospedaje > 10) && (dias_hospedaje <= 15)) {
                descuento = 0.15;
                subtotal = dias_hospedaje * precio_habitacion;
                descuento = subtotal * descuento;
                precio_total = subtotal - descuento;
                System.out.printf("""
                                  El subtotal por pagar es: %.2f
                                  El descuento realizado es: %.2f
                                  El precio total por pagar es: %.2f
                                  """, subtotal, descuento, precio_total);
            } else {
                if (dias_hospedaje > 15) {
                    descuento = 0.20;
                    subtotal = dias_hospedaje * precio_habitacion;
                    descuento = subtotal * descuento;
                    precio_total = subtotal - descuento;
                    System.out.printf("""
                                      El subtotal por pagar es: %.2f
                                      El descuento realizado es: %.2f
                                      El precio total por pagar es: %.2f
                                      """, subtotal, descuento, precio_total);
                } else {
                    descuento = 0;
                    subtotal = dias_hospedaje * precio_habitacion;
                    precio_total = subtotal - descuento;
                    System.out.printf("""
                                  El subtotal por pagar es: %.2f
                                  El descuento realizado es: %.0f
                                  El precio total por pagar es: %.2f
                                  """, subtotal, descuento, precio_total);
                }
            }
        }
    }

}
