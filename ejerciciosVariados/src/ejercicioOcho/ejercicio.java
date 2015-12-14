package ejercicioOcho;
import java.util.*;
public class ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dia");
		int dia =sc.nextInt();
		System.out.println("Introduce mes");
		int mes= sc.nextInt();
		if (dia == 25 && mes ==12) {
			System.out.println("navidad");
		} else {
			System.out.println("no es navidad");
		}
	}

}
