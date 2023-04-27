package tp04.ejercicio1;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		if(this.esHoja()) {
			return 0;
		}else {
			int alturaMax = 0;
			if(this.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
				lHijos.comenzar();
				while(!lHijos.fin()) {
					int alturaHijo = lHijos.proximo().altura();
					if(alturaHijo > alturaMax) {
						alturaMax = alturaHijo;
					}
				}
			}
			return 1 + alturaMax;
		}
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 0;
		ArbolGeneral<T> aux;
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				if(aux.getDato().equals(dato)) {
					return nivel;
				}
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> lHijos = aux.getHijos();
					lHijos.comenzar();
					while(!lHijos.fin()) {
						cola.encolar(lHijos.proximo());
					}
				}
			}else {
				if(!cola.esVacia()) {
					nivel++;
					cola.encolar(null);
				}
			}
		}
		return -1;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		
		cola.encolar(this);
		cola.encolar(null);
		
		int anchoMax = 0;
		int anchoNivel = 0;
		
		ArbolGeneral<T> aux;
		
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				anchoNivel++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> lHijos = aux.getHijos();
					lHijos.comenzar();
					while(!lHijos.fin()) {
						cola.encolar(lHijos.proximo());
					}
				}
			}else {
				if(!cola.esVacia()) {
					cola.encolar(null);
				}
				if(anchoNivel > anchoMax) {
					anchoMax = anchoNivel;
				}
				anchoNivel = 0;
			}
		}
		return anchoMax;
	}
	
	public boolean esAncestro(T a, T b) {
		ArbolGeneral<T> nodoA = buscar(a,this);
		if(nodoA == null) {
			return false;
		}
		boolean esAncestro = esAncestroDe(nodoA,b);
		return esAncestro;
	}
	
	private ArbolGeneral<T> buscar(T a, ArbolGeneral<T> nodo){
		if(nodo.getDato() == a) {
			return nodo;
		}
		if(nodo.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> lHijos = nodo.getHijos();
			lHijos.comenzar();
			while(!lHijos.fin()) {
				ArbolGeneral<T> result = buscar(a,lHijos.proximo());
				if(result != null) {
					return result;
				}
			}
		}
		return null;
	}
	
	private boolean esAncestroDe(ArbolGeneral<T> ancestro, T b) {
		if(ancestro.getDato() == b) {
			return true;
		}
		if(ancestro.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> lHijos = ancestro.getHijos();
			lHijos.comenzar();
			while(!lHijos.fin()) {
				boolean esAncestro = esAncestroDe(lHijos.proximo(),b);
				if(esAncestro) {
					return true;
				}
			}
		}
		return false;
	}
	
	// Ejercicio 3 preguntar como se implementaria aca.
	
}