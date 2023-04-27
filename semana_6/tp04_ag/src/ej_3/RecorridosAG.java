package ej_3;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		this.numerosImparesMayoresQuePreOrden(a,n,lista);
		return lista;
	}
	
	private void numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista){
		int dato = a.getDato();
		if(dato > n && dato%2 != 0) {
			lista.agregarFinal(dato);
		}
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
			lHijos.comenzar();
			while(!lHijos.fin()) {
				// Porque utilizando la sintaxis que esta en los ppt me da error ? y no termino de entender como es que funciona ?
				// No entiendo como es que avanza sobre los hijos.
				// Si al metodo siempre le estoy pasando el arbol "a" siempre estoy preguntando por el mismo dato ? 
				// (lHijos.proximo()).numerosImparesMayoresQuePreOrden(a,n,lista);
				numerosImparesMayoresQuePreOrden(lHijos.proximo(),n,lista);
			}
		}
	}
	
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numeroImparesMayoresQueInOrden(a,n,lista);
		return lista;
	}
	
	private void numeroImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
			// Tengo dudas aca, el metodo elemento() se supone que empieza en la pos 0, pero si uso 0 me tira error, y si uso 1, me funciona bien.
			if(!lHijos.esVacia()) {
				numeroImparesMayoresQueInOrden(lHijos.elemento(1),n,lista);
			}
		}
		Integer dato = a.getDato();
		if(dato > n && dato % 2 != 0) {
			lista.agregarFinal(dato);
		}
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
			int tamanio = lHijos.tamanio();
			for(int i = 2; i<=tamanio; i++) {
				numeroImparesMayoresQueInOrden(lHijos.elemento(i),n,lista);
			}
		}
	}
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden(a,n,lista);
		return lista;
	}
	
	public void numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
			lHijos.comenzar();
			while(!lHijos.fin()) {
				numerosImparesMayoresQuePostOrden(lHijos.proximo(),n,lista);
			}
		}
		int dato = a.getDato();
		if(dato > n && dato%2 != 0) {
			lista.agregarFinal(dato);
		}
	}
	
	
	// Este metodo me tira el siguiente error y no logro descubrir el porque.
	// Exception in thread "main" java.lang.NullPointerException
	// at ej_3.RecorridosAG.numerosImparesMayoresQuePorNiveles(RecorridosAG.java:87)
	// at ej_3.TestEjercicio3.main(TestEjercicio3.java:63)
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.encolar(a);
		ArbolGeneral<Integer> aux;
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux.getDato() > n && aux.getDato()%2 != 0) {
				lista.agregarFinal(aux.getDato());
			}
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> lHijos = aux.getHijos();
				lHijos.comenzar();
				while(!lHijos.fin()) {
					cola.encolar(lHijos.proximo());
				}
			}
		}
		return lista;
	}
	
	// Como se implementarian los metodos en la clase ArbolGeneral <T> ? 
	
}
