package ejercicioDiecisiete;

import java.util.*;

public class ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wage = "cuanto cobra";

		int out = 0;

		int group13 = 0;
		
		int group300 = 0;
		System.out.println("Cuantos empleados hay? ");

		int emp = sc.nextInt();
		while (emp > 0) {
			emp--;
			System.out.println(wage);
			int wages = sc.nextInt();
			if (wages > 100) {
				if (wages >= 100 && wages <= 300) {
					group13++;

				} else {
					group300++;
				}
			}

			out = out + wages;
		}
		System.out.println("Total de gastos para la empresa" + out + " $");
		System.out.println("Entre 100$ y 300$ " + group13 + " empleados");
		System.out.println("Entre 100$ y 300$ " + group300 + " empleados");
	}
}
