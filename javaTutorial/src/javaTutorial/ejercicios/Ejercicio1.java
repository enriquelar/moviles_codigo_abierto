package javaTutorial.ejercicios;

/*
 * Hacer un programa que inicialize un array con 10 cadenas y muestre el mas largo de ellos.
 */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		String[] cadenas = {"carlos","pedro","pepe","manu","lorenzo","samuel","guillermo","javier","alejandro","paco"};
		String vacio = "";
	
		for(String x : cadenas){
				if(x.length() > vacio.length()){
					vacio = x;
				}
		}
		System.out.println(vacio);
	}
}
