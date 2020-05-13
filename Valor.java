package baralho;

public enum Valor {
	As("as"),
	Dois("dois"),
	Três("tres"),
	Quatro("quatro"),
	Cinco("cinco"),
	Seis("seis"),
	Sete("sete"),
	Oito("oito"),
	Nove("nove"),
	Dez("dez"),
	Dama("dama"),
	Valete("valete"),
	Reis("reis");
	
	private String valor;

	private Valor(String valor) {
		this.setValor(valor);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}

