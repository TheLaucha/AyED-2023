package ej_2_1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ej_1_5 {

	public static void main(String[] args) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		
		int i = 0;
		while(i < args.length) {
			lista.agregarFinal(Integer.parseInt(args[i]));
			i++;
		}
		
		imprimirReverso(lista);
	}
	
	public static void imprimirReverso(ListaGenerica<Integer> lista) {
		lista.comenzar();
		iniciarImprimirReverso(lista);
	}
	
	private static void iniciarImprimirReverso(ListaGenerica<Integer> lista) {
		if(!lista.fin()) {
			int num = lista.proximo();
			iniciarImprimirReverso(lista);
			System.out.println(num);
		}
	}

}
