package com.cice.javaTutorial.poo;

public class Estudiante extends Persona{
	private String nie;
	private String[] cursos;
	
	public Estudiante(String nombre, int edad, String nie, String...cursos) {
		super(nombre, edad);
		this.nie=nie;
		this.cursos=cursos;
	}
	
	public int getNumeroCursos(){
		return cursos.length;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	public void addCurso(String curso){
		String[] copia=cursos;
		cursos=new String[cursos.length+1];
		int i;
		for(i=0;i<copia.length;i++){
			cursos[i]=copia[i];
		}
		cursos[i]=curso;
	}
	
	/**
	 * Elimina el parámetro "curso" del atributo "cursos",ajustando su tamaño	
	 * @param curso, el curso que se desea eliminar del atributo cursos
	 */
	public void removeCurso(String curso){
		String[] newCursos=cursos.length>0?
				new String[cursos.length-1]:null;
		if(newCursos==null) return;
		for(int i=0;i<cursos.length;i++){
			if(cursos[i].equals(curso)){
				for(int j=i+1;j<cursos.length;j++){
					newCursos[j-1]=cursos[j];
				}
				cursos=newCursos;
				return;
			}else{
				newCursos[i]=cursos[i];
			}
		}
	}
		
	
	public void print(){
		System.out.println("Alumno[nombre: " + getNombre() +
				", edad: " + getEdad() + ", domicilio: " + getDomicilio() +
				", NIE: " + getNie() + ", Numero cursos: " + getNumeroCursos() + "]");
	}
}
