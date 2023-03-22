package ejercicio_1;

public class ej_1 {
	
	public static void printByFor(int a, int b) {
		for(int i = a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void printByWhile(int a, int b) {
		int aux = a;
		while(aux<=b) {
			System.out.println(aux);
			aux++;
		}
	}
	
	public static void printByManual(int a, int b) {
		int aux = a;
		if(a <= b) {
			System.out.println(aux);
			printByManual(aux+1,b);
		}
	}
}
