package ejercicio_3;

public class Test {

	public static void main(String[] args) {
		Estudiante[] arrEstudiantes = new Estudiante[2];
		Profesor[] arrProfesores = new Profesor[3];
		
		// Inicializo en vacio todos los objetos.
		
		for(int i = 0; i<arrEstudiantes.length; i++) {
			arrEstudiantes[i] = new Estudiante();
		}
		for(int i = 0; i<arrProfesores.length; i++) {
			arrProfesores[i] = new Profesor();
		}
	
		// Seteo valores
		arrEstudiantes[0].setNombre("Sebastian");
		arrEstudiantes[0].setApellido("Battaglia");
		arrEstudiantes[0].setEmail("seba.battaglia@gmail.com");
		arrEstudiantes[0].setDireccion("17titulos");
		arrEstudiantes[0].setComision("17");
		// Seteo valores
		arrEstudiantes[1].setNombre("Guillermo");
		arrEstudiantes[1].setApellido("Barros Schelotto");
		arrEstudiantes[1].setEmail("Guille.Schelotto@gmail.com");
		arrEstudiantes[1].setDireccion("16titulos");
		arrEstudiantes[1].setComision("16");
		// Seteo valores
		arrProfesores[0].setNombre("Carlos");
		arrProfesores[0].setApellido("Bianchi");
		arrProfesores[0].setEmail("carlos.bianchi@gmail.com");
		arrProfesores[0].setCatedra("9");
		arrProfesores[0].setFacultad("1998");
		// Seteo valores
		arrProfesores[1].setNombre("Mario");
		arrProfesores[1].setApellido("Fortunato");
		arrProfesores[1].setEmail("mario.fortunato@gmail.com");
		arrProfesores[1].setCatedra("6");
		arrProfesores[1].setFacultad("1930");
		// Seteo valores
		arrProfesores[2].setNombre("Juan Carlos");
		arrProfesores[2].setApellido("Lorenzo");
		arrProfesores[2].setEmail("jc.lorenzo@gmail.com");
		arrProfesores[2].setCatedra("5");
		arrProfesores[2].setFacultad("1976");
		
		for(int i = 0; i<arrEstudiantes.length; i++) {
			System.out.println("----------------");
			System.out.println(arrEstudiantes[i].tusDatos());
		}
		for(int i = 0; i<arrProfesores.length; i++) {
			System.out.println("----------------");
			System.out.println(arrProfesores[i].tusDatos());
		}
		
		
	}

}
