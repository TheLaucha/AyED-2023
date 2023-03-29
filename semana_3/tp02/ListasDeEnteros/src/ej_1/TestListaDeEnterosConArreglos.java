package ej_1;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// 1.2
		int[] numeros = {1,2,3,4,5};
		
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
		for(int i = 0; i<numeros.length; i++) {
			lista.agregarFinal(numeros[i]);
		}
		
		lista.comenzar();
		int i = 0;
		while(i < lista.tamanio()) {
			int num = lista.proximo();
			System.out.println("Num: "+ num);
			i++;
		}
		
		

	}

}
