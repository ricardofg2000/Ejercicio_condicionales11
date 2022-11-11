package unico;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/* Realiza un minicuestionario con 10 preguntas 
		 * tipo test sobre las asignaturas que se imparten en el curso. 
		 * Cada pregunta acertada sumará un punto. El programa mostrará 
		 * al final la calificación obtenida. Pásale el minicuestionario a 
		 * tus compañeros y pídeles que lo hagan para ver qué tal andan de 
		 * conocimientos en las diferentes asignaturas del curso*/
		
		final String PREGUNTA1 ="¿Cuánto es 2 + 2?";
		final Integer resp1_1 = 2;
		final Integer resp1_2 = 4;
		final Integer resp1_3 = 13;
		final String PREGUNTA2 ="¿Cuánto es 5 + 2?";
		final Integer resp2_1 = 0;
		final Integer resp2_2 = 5;
		final Integer resp2_3 = 7;
		final String PREGUNTA3 ="¿Cuánto es 10 + 2?";
		final Integer resp3_1 = 15;
		final Integer resp3_2 = 12;
		final Integer resp3_3 = 1;
	
		
		Scanner leer = new Scanner(System.in);
		int respuesta;
		int nota = 0;
		
		System.out.println(PREGUNTA1);
		System.out.println("1) " + resp1_1);
		System.out.println("2) " + resp1_2);
		System.out.println("3) " + resp1_3);
		System.out.println("Respuesta:");
		respuesta = leer.nextInt();
		if (respuesta == 2) {
			nota = nota + 1;
		}
		
		System.out.println(PREGUNTA2);
		System.out.println("1) " + resp2_1);
		System.out.println("2) " + resp2_2);
		System.out.println("3) " + resp2_3);
		System.out.println("Respuesta:");
		respuesta = leer.nextInt();
		if (respuesta == 3) {
			nota = nota + 1;
		}
		
		System.out.println(PREGUNTA3);
		System.out.println("1) " + resp3_1);
		System.out.println("2) " + resp3_2);
		System.out.println("3) " + resp3_3);
		System.out.println("Respuesta:");
		respuesta = leer.nextInt();
		if (respuesta == 2) {
			nota = nota + 1;
		}
		
		System.out.println("Su nota es " + nota);

	}

}