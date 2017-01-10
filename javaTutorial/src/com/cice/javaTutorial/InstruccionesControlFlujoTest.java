package com.cice.javaTutorial;

public class InstruccionesControlFlujoTest {

	public static void main(String[] args) {
		int puntuacion = 12;
		if(puntuacion>5){
			System.out.println("Aprobado");
		}else{
			System.out.println("Suspenso");
		}
		
		switch(puntuacion){
		case 0:
			System.out.println("suspenso");
			break;
		case 1:
			System.out.println("suspenso");
			break;
		case 3:
			System.out.println("suspenso");
			break;
		case 4:
			System.out.println("suspenso");
			break;
		case 5:
			System.out.println("suspenso");
			break;
		case 6:
			System.out.println("Aprobado");
			break;	
		case 7:
			System.out.println("Aprobado");
			break;
		case 8:
			System.out.println("Aprobado");
			break;
		case 9:
			System.out.println("Aprobado");
			break;
		case 10:
			System.out.println("Matricula de honor");
			break;
			default:
				System.out.println("puntuacion no valida");

		}
		puntuacion=0;
		while(puntuacion<10){
			System.out.println("Incrementando puntuacion...");
			puntuacion++;
		}
		System.out.println("puntuacion final " + puntuacion);
		for(puntuacion=0;puntuacion<10;puntuacion++){
			System.out.println("Incrementando puntuacion...");
		}
		System.out.println("puntuacion final " + puntuacion +"(for)");
		do{
			puntuacion++;
			System.out.println("Incrementando puntuacion...");
		}while(puntuacion<10);
		System.out.println("puntuacion final " + puntuacion +"(do while)");
		puntuacion=0;
		while(puntuacion<100){
			System.out.println("Incrementando puntuacion...");
			puntuacion++;
			if(puntuacion==10){
				break;
			}
			
		}
		System.out.println("puntuacion final " + puntuacion );
	}
	
}
