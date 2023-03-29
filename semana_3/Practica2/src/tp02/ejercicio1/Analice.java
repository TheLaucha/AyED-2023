package tp02.ejercicio1;

public class Analice {
	// a) ¿Podría darle comportamiento a algún método de la superclase ListaDeEnteros? ¿Por qué la clase
	// se define como abstracta? Note que una subclase implementa la lista usando un arreglo de tamaño fijo
	// y la otra usando nodos enlazados.
	// Creo que no, se define como abstracta porque tiene metodos en comun con otras clases hijos, 
	// pero estos difieren en como se implementan.
	
	// b) Considerando los enlaces entre nodos, ¿qué diferencias existen entre agregar un nodo al principio
	// de la lista, agregar un nodo en el medio y agregar un nodo al final?
	// La diferencia esta en las acciones que se realizan en cada forma.
	// Agregar al principio y en el medio realizan casi los mismos pasos. La diferencia es que agregar al inicio es un metodo que
	// llama al metodo agregarEn.
	
	// c) Una lista implementada con arreglos, ¿tiene su primer elemento en el índice del vector: 0, 1 o
	// depende de la implementación?
	// Por lo que veo es en el indice 1, pero la verdad no entiendo porque.
	
}
