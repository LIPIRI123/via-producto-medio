/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author lipiri
 */
public class principal {
    public static void main(String[]org)
    {
        Scanner l=new Scanner(System.in);
        System.out.println("ingrese la semilla 1");
        int x1=l.nextInt();
        System.out.println("ingrese la semilla 2");
        int x2=l.nextInt();
        System.out.println("cuantas Iteraciones quiere");
        int n=l.nextInt();
        algoritmos_generadores_de_numeros_Aleatorios mo=new algoritmos_generadores_de_numeros_Aleatorios(x1,x2,n);
       mo.imprimir();
    }
}
