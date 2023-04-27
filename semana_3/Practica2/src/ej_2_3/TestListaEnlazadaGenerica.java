package ej_2_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class TestListaEnlazadaGenerica {
	
	// Porque no puedo usar una lista si no es en un metodo main ?
	static ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
	
	public static void main(String[] args) {
		Estudiante al1 = new Estudiante("Lionel","Messi","8456","lmessi@gmail.com","Rosario 48465");
		Estudiante al2 = new Estudiante("Angel","Di Maria","84153","admaria@gmail.com", "Rosario 843");
		Estudiante al3 = new Estudiante("Emiliano","Martinez","5298","emartinez@gmail.com", "MDP 698");
		Estudiante al4 = new Estudiante("Leandro","Paredes","1257","lparedes@gmail.com", "San justo 95");
		Estudiante al5 = new Estudiante();
		
		ListaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<Estudiante>();
		
		lista.agregarFinal(al1);
		lista.agregarFinal(al2);
		lista.agregarFinal(al3);
		lista.agregarFinal(al4);
		lista.agregarFinal(al5);
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println("___________________");
			System.out.println(lista.proximo().tusDatos());
		}
		
		// Probando metodo 2.4 D
		Estudiante[] arr = new Estudiante[5];
		arr[0] = al1;
		arr[1] = al2;
		arr[2] = al3;
		arr[3] = al4;
		arr[4] = al5;
		System.out.println(lista.agregarArreglo(arr));
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println("___________________");
			System.out.println(lista.proximo().tusDatos());
		}
	}
	
}
