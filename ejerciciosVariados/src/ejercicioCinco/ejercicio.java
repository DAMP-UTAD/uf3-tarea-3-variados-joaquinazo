package ejercicioCinco;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce un numero: ");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println(n + " es positivo ");
		} else if (n < 0) {
			System.out.println(n + " es negativo ");
		} else {
			System.out.println(n + " es nulo ");
		}

	}
}
