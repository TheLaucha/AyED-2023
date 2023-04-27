package tp02.ejercicio2;

public class ColaGenerica<T> {
	private ListaGenerica<T> elementos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elem) {
		this.elementos.agregarFinal(elem);
	}
	
	public T desencolar(){
		T elem = this.elementos.elemento(1);
		this.elementos.eliminarEn(1);
		return elem;
	}
	
	public T tope() {
		return this.elementos.elemento(this.elementos.tamanio());
	}
	
	public boolean esVacia() {
		return this.elementos.tamanio() == 0;
	}
	
}
