package estabelecimento;

import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import digitalizadora.Scanner;
import impressora.Impressora;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}