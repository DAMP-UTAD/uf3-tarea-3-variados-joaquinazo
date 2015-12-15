package ejercicioVeintisiete;

import java.util.*;

public class ejercicio {
	public static void main(String[] args) {
		System.out.println("De que numero quieres la tabla: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < 13; i++) {
			System.out.println(n +" * "+ i +  " = " + n*i);
		}
	}
}
