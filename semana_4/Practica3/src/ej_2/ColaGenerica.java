package ej_2;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.NodoGenerico;

public class ColaGenerica<T> {
	private ListaGenerica<T> elementos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elem) {
		this.elementos.agregarFinal(elem);
	}
	
	// Porque si pongo el objeto <T> me tira error ?
	// Que pasa si quiero desencolar y esta vacia ? Deberia preguntarlo en el programa main o deberia hacerlo en este metodo ?
	public T desencolar(){
		T elem = this.elementos.elemento(0);
		this.elementos.eliminarEn(0);
		return elem;
	}
	
	public T tope() {
		return this.elementos.elemento(this.elementos.tamanio());
	}
	
	public boolean esVacia() {
		return this.elementos.fin();
	}
	
}
