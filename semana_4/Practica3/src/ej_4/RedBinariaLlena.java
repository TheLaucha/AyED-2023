package ej_4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;
	
	public RedBinariaLlena(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	
	public int retardoReenvio() {
		return retardoReenvio(arbol);
	}
	
	private int retardoReenvio(ArbolBinario<Integer> a) {
		// si estoy en una hoja retorno el dato o 0
		if(a.esHoja()) {
			return a.getDato();
		}else {
			int izq = retardoReenvio(a.getHijoIzquierdo());
			int der = retardoReenvio(a.getHijoDerecho());
			int retardoAct = a.getDato();
			
			if(izq > der) {
				return retardoAct + izq;
			}else {
				return retardoAct + der;
			}
		}
	}
}
