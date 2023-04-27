package tp03.ejercicio1;

import ej_2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());
	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		// La raiz cuenta como hoja ? 
		// Este metodo la trata como si fuera una hoja.
		if(this.esHoja()) {
			return 1;
		}else if(!this.tieneHijoIzquierdo()) {
			return this.getHijoDerecho().contarHojas();
		}else if(!this.tieneHijoDerecho()) {
			return this.getHijoIzquierdo().contarHojas();
		}else {
			return this.getHijoIzquierdo().contarHojas() + this.getHijoDerecho().contarHojas();
		}
	}

    public ArbolBinario<T> espejo() {
		ArbolBinario<T> aux = new ArbolBinario<T>();
		aux.setDato(this.dato);
		
		if(this.tieneHijoIzquierdo()) {
			aux.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
		}
		
		if(this.tieneHijoDerecho()) {
			aux.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		}
		
		return aux;
	}


	public void entreNiveles(int n, int m){
		ListaEnlazadaGenerica<ArbolBinario<T>> lista = new ListaEnlazadaGenerica<ArbolBinario<T>>();
		lista.agregarFinal(this);
		
		int nivelActual = 0;
		
		while(!lista.esVacia() && nivelActual <= m) {
			int cantidadDeNodosEnElNivelActual = lista.tamanio();
			
			if(nivelActual >= n && nivelActual <= m) {
				System.out.println("Nivel: " + nivelActual);
				
				for(int i = 0; i<cantidadDeNodosEnElNivelActual; i++) {
					// Guardo el primer nodo y lo elimino de la lista.
					ArbolBinario<T> nodoActual = lista.elemento(1);
					lista.eliminarEn(1);
					
					System.out.print(nodoActual.getDato() + " - ");
					
					if(nodoActual.tieneHijoIzquierdo()) {
						lista.agregarFinal(nodoActual.getHijoIzquierdo());
					}
					
					if(nodoActual.tieneHijoDerecho()) {
						lista.agregarFinal(nodoActual.getHijoDerecho());
					}
				}
				System.out.println("_____________");
			}else {
				for(int i = 0; i<cantidadDeNodosEnElNivelActual; i++) {
					ArbolBinario<T> nodoActual = lista.elemento(1);
					lista.eliminarEn(1);
					
					if(nodoActual.tieneHijoIzquierdo()) {
						lista.agregarFinal(nodoActual.getHijoIzquierdo());
					}
					
					if(nodoActual.tieneHijoDerecho()) {
						lista.agregarFinal(nodoActual.getHijoDerecho());
					}
				}
			}
			
			nivelActual++;
			
		}
		
	}
	
	
	/*
	public void recorridoPorNiveles(int n, int m) {
	    // Se crea una cola y se agrega el nodo raíz del árbol
	    Queue<ArbolBinario<T>> cola = new LinkedList<>();
	    cola.offer(this);
	    
	    // Se inicializa el nivel actual en 0
	    int nivelActual = 0;
	    
	    // Se inicia un ciclo mientras la cola no esté vacía
	    while (!cola.isEmpty()) {
	        // Se obtiene la cantidad de nodos en la cola en este momento (es decir, la cantidad de nodos en el nivel actual)
	        int cantidadNodosNivelActual = cola.size();
	        
	        // Si el nivel actual se encuentra dentro del rango deseado, se imprime el encabezado del nivel actual
	        if (nivelActual >= n && nivelActual <= m) {
	            System.out.print("Nivel " + nivelActual + ": ");
	            
	            // Se procesan todos los nodos en la cola en este momento
	            for (int i = 0; i < cantidadNodosNivelActual; i++) {
	                // Se obtiene el nodo actual de la cola y se imprime su valor
	                ArbolBinario<T> nodoActual = cola.poll();
	                System.out.print(nodoActual.getValor() + " ");
	                
	                // Si el nodo actual tiene un hijo izquierdo, se agrega a la cola
	                if (nodoActual.getHijoIzquierdo() != null) {
	                    cola.offer(nodoActual.getHijoIzquierdo());
	                }
	                
	                // Si el nodo actual tiene un hijo derecho, se agrega a la cola
	                if (nodoActual.getHijoDerecho() != null) {
	                    cola.offer(nodoActual.getHijoDerecho());
	                }
	            }
	            
	            // Se imprime un salto de línea después de procesar todos los nodos del nivel actual
	            System.out.println();
	        } else {
	            // Si el nivel actual no se encuentra dentro del rango deseado, se procesan los nodos de la misma manera pero 					sin imprimir nada
	            for (int i = 0; i < cantidadNodosNivelActual; i++) {
	                ArbolBinario<T> nodoActual = cola.poll();
	                
	                if (nodoActual.getHijoIzquierdo() != null) {
	                    cola.offer(nodoActual.getHijoIzquierdo());
	                }
	                
	                if (nodoActual.getHijoDerecho() != null) {
	                    cola.offer(nodoActual.getHijoDerecho());
	                }
	            }
	        }
	        
	        // Se incrementa el nivel actual antes de continuar con el siguiente ciclo
	        nivelActual++;
	    }
	}
	*/

	

}
