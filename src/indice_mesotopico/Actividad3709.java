package indice_mesotopico;

import java.util.ArrayList;

public class Actividad3709 {

	public Actividad3709() {
	}

	public int getIndiceMesotopico(String palabra) {

		if (palabra == null || palabra.isEmpty()) {
			return -1;
		}

		int indiceMeso = 0;
		char letra = 'a';
		String palabraMayus = palabra.toUpperCase();

		for (int i = 0; i < palabraMayus.length(); i++) {

			letra = palabraMayus.charAt(i);
			int valorLetra = switch (letra) {
			case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1;
			case 'D', 'G' -> 2;
			case 'B', 'C', 'M', 'P' -> 3;
			case 'F', 'H', 'V', 'W', 'Y' -> 4;
			case 'K' -> 5;
			case 'J', 'X' -> 8;
			case 'Q', 'Z' -> 10;
			default -> 0;

			};

			indiceMeso += valorLetra;

		}
		return indiceMeso;
	}

}