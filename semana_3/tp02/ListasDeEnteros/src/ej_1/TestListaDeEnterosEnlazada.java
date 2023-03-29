package ej_1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// 1.3
		int[] numeros = {1,2,3,4,5};
		
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		for(int i = 0; i<numeros.length; i++) {
			lista.agregarFinal(numeros[i]);
		}
		
		lista.comenzar();
		int i = 0;
		while(i<lista.tamanio()) {
			System.out.println("Num: "+ lista.proximo());
			i++;
		}
		
		// 1.4
		// Diferencias ? Ninguna
		
		
	}

}
