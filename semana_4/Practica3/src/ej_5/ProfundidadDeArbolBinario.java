package ej_5;

import ej_2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	
	public int sumaElementosProfundidad(int p) {
		ListaEnlazadaGenerica<Integer> lista = entreNivelesConRetorno(p);
		int suma = 0;
		lista.comenzar();
		while(!lista.fin()) {
			suma += lista.proximo();
		}
		
		return suma;
	}
	
	private ListaEnlazadaGenerica<Integer> entreNivelesConRetorno(int p){
		ListaEnlazadaGenerica<Integer> datos = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(arbol);
		cola.encolar(null);
		
		int nivelActual = 0;
		
		while(!cola.esVacia() && nivelActual <= p) {
			ArbolBinario<Integer> nodoAct = cola.desencolar();
			
			if(nodoAct != null) {
				if(nivelActual == p) {
					int aux = ( Integer) nodoAct.getDato();
					datos.agregarFinal(aux);
				}else {
					if(nodoAct.tieneHijoIzquierdo()) {
						cola.encolar(nodoAct.getHijoIzquierdo());
					}
					if(nodoAct.tieneHijoDerecho()) {
						cola.encolar(nodoAct.getHijoDerecho());
					}
				}
			}else if(!cola.esVacia()) {
				cola.encolar(null);
				nivelActual++;
			}
		}
		
		return datos;
	}
	
}
