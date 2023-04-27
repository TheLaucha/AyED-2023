package ej_7;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable <T> {
	private ArbolGeneral<T> red;
	
	public RedDeAguaPotable(ArbolGeneral<T> red) {
		this.red = red;
	}
	
	public double minimoCaudal(double caudal) {
		ArbolGeneral<T> raiz = red;
		double caudalMin = minimoCaudal(caudal,raiz);
		return caudalMin;
	}
	
	private double minimoCaudal(double caudal, ArbolGeneral<T> nodo) {
		double min = caudal;
		if(nodo.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> lHijos = nodo.getHijos();
			double cantHijos = lHijos.tamanio();
			double caudalAEnviar = caudal / cantHijos;
			lHijos.comenzar();
			while(!lHijos.fin()) {
				double caudalMin = minimoCaudal(caudalAEnviar,lHijos.proximo());
				if(caudalMin < min) {
					min = caudalMin;
				} 
			}
		}
		return min;
	}
}
