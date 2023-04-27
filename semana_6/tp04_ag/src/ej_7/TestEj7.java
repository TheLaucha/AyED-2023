package ej_7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestEj7 {
	
	public static void main(String args[]) {
		
		ArbolGeneral<String> tuberia = new ArbolGeneral<String>("A");
		tuberia.agregarHijo(new ArbolGeneral<String>("B"));
		tuberia.agregarHijo(new ArbolGeneral<String>("C"));
		tuberia.agregarHijo(new ArbolGeneral<String>("D"));
		tuberia.agregarHijo(new ArbolGeneral<String>("E"));

		tuberia.getHijos().elemento(2).agregarHijo(new ArbolGeneral<String>("F"));
		tuberia.getHijos().elemento(2).agregarHijo(new ArbolGeneral<String>("G"));
		tuberia.getHijos().elemento(2).getHijos().elemento(2).agregarHijo(new ArbolGeneral<String>("L"));

		tuberia.getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("H"));
		tuberia.getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("I"));
		tuberia.getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("J"));
		tuberia.getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("K"));
		tuberia.getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("O"));
		tuberia.getHijos().elemento(3).getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("M"));
		tuberia.getHijos().elemento(3).getHijos().elemento(3).agregarHijo(new ArbolGeneral<String>("N"));

		RedDeAguaPotable red = new RedDeAguaPotable(tuberia);
		
		System.out.println("MINIMO : "+ red.minimoCaudal(1000.00));
		
	}
	
	
}
