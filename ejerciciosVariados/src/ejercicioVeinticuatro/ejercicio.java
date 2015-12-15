package ejercicioVeinticuatro;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		int base, altura, triangle = 0, superficie, ntriangle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos triangulos quieres calcular? ");
		ntriangle = sc.nextInt();
		for (int i = 0; i < ntriangle; i++) {
			System.out.println("dime la base del triangulo" + i);
			base = sc.nextInt();
			System.out.println("dime la altura del triangulo" + i);
			altura = sc.nextInt();
			superficie = base * altura;
			System.out.println("La superficie del triangulo " + i + " es : " + superficie);
			if (superficie > 12) {
				triangle++;
			}

		}
		System.out.println("El numero de triangulos cuya superficie es mayor de 12cm2 es : " + triangle);

	}

}
