/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_05;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author jdgua
 */
public class Problema_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double total;
        double descuento;
        int edad;
        
        System.out.println("Ingresar el costo mensual de netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingresar el costo mensual de youtube premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingresar el costo mensual de dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingresar el costo mensual de spotify");
        spotify = entrada.nextDouble();
        System.out.println("Ingresar el costo mensual de spotify");
        edad = entrada.nextInt();
        
        total = netflix + youtube + dropbox + spotify;
        
        if (edad < 30){
           descuento = 0.20; 
        }
    }
    
}
