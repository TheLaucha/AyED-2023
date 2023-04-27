package ej_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class test_ej_3 {
	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
		
		arbol.setDato(1);
		ArbolBinario<Integer> nodo1 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> nodo2 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> nodo3 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> nodo4 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> nodo5 = new ArbolBinario<Integer>(6);
		arbol.agregarHijoIzquierdo(nodo1);
		arbol.agregarHijoDerecho(nodo2);
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(nodo3);
		arbol.getHijoIzquierdo().agregarHijoDerecho(nodo4);
		arbol.getHijoDerecho().agregarHijoIzquierdo(nodo5);
		
		ContadorArbol contador = new ContadorArbol(arbol);
		ListaEnlazadaGenerica<Integer> lista = contador.numerosPares();
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}
}
