package controladores;

import java.util.ArrayList;
import java.util.Date;

import beans.CoordenadasGeograficas;
import beans.DadosGeograficos;
import beans.LocalizacaoPCD;
import beans.PCD;
import beans.PCD.subtype;
import beans.PCD.type;
import cadastros.CadastroPCD;

public class ControladorManterPCD {
	private CadastroPCD cadastroPCD;
	
	public ControladorManterPCD() {
		cadastroPCD = new CadastroPCD();
	}
	
	public PCD consultarPCD(CoordenadasGeograficas coord, DadosGeograficos dados, boolean ativado, type tipo, subtype subtipo, Date dataInstalacao) {
		return this.cadastroPCD.consultarPCD(coord, dados, ativado, tipo, subtipo, dataInstalacao);
	}
	
	public void cadastrarPCD(type tipo,subtype subtipo, String Identificador, String Tombamento,String Fabricante, Date DataInstalacao,	 
			String IdentificadorServidorFTP, String Observacao,CoordenadasGeograficas coord, DadosGeograficos dados, LocalizacaoPCD localizacao) {
		this.cadastroPCD.cadastrarPCD(tipo, subtipo, Identificador, Tombamento, Fabricante, DataInstalacao, IdentificadorServidorFTP, Observacao, coord, dados, localizacao);
	}
	
	public ArrayList<PCD> getPCDs(){
		return this.cadastroPCD.getPCDs();
	}
}
