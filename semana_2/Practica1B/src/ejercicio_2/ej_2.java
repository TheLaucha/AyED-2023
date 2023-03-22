package ejercicio_2;

public class ej_2 {
	
	public static int[] obtenerMultiplos(int n) {
		int[] arreglo = new int[n];
		int aux = 0;
		while(aux < n) {
			arreglo[aux] = (aux+1) * n;
			aux++;
		}
		return arreglo;
	}
}
