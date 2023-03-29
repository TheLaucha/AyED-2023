package ej_1;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// 1.2
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
	
	public static void imprimirInverso(ListaDeEnterosConArreglos lista) {
		if(lista.fin()) {
			return;
		}else {
			int num = lista.proximo();
			imprimirInverso(lista);
			System.out.println(num);
		}
	}

}
