package ejercicioVeinte;

import java.util.*;

public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list = 15;
		int value1 = 0;
		int value2 = 0;
		while (list > 0) {
			list--;
			System.out.println("Dame un numero para lista 1 ");
			int val = sc.nextInt();
			value1 = value1 + val;
		}
		if (list == 0) {
			list = 15;
		}

		while (list > 0) {
			list--;
			System.out.println("Dame un numero para la lista 2");
			int val = sc.nextInt();
			value2 = value2 + val;

		}
		if (value1 > value2) {
			System.out.println("Lista uno mayor");
		} else if (value2 < value1) {
			System.out.println("Lista dos mayor");
		} else {
			System.out.println("Listas iguales");
		}

	}

}
