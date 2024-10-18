/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_victor_hugocuotas;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Rodriguez_Victor_HugoCuotas {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int precioTotal;
        double cuotas, totalCuotas;
        
        System.out.print("Favor ingrese el precio del producto: ");
            precioTotal = scanner.nextInt();
            
        System.out.print("Favor ingrese la cantidad de cuotas que desea: ");
             cuotas = scanner.nextInt();
        
        totalCuotas = precioTotal/cuotas;
        
        System.out.println("****Coutoas Mensuales****");
        System.out.print("Cuotas de pago mensual: HNL "+totalCuotas+
                         "\nTotal a pagar: HNL "+precioTotal+"\n");
        
    }
    
}
