package beans;

public class LocalizacaoPCD {
	private String CEP;
	private String Logradouro;
	private int numero;
	private String Complemento;
	private String Bairro;
	private String Observacoes;
	private String InstrucoesParaLocalizacao;
	private String Estacao;
	
	
	public LocalizacaoPCD(String cEP, String logradouro, int numero, String complemento, String bairro,
			String observacoes, String instrucoesParaLocalizacao, String estacao) {
		CEP = cEP;
		Logradouro = logradouro;
		this.numero = numero;
		Complemento = complemento;
		Bairro = bairro;
		Observacoes = observacoes;
		InstrucoesParaLocalizacao = instrucoesParaLocalizacao;
		Estacao = estacao;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getObservacoes() {
		return Observacoes;
	}
	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}
	public String getInstrucoesParaLocalizacao() {
		return InstrucoesParaLocalizacao;
	}
	public void setInstrucoesParaLocalizacao(String instrucoesParaLocalizacao) {
		InstrucoesParaLocalizacao = instrucoesParaLocalizacao;
	}
	public String getEstacao() {
		return Estacao;
	}
	public void setEstacao(String estacao) {
		Estacao = estacao;
	}
	
	@Override
	public String toString() {
		return "\n\nLOCALIZAÇÃO PCD\n"+"CEP: "+CEP+" Logradouro: "+Logradouro + " Numero: "+ numero + " Complemento: "+ Complemento + " Bairro: "+ Bairro + 
				"\nObservações: "+ Observacoes + "\nInstruções pra localização: " + InstrucoesParaLocalizacao + "\nEstação: "+ Estacao;
	}
}
