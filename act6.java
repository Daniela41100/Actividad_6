package Act6;

import java.util.Scanner;

public class act6 {

	String nombre;
	double calif1, calif2, calif3, calif4, calif5;
	double suma;
	double promedio;
	char calificacion;
	
	
	Scanner entrada = new Scanner(System.in);
	
	public void Datos() {
		
		System.out.println("Ingrese el nombre del estudiante");
		nombre = entrada.next();
		
		System.out.println("Ingrese la primera calificaci�n: ");
		calif1 = entrada.nextDouble();
		System.out.println("Ingrese la segunda calificaci�n: ");
		calif2 = entrada.nextDouble();
		System.out.println("Ingrese la tercera calificaci�n: ");
		calif3 = entrada.nextDouble();
		System.out.println("Ingrese la cuarta calificaci�n: ");
		calif4 = entrada.nextDouble();
		System.out.println("Ingrese la quinta calificaci�n: ");
		calif5 = entrada.nextDouble();
		
	}
	
	public void Calculos() {
		
		suma = calif1 + calif2 + calif3 + calif4 + calif5;
		promedio = suma / 5;
		
	}
	
	public void Resultados() {
		
		System.out.println("Nombre del alumno: " + nombre);
		System.out.println("Calificaci�n 1: " + calif1);
		System.out.println("Calificaci�n 2: " + calif2);
		System.out.println("Calificaci�n 3: " + calif3);
		System.out.println("Calificaci�n 4: " + calif4);
		System.out.println("Calificaci�n 5: " + calif5);
		System.out.println("Promedio: " + promedio);
		
	}
	
	public void Final() {
		
		if(promedio <= 50) {
			System.out.println("Calificaci�n: F");
		}else {
			if(promedio >= 51 && promedio <= 60) {
				System.out.println("Calificaci�n: E");
			}else {
				if(promedio >= 61 && promedio <= 70) {
					System.out.println("Calificaci�n: D");
				}else {
					if(promedio >= 71 && promedio <= 80) {
						System.out.println("Calificaci�n: C");
					}else {
						if(promedio >= 81 && promedio <= 90) {
							System.out.println("Calificaci�n: B");
						}else {
							if(promedio >= 91 && promedio <=100) {
								System.out.println("Calificaci�n: A");
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		act6 notas = new act6 ();
		notas.Datos();
		notas.Calculos();
		notas.Resultados();
		notas.Final();
		
	
		
	}

}
