package beans;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.crypto.Data;

public class PCD {
	private boolean Ativado;
	public static enum type{
		HIDROLOGICA,METEREOLOGICA;
	}
	public static enum subtype{
		RIO,RESERVATORIO,METEREOLOGICA,AGROMETEREOLOGICA;
	}
	
	private type tipo;
	private subtype subtipo;
	private String Identificador;
	private String Tombamento;
	private String Fabricante;
	private Date DataInstalacao;
	private String IdentificadorServidorFTP;
	private String Observacao;
	private CoordenadasGeograficas coordGeo;
	private DadosGeograficos dadosGeo;
	private LocalizacaoPCD localizacao;
	private ArrayList<Periferico> perifericos;
	
	public PCD(boolean ativado, type tipo, subtype subtipo, String identificador, String tombamento, String fabricante,
			Date dataInstalacao, String identificadorServidorFTP, String observacao, CoordenadasGeograficas coordGeo,
			DadosGeograficos dadosGeo, LocalizacaoPCD localizacao) {
		Ativado = ativado;
		this.tipo = tipo;
		if(this.tipo == type.HIDROLOGICA) {
			if(subtipo == subtype.RIO || subtipo == subtype.RESERVATORIO) {
				this.subtipo = subtipo;
			}
			else {
				System.out.println("Subtipo invalido");
				this.subtipo = null;
			}
		}else {
			if(subtipo == subtype.AGROMETEREOLOGICA || subtipo == subtype.METEREOLOGICA) {
				this.subtipo = subtipo;
			}else {
				System.out.println("Subtipo invalido");
				this.subtipo = null;
			}
		}
		
		Identificador = identificador;
		Tombamento = tombamento;
		Fabricante = fabricante;
		DataInstalacao = dataInstalacao;
		IdentificadorServidorFTP = identificadorServidorFTP;
		Observacao = observacao;
		this.coordGeo = coordGeo;
		this.dadosGeo = dadosGeo;
		this.localizacao = localizacao;
		perifericos = new ArrayList<>();
	}
	
	public boolean isAtivado() {
		return Ativado;
	}
	public void setAtivado(boolean ativado) {
		Ativado = ativado;
	}
	public String getIdentificador() {
		return Identificador;
	}
	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}
	public String getTombamento() {
		return Tombamento;
	}
	public void setTombamento(String tombamento) {
		Tombamento = tombamento;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public Date getDataInstalacao() {
		return DataInstalacao;
	}
	public void setDataInstalacao(Date dataInstalacao) {
		DataInstalacao = dataInstalacao;
	}
	public String getIdentificadorServidorFTP() {
		return IdentificadorServidorFTP;
	}
	public void setIdentificadorServidorFTP(String identificadorServidorFTP) {
		IdentificadorServidorFTP = identificadorServidorFTP;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	public CoordenadasGeograficas getCoordGeo() {
		return coordGeo;
	}
	public void setCoordGeo(CoordenadasGeograficas coordGeo) {
		this.coordGeo = coordGeo;
	}
	public DadosGeograficos getDadosGeo() {
		return dadosGeo;
	}
	public void setDadosGeo(DadosGeograficos dadosGeo) {
		this.dadosGeo = dadosGeo;
	}
	public LocalizacaoPCD getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(LocalizacaoPCD localizacao) {
		this.localizacao = localizacao;
	}

	public type getTipo() {
		return tipo;
	}

	public void setTipo(type tipo) {
		this.tipo = tipo;
	}

	public subtype getSubtipo() {
		return subtipo;
	}

	public void setSubtipo(subtype subtipo) {
		this.subtipo = subtipo;
	}

	public ArrayList<Periferico> getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(ArrayList<Periferico> perifericos) {
		this.perifericos = perifericos;
	}
	
	
	@Override
	public String toString() {
		String a ="\nPCD\n" +"Tipo: "+tipo +" Subtipo: "+subtipo+ " Identificador: "+ Identificador+" Tombamento: "+Tombamento+
				"\nFabricante: "+Fabricante+" Data instalação: "+DataInstalacao+" Identificador servidor FTP: "+ IdentificadorServidorFTP+
				"\nObservações: "+Observacao+ "\n"+coordGeo.toString()+dadosGeo.toString()+localizacao.toString();
		if(perifericos.size()>0) {
			return a+"\nPERIFÉRICOS"+perifericos.toString();
		}
		else {
			return a;
		}
	}
}
