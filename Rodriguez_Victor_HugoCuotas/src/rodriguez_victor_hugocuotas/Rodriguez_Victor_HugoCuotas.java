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
        double cuotas, totalCuotas, tasaInteres, comisionCuotas, seguroMensual;
        
        System.out.print("Favor ingrese el precio del producto: ");
            precioTotal = scanner.nextInt();
            
        System.out.print("Favor ingrese la cantidad de cuotas que desea: ");
             cuotas = scanner.nextInt();
        
        System.out.print("Ingresar la tasa de interes: ");
             tasaInteres = scanner.nextDouble()/100;
        
        System.out.print("Ingrese la comision por cuota: ");
             comisionCuotas = scanner.nextDouble()/100;
             
        System.out.print("Ingrese el porcentaje del seguro mensual: ");
             seguroMensual = scanner.nextDouble()/100;  
             
        
        totalCuotas = precioTotal/cuotas;
        double intereses = (cuotas*tasaInteres);
        double comision = (cuotas*comisionCuotas);
        double seguro = (cuotas*seguroMensual);
        double totalPagar = totalCuotas + intereses + comision + seguro;
        
        System.out.println("****Coutoas Mensuales****");
        System.out.print("Cuotas de pago mensual: HNL "+totalPagar+
                         "\nTotal a pagar: HNL "+precioTotal+"\n");
        
    }
    
}
