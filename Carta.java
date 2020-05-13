package baralho;

public class Carta {
	Naipe naipe;
	Valor valor;
	public Carta(Naipe naipe, Valor valor) {
		this.naipe = naipe;
		this.valor = valor;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	
	
	
	
  
}
