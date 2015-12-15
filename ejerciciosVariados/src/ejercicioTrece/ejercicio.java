package ejercicioTrece;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sueldo = sc.nextInt();
		double antiguedad = sc.nextInt();
		if (sueldo <500 && antiguedad >= 10) {
			sueldo = sueldo * 1.20;
			System.out.println(sueldo);
		} else if(sueldo < 500 && antiguedad<10) { 
			sueldo = sueldo * 1.05;
			System.out.println(sueldo);
		}else {
			System.out.println(sueldo);
		}
	}

}
