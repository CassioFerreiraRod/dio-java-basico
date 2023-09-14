package estabelecimento;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;
import equipamento.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional  em = new EquipamentoMultifuncional();
		
		
		Impressora impressora = em;
		Copiadora copiadora = em;
		Digitalizadora digitalizadora = em;
		
		copiadora.copiar();
		digitalizadora.digitalizar();
		impressora.imprimir();
	}
}
