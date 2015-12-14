package ejercicioSiete;

public class ejercicio {
	public static void main(String[] args) {
		int np = 100;
		int npc = 91;
		int percent = (100 * npc) / np;
		if (percent < 50) {
			System.out.println("fuera de nivel");
		} else if (percent >= 50 && percent <= 75) {
			System.out.println("Nivel regular");
		} else if (percent > 75 && percent <= 90) {
			System.out.println("Nivel medio");
		} else {
			System.out.println("Nivel maximo");
		}

	}

}
