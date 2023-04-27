package ej_3;

public class test_ej_3 {

	public static void main(String[] args) {
		ColaGenerica<Integer> datos = new ColaGenerica<Integer>();
		
		datos.encolar(5);
		datos.encolar(10);
		datos.encolar(15);
		datos.encolar(20);
		datos.encolar(25);
		
		System.out.println("Tope: ");
		System.out.println(datos.tope());
		System.out.println("Elimino el primero");
		System.out.println(datos.desencolar());
		System.out.println("Pregunto si esta vacia, deberia ser false");
		System.out.println(datos.esVacia());
		System.out.println(datos.desencolar());
		System.out.println(datos.desencolar());
		System.out.println(datos.desencolar());
		// si la cola esta vacia que deberia hacer ? donde deberia preguntar ? aca o en el metodo ? como se hace ?
		System.out.println(datos.desencolar());
		System.out.println(datos.desencolar());
		
		PilaGenerica<Integer> pila = new PilaGenerica<Integer>();
		pila.apilar(5);
		pila.apilar(10);
		pila.apilar(15);
		pila.apilar(20);
		
		System.out.println("Desapila: ");
		System.out.println(pila.desapilar());
		System.out.println(pila.tope());
		System.out.println(pila.esVacia());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
		System.out.println(pila.esVacia());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
	}

}
