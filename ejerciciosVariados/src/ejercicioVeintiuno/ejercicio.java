package ejercicioVeintiuno;
import java.util.*;
public class ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value;
		int couple = 0;
		int nocouple = 0;
		while (n > 0) {
			n--;
			value = sc.nextInt();
			if (value%2==0) {
				couple++;
			} else {
				nocouple++;

			}
		}
		System.out.println("El numero de pares es " + couple);
		System.out.println("El numero de impares es " + nocouple);

	}
}
