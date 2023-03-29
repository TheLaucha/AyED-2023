package ejercicio_5;

public class calcularValores {
	// Consultar por este ejercicio.
	// Dudas sobre los distintos incisos, a, b y c.
	
	static Datos incisoC = new Datos();
	
	public static void main(String[] args) {
		int[] valores = {5, 7, 2, 9, 4};
		// Devuelve utilizando mecanismo de retorno y metodos individuales.
		System.out.println("==== Metodos individuales ====");
		System.out.println(calcularMaximo(valores));
		System.out.println(calcularMinimo(valores));
		System.out.println(calcularPromedio(valores));
		
		// Devuelve utilizando mecanismo de retorno y un solo metodo.
		System.out.println("==== Metodo A ====");
		Datos incisoA = metodoA(valores);
		System.out.println("Max: " + incisoA.getMax() + "\n" 
		+ "Min: " + incisoA.getMin() + "\n"
		+ "Prom: " + incisoA.getProm());
		
		// Devuelve interactuando con un parametro.
		System.out.println("==== Metodo B ====");
		Datos incisoB = new Datos();
		metodoB(incisoB, valores);
		System.out.println("Max: " + incisoB.getMax() + "\n" 
				+ "Min: " + incisoB.getMin() + "\n"
				+ "Prom: " + incisoB.getProm());
		
		// Devuelve sin usar parametros ni la sentencia return.
		System.out.println("==== Metodo C ====");
		metodoC(valores);
		System.out.println("Max: " + incisoC.getMax() + "\n" 
				+ "Min: " + incisoC.getMin() + "\n"
				+ "Prom: " + incisoC.getProm());
		
	}
	
	// Metodo A
	public static Datos metodoA(int[] valores) {
		Datos obj = new Datos();
		obj.setMax(valores[0]);
		obj.setMin(valores[0]);
		double aux = 0;
		for(int i =0; i<valores.length; i++) {
			if(valores[i] > obj.getMax()) {
				obj.setMax(valores[i]);
			}
			if(valores[i] < obj.getMin()) {
				obj.setMin(valores[i]);
			}
			aux += valores[i];
		}
		obj.setProm(aux / valores.length);
		return obj;
	}
	
	// Metodo B
	public static void metodoB(Datos obj, int[] valores) {
		obj.setMax(valores[0]);
		obj.setMin(valores[0]);
		double aux = 0;
		for(int i =0; i<valores.length; i++) {
			if(valores[i] > obj.getMax()) {
				obj.setMax(valores[i]);
			}
			if(valores[i] < obj.getMin()) {
				obj.setMin(valores[i]);
			}
			aux += valores[i];
		}
		obj.setProm(aux / valores.length);
	}
	
	// Metodo C
		public static void metodoC(int[] valores) {
			incisoC.setMax(valores[0]);
			incisoC.setMin(valores[0]);
			double aux = 0;
			for(int i =0; i<valores.length; i++) {
				if(valores[i] > incisoC.getMax()) {
					incisoC.setMax(valores[i]);
				}
				if(valores[i] < incisoC.getMin()) {
					incisoC.setMin(valores[i]);
				}
				aux += valores[i];
			}
			incisoC.setProm(aux / valores.length);
		}
	
	// Metodo propio
	
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
