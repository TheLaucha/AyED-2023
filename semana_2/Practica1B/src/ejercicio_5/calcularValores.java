package ejercicio_5;

public class calcularValores {
	// Consultar por este ejercicio.
	
	
	public static void main(String[] args) {
		int[] valores = {5, 7, 2, 9, 4};
		// Devuelve utilizando mecanismo de retorno y metodos individuales.
		System.out.println("==== Metodos individuales ====");
		System.out.println(calcularMaximo(valores));
		System.out.println(calcularMinimo(valores));
		System.out.println(calcularPromedio(valores));
		// Devuelve utilizando mecanismo de retorno y un solo metodo.
		System.out.println("==== Metodo A ====");
		double[] arrMetodoA = metodoA(valores);
		System.out.println("Max: " + arrMetodoA[0] + "\n"
				+ "Min: " + arrMetodoA[1] + "\n"
				+ "Promedio: " + arrMetodoA[2]);
	}
	
	// Metodo A
	public static double[] metodoA(int[] valores) {
		double[] maxMinProm = {valores[0],valores[0],0};
		for(int i =0; i<valores.length; i++) {
			if(valores[i] > maxMinProm[0]) {
				maxMinProm[0] = valores[i];
			}
			if(valores[i] < maxMinProm[1]) {
				maxMinProm[1] = valores[i];
			}
			maxMinProm[2] += valores[i];
		}
		maxMinProm[2] = maxMinProm[2] / valores.length;
		return maxMinProm;
	}
	
	// Metodo B
	public static 
	
	public static int calcularMaximo(int[] valores) {
		int max = valores[0];
		for (int i = 0; i<valores.length; i++) {
			if(valores[i] > max) {
				max = valores[i];
			}
		}
		return max;
	}
	
	public static int calcularMinimo(int[] valores) {
		int min = valores[0];
		for(int i = 0; i<valores.length; i++) {
			if(valores[i] < min) {
				min = valores[i];
			}
		}
		return min;
	}
	
	public static double calcularPromedio(int[] valores) {
		double prom;
		double sum = 0;
		for(int i = 0; i<valores.length; i++) {
			sum += valores[i];
		}
		prom = sum / valores.length;
		return prom;
	}

}
