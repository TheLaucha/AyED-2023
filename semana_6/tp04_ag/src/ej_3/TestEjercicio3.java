package ej_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestEjercicio3 {

	public static void main(String[] args) {
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(4);
		
		ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		hijos.agregarFinal(a2);
		hijos.agregarFinal(a3);
		hijos.agregarFinal(a4);
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(1, hijos);
		
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(9);
		
		ListaGenerica<ArbolGeneral<Integer>> hijosNodo2 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijosNodo2.agregarFinal(a5);
		hijosNodo2.agregarFinal(a6);
		a2.setHijos(hijosNodo2);
		
		ListaGenerica<ArbolGeneral<Integer>> hijosNodo3 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijosNodo3.agregarFinal(a7);
		a3.setHijos(hijosNodo3);
		
		ListaGenerica<ArbolGeneral<Integer>> hijosNodo4 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijosNodo4.agregarFinal(a8);
		hijosNodo4.agregarFinal(a9);
		a4.setHijos(hijosNodo4);
	
		/* System.out.println("Datos del Arbol: "+a.preOrden()); */
		
		RecorridosAG ej_3 = new RecorridosAG();
		ListaGenerica<Integer> l = ej_3.numerosImparesMayoresQuePreOrden(a, 2);
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());
		}
		System.out.println("================");
		ListaGenerica<Integer> l2 = ej_3.numerosImparesMayoresQueInOrden(a, 0);
		l2.comenzar();
		while(!l2.fin()) {
			System.out.println(l2.proximo());
		}
		System.out.println("================");
		ListaGenerica<Integer> l3 = ej_3.numerosImparesMayoresQuePostOrden(a, 0);
		l3.comenzar();
		while(!l3.fin()) {
			System.out.println(l3.proximo());
		}
		System.out.println("================");
		ListaGenerica<Integer> l4 = ej_3.numerosImparesMayoresQuePorNiveles(a, 0);
		l4.comenzar();
		while(!l4.fin()) {
			System.out.println(l4.proximo());
		}
		
	}

}
