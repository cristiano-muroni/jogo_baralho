package baralho;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math;

public class Baralho {
	private List<Carta> naipe = new ArrayList<Carta>();
	private List<Carta> valor = new ArrayList<Carta>();

	public List<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(List<Carta> naipe) {
		this.naipe = naipe;
	}

	public List<Carta> getValor() {
		return valor;
	}

	public void setValor(List<Carta> valor) {
		this.valor = valor;
	}

	public void montar() {
        
	}

	public void embaralhar() {
		Random r = new Random();

	}

	public void exibir() {

	}

}
