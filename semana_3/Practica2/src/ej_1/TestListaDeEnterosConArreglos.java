package ej_1;

import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// 1.2
		// Como darme cuenta de que forma hacerlo ? 
		ListaDeEnteros l = new ListaDeEnterosConArreglos();
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
		int i = 0;
		while ((i< 100) && (i < args.length)) {
			int num = Integer.parseInt(args[i]);
			lista.agregarFinal(num);
			i++;
		}
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println("Num: "+ lista.proximo());
		}
		
		// 1.5
		System.out.println("==== Imprimir Inverso ====");
		lista.comenzar();
		imprimirInverso(lista);
		
		
	}
	
	/* Tambien podria hacer algo asi, estaria mejor ? o no influye mucho ?
	public static void imprInverso(ListaDeEnterosConArreglos lista) {
		lista.comenzar();
		imprimirInverso(lista);
	}
	*/
	
	public static void imprimirInverso(ListaDeEnterosConArreglos lista) {
		if(!lista.fin()){
			int num = lista.proximo();
			imprimirInverso(lista);
			System.out.println(num);
		}
	}

}
