package ej_2_1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ej_1_0 {
	public static void main (String[] args) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		
		int i = 0;
		while(i < args.length) {
			lista.agregarFinal(Integer.parseInt(args[i]));
			i++;
		}
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}
	
	
}
