package ejercicioTres;
import java.util.*;
public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int n = sc.nextInt();
		if (n > 9) {
			System.out.println(n + " tiene dos digitos");
		} else {
			System.out.println(n + " tiene un digito");
		}

	}

}
