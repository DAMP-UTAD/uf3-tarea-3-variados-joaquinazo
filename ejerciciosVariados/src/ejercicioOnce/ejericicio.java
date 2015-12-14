package ejercicioOnce;

import java.util.Scanner;

public class ejericicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 < 10 || n2 < 10 || n3 < 10) {
			System.out.println("Alguno de los numero es menor a 10");
		}
	}
}
