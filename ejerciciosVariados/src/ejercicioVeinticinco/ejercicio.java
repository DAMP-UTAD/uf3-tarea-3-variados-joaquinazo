package ejercicioVeinticinco;
import java.util.*;
public class ejercicio {

	public static void main(String[] args) {
		int contador = 0;
		int n,total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("DAME 10 NUMEROS: ");
		for (int i = 0; i < 10; i++) {
			contador++;
			n = sc.nextInt();
			if (contador>5) {
				total = total + n;
			}
		}
		System.out.println("LA SUMA DE LOS ULTIMOS 5 NUMEROS ES : " + total);
	}

}
