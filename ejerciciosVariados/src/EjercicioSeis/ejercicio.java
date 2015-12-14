package EjercicioSeis;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int n = sc.nextInt();
		if (n >99) {
			System.out.println(n + " el numero tiene tres cifras");
		} else if(n >9) {
			System.out.println(n + " el numero tiene dos cifras");

		}else{
			System.out.println(n + " el numero tiene una cifras");
		}
	}

}
