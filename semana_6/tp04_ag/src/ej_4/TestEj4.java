package ej_4;

import ej_3.RecorridosAG;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/*
ARBOL 
				  11	
		 /	   	   |        \
		/          |         \
 	   13		  	6		  7	
    / | \       /   \        |
   /  |  \     /     \       |
   3  4  5    8       9	  10
   						  |
   						  |
   						  24
   						  |
   						  |
   						  29
*/

public class TestEj4 {

	public static void main(String[] args) {
		ListaGenerica<ArbolGeneral<Integer>> lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> k = new ArbolGeneral<Integer>(24);
		ArbolGeneral<Integer> l = new ArbolGeneral<Integer>(29);
		
		f.agregarHijo(h);
		f.agregarHijo(i);
		
		g.agregarHijo(j);
		
		j.agregarHijo(k);
		
		k.agregarHijo(l);
		
		lista.agregarFinal(c);
		lista.agregarFinal(d);
		lista.agregarFinal(e);
		
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(13,lista);

		
		lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		lista.agregarFinal(b);
		lista.agregarFinal(f);
		lista.agregarFinal(g);
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(11,lista);
		
		System.out.println("Altura: " + a.altura());
		System.out.println("Nivel: " + a.nivel(55));
		System.out.println("Ancho: " + a.ancho());
	}

}
