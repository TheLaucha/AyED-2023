package ej_1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// 1.3
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		int i = 0;
		while(i < args.length) {
			int num = Integer.parseInt(args[i]);
			lista.agregarFinal(num);
			i++;
		}
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println("Num: "+ lista.proximo());
		}
		
		// 1.4
		// Diferencias ? No veo ninguna. Solo que la lista enlazada no tiene un limite.
		
		// 1.5
		System.out.println("==== Imprimir Inverso ====");
		lista.comenzar();
		imprimirInverso(lista);
		
	}
	
	public static void imprimirInverso(ListaDeEnterosEnlazada lista) {
		if(lista.fin()) {
			return;
		}else {
			int num = lista.proximo();
			imprimirInverso(lista);
			System.out.println(num);
		}
	}

}
