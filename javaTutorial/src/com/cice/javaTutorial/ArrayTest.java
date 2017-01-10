package com.cice.javaTutorial;

public class ArrayTest {

	public static void main(String[] args) {
		int [] miArray = new int [10];
		miArray[0]=12;
		miArray[1]=24;
		miArray[2]=36;
		miArray[3]=48;
		miArray[4]=60;
		miArray[5]=72;
		miArray[6]=84;
		miArray[7]=96;
		miArray[8]=108;
		miArray[9]=120;
		//for clasico
		for(int i =0; i<miArray.length; i++){
			System.out.println(miArray[i]);
		}
		//for each
		for(int x: miArray){
			System.out.println(x);
		}
		
		//inicializacion de matrices
		String[] mistringArray = {"carlos","pedro","pepe","manu"};
		for(String x :mistringArray){
			System.out.println(x);
		}

	}

}
