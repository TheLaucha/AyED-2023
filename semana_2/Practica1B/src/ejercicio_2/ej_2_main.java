package ejercicio_2;

import java.util.Scanner;

public class ej_2_main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero N y obtenga los primeros N multiplos del mismo.");
		int n = s.nextInt();
		
		int[] arreglo = ej_2.obtenerMultiplos(n);
		
		for(int i = 0; i<n; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
