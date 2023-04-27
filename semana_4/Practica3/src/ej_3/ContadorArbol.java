package ej_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	private ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
	
	public ContadorArbol() {
		
	}
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	
	
	public ArbolBinario<Integer> getArbol() {
		return arbol;
	}

	public void setArbol(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		inOrden(arbol, lista);
		//postOrden(arbol,lista);
		return lista;
	}
	
	public void inOrden(ArbolBinario<Integer> nodo, ListaEnlazadaGenerica<Integer> lista) {
		if(nodo.tieneHijoIzquierdo()) {
			inOrden(nodo.getHijoIzquierdo(),lista);
		}
		if((nodo.getDato() % 2) == 0) {
			lista.agregarFinal(nodo.getDato());
		}
		if(nodo.tieneHijoDerecho()) {
			inOrden(nodo.getHijoDerecho(),lista);
		}
	}
	
	public void postOrden(ArbolBinario<Integer> nodo, ListaEnlazadaGenerica<Integer> lista) {
		if(nodo.tieneHijoIzquierdo()) {
			postOrden(nodo.getHijoIzquierdo(),lista);
		}
		if(nodo.tieneHijoDerecho()) {
			postOrden(nodo.getHijoDerecho(), lista);
		}
		if(nodo.getDato() % 2 == 0) {
			lista.agregarFinal(nodo.getDato());
		}
	}
}
