package com.cice.javaTutorial.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1=new Estudiante("Luis", 22,
				"4524545", "POO","Android","IOS");
		System.out.println(e1.getNumeroCursos());
		Estudiante e2=new Estudiante("Manuel", 25,
				"11111111");
		System.out.println(e2.getNumeroCursos());
		e1.print();
		e1.addCurso("SQL");e1.print();
		e1.removeCurso("Java");e1.print();
	}

}
