package ejercicioDieciseis;

import java.util.Scanner;

public class ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantas alturas quieres promediar");
		double n = sc.nextInt();
		double n2 = 0;
		double n3 = 0;
		double n4 =0;
 		while (n2 < n) {
			n2++;
			System.out.println("Dame una altura en cm");
			n3 = sc.nextInt();
			n4 = n4 + n3;
			System.out.println(n4);
			

		}
 		double promedio = (n4 / n);
		System.out.println("el promedio de altura es" + promedio + "cm");
	}
}
