package ej_1_6;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class test_ej_1_6 {

	public static void main(String[] args) {
		ej_1_6 ej = new ej_1_6();
		
		ListaDeEnterosEnlazada lista = ej.calcularSucesion(6);
		
		lista.comenzar(); // Es correcto hacer esto siempre aunque no sea necesario ya que es la primera vez que se recorre la lista ?
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}

}
