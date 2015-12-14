package ejercicioDoce;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x>0 && y>0) {
			System.out.println("primer cuadrante");
		}else {
			System.out.println("segundo cuadrante");
		}
	}

}
