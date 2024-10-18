/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicks;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Clicks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el número de clicks a $0.30: "); 
        int clics60 = scanner.nextInt(); 
        double costoClic60 = 0.30; 
        
      System.out.println("Ingrese el número de clicks a $0.25: "); 
        int clics100 = scanner.nextInt(); 
        double costoClic100 = 0.25; 
        
      System.out.println("Ingrese el número de clicks a $0.80: "); 
        int clics20 = scanner.nextInt(); 
        double costoClic20 = 0.80; 
        double isv = 0.16; 
        double costoTotal = (clics60 * costoClic60) + (clics100 * costoClic100) + (clics20 * costoClic20);
        int totalClics = clics60 + clics100 + clics20; 
        double costoPromedio = costoTotal / totalClics; 
        double totalConISV = costoTotal + (costoTotal * isv); 
        
      System.out.println("Costo promedio por click: $" + String.format("%.2f", costoPromedio));
      System.out.println("Total con ISV: $" + String.format("%.2f", totalConISV));
    }
    
}
