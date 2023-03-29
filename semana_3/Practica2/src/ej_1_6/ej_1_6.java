package ej_1_6;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class ej_1_6 {
	// Esta bien inicializar asi ? O deberia crear un constructor que inicialize ?
	// Porque si no tengo constructor y no inicializo me tira nullpointer error.
	// Yo creia que si no se especificaba constructor se inicializaba todo por defecto, porque aca no ?
	private ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
	
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		lista.agregarFinal(n);
		if(n == 1) {
			// Estos dos return de lista entan OK ?
			return lista;
		}else {
			int res;
			if(n % 2 == 0) {
				res = n / 2;
			}else {
				res = 3*n + 1;
			}
			calcularSucesion(res);
		}
		return lista;
	}
	
}
