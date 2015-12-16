package ejercicioTreintayuno;

import java.util.*;

public class ejercicio {

	public static void main(String[] args) {
		int positive = 0, negative = 0, couple = 0, fif = 0, quan, n;
		Scanner sc = new Scanner(System.in);
		quan = sc.nextInt();
		for (int i = 0; i < quan; i++) {
			n = sc.nextInt();
			if (n >= 0) {
				positive++;
			} else {
				negative++;
			}
			if (n%15==0) {
				fif++;
			}
			if (n%2==0) {
				couple++;
			}
		}
		System.out.println("Numero de positivos: " + positive);
		System.out.println("Numero de negativos: " + negative);
		System.out.println("Numero de numero multiplos de 15: "+ fif);
		System.out.println("Numero  de pares: "+ couple);
	}

}
