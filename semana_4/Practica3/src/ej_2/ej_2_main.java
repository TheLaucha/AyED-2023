package ej_2;
import tp03.ejercicio1.ArbolBinario;

public class ej_2_main {
	
	public static void imprimirArbol(ArbolBinario<Integer> a) {
		System.out.println(a.getDato());
		if(a.tieneHijoIzquierdo()) {
			imprimirArbol(a.getHijoIzquierdo());
		}
		if(a.tieneHijoDerecho()) {
			imprimirArbol(a.getHijoDerecho());
		}
	}

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
		
		arbol.setDato(1);
		
		ArbolBinario<Integer> nodo1 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> nodo2 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> nodo3 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> nodo4 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> nodo5 = new ArbolBinario<Integer>(6);
		arbol.agregarHijoIzquierdo(nodo1);
		arbol.agregarHijoDerecho(nodo2);
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(nodo3);
		arbol.getHijoIzquierdo().agregarHijoDerecho(nodo4);
		arbol.getHijoDerecho().agregarHijoIzquierdo(nodo5);
		
		System.out.println("==== Contar hojas ====");
		System.out.println("El arbol tiene: " + arbol.contarHojas() + " hojas...");
		
		System.out.println("==== Imprimo ====");
		imprimirArbol(arbol);
		
		System.out.println("Imprimir por niveles");
		arbol.entreNiveles(1, 2);
		
		System.out.println("Imprimir por niveles espejado");
		arbol.espejo().entreNiveles(1, 2);
	}

}
