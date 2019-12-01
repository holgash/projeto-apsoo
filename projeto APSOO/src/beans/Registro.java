package beans;

import java.util.Date;

import beans.Periferico.tipoPeriferico;

public class Registro {

	public static enum tipoOperacao{
		INCLUSAO,SUBSTITUICAO,REMOCAO;
	}
	private tipoOperacao tipoOP;
	private tipoPeriferico tipoPeriferico;
	private int NumeroSeriePreOP;
	private int NumeroSeriePosOP;
	private String Observacao;
	private Date data;
	
	
	public Registro(Date data,tipoOperacao tipoOP, beans.Periferico.tipoPeriferico tipoPeriferico, int numeroSeriePreOP,
			int numeroSeriePosOP, String observacao) {
		this.tipoOP = tipoOP;
		this.tipoPeriferico = tipoPeriferico;
		NumeroSeriePreOP = numeroSeriePreOP;
		NumeroSeriePosOP = numeroSeriePosOP;
		Observacao = observacao;
		this.data = data;
	}
	
	public tipoOperacao getTipoOP() {
		return tipoOP;
	}
	public void setTipoOP(tipoOperacao tipoOP) {
		this.tipoOP = tipoOP;
	}
	public tipoPeriferico getTipoPeriferico() {
		return tipoPeriferico;
	}
	public void setTipoPeriferico(tipoPeriferico tipoPeriferico) {
		this.tipoPeriferico = tipoPeriferico;
	}
	public int getNumeroSeriePreOP() {
		return NumeroSeriePreOP;
	}
	public void setNumeroSeriePreOP(int numeroSeriePreOP) {
		NumeroSeriePreOP = numeroSeriePreOP;
	}
	public int getNumeroSeriePosOP() {
		return NumeroSeriePosOP;
	}
	public void setNumeroSeriePosOP(int numeroSeriePosOP) {
		NumeroSeriePosOP = numeroSeriePosOP;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "\nREGISTRO\n"+"Operação :"+tipoOP+ " Tipo periférico: "+ tipoPeriferico + "\nNumero de série pré operação: "+NumeroSeriePreOP +
				" Numero de série pós operação: "+NumeroSeriePosOP + "\nObservações: "+Observacao+ " Data: "+data+"\n";
	}
}
