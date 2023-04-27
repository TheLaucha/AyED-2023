package ej_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> {
	private ListaGenerica<T> elementos = new ListaEnlazadaGenerica<T>();
	
	public void apilar(T elem) {
		this.elementos.agregarFinal(elem);
	}
	
	public T desapilar() {
		T elem = this.elementos.elemento(this.elementos.tamanio());
		this.elementos.eliminarEn(this.elementos.tamanio());
		return elem;
	}
	
	public T tope() {
		return this.elementos.elemento(this.elementos.tamanio());
	}
	
	public boolean esVacia() {
		return this.elementos.esVacia();
	}
}
