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
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;
        System.out.println("Ingresar la marca del automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingresar el origen del automóvil");
        origen = entrada.nextLine();
        System.out.println("Ingresar el costo del automóvil");
        costo = entrada.nextDouble();
        if (origen.equals("Alemania") || origen.equals("alemania")) {
            impuesto = costo * 0.20;
            precio_venta = costo + impuesto;
            System.out.printf("""
                              Impuesto por pagar: %.2f
                              Precio de venta: %.2f
                              """, impuesto, precio_venta);
        } else {
            if (origen.equals("Japon") || origen.equals("japon")) {
                impuesto = costo * 0.30;
                precio_venta = costo + impuesto;
                System.out.printf("""
                                      Impuesto por pagar: %.2f
                                      Precio de venta: %.2f
                                      """, impuesto, precio_venta);
            } else {
                if (origen.equals("Italia") || origen.equals("italia")) {
                    impuesto = costo * 0.15;
                    precio_venta = costo + impuesto;
                    System.out.printf("""
                                      Impuesto por pagar: %.2f
                                      Precio de venta: %.2f
                                      """, impuesto, precio_venta);
                } else {
                    if (origen.equals("USA") || origen.equals("usa")) {
                        impuesto = costo * 0.08;
                        precio_venta = costo + impuesto;
                        System.out.printf("""
                                         Impuesto por pagar: %.2f
                                         Precio de venta: %.2f""",
                                impuesto, precio_venta);
                    } else {
                        impuesto = 0;
                        precio_venta = costo;
                        System.out.printf("""
                                      Impuesto por pagar: %.2f
                                      Precio de venta: %.2f
                                      """, impuesto, precio_venta);
                    }
                }
            }
        }
    }

}
