package ejercicioQuince;

import java.util.*;

public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 10;
		int n2 = 0;
		int n3;
		int mayor = 0;
		int menor = 0;
		while (n2 < n1) {
			n2++;
			n3 = sc.nextInt();
			if (n3 > 7) {

				mayor++;

			}

		}
		System.out.println("hay: " + mayor + " con mas de 7");
	}

}
