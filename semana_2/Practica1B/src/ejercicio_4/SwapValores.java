package ejercicio_4;

public class SwapValores {
	
	public static void swap1 (int x, int y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
	
	public static void swap2 (Integer x, Integer y) {
		System.out.println(x);
		System.out.println(y);
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
}
