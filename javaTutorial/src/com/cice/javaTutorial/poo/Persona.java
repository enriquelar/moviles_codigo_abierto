package com.cice.javaTutorial.poo;

import javax.swing.SingleSelectionModel;

public class Persona {
	// Un miembro de una clase es un atributo o un método
	//Los atributos definen el estado de un objeto
	private String nombre;
	private int edad;
	private String domicilio;
	
	//Un constructor es un método que sólo se puede invocar en la construcción de un objeto.
	//Define la forma en que un objeto se inicializa.
	public Persona(String nombre, int edad){
		this.nombre=nombre;
		setEdad(edad);
	}
	public Persona(String nombre, int edad, String domicilio){
		this.nombre=nombre;
		setEdad(edad);
		this.domicilio=domicilio;
	}
	
	//Los métodos definen la funcionalidad de un objeto
	public void print(){
		System.out.println("Persona[nombre: " + nombre + ",domicilio: "
				+ domicilio + ",edad: " + edad + "]");
	}
	public int getEdad(){
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
