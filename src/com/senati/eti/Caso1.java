package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.modelo.Calculadora1;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        Calculadora1 calc = new Calculadora1();
        
        System.out.print("Primer n�mero: ");
        float n1 = sc.nextFloat();
        
        System.out.print("Segundo n�mero: ");
        float n2 = sc.nextFloat();
        
        calc.setNumero1(n1);
        calc.setNumero2(n2);
        
        System.out.println("N�meros Ingresados");
        System.out.println("==================");
        System.out.println("N�mero 1.... "+calc.getNumero1());
        System.out.println("N�mero 2....."+calc.getNumero2());
        
        System.out.println("---RESULTADOS--- ");
        System.out.println("=================");
        System.out.println("Suma.............."+ calc.Suma());
        System.out.println("Resta............."+ calc.Resta());
        System.out.println("Producto.........."+ calc.Producto());
        if (calc.Division()==0) {
        	System.out.println("Divisi�n........No es posible");
        	System.out.println("Resto entero....No es posible");}
        else {
        System.out.println("Divisi�n.........."+ calc.Division());
        System.out.println("Resto entero......"+ calc.RestoEntero());}
        
        System.out.println("El n�mero mayor es " + calc.Mayor());
        System.out.println("El n�mero menor es " + calc.Menor());       
               
	}

}