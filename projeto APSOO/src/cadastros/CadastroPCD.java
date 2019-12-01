package cadastros;

import java.util.ArrayList;
import java.util.Date;

import beans.CoordenadasGeograficas;
import beans.DadosGeograficos;
import beans.LocalizacaoPCD;
import beans.PCD;
import beans.PCD.subtype;
import beans.PCD.type;
import interfaces.IRepositorioPCD;
import repositorios.RepositorioPCD;

public class CadastroPCD {
	private IRepositorioPCD repositorioPCD;
	
	public CadastroPCD() {
		repositorioPCD = RepositorioPCD.getInstance();
	}
	
	public PCD consultarPCD(CoordenadasGeograficas coord, DadosGeograficos dados, boolean ativado, type tipo, subtype subtipo, Date dataInstalacao) {
		return repositorioPCD.consultarPCD(coord, dados, ativado, tipo, subtipo, dataInstalacao);
	}
	public void cadastrarPCD(type tipo,subtype subtipo, String Identificador, String Tombamento,String Fabricante, Date DataInstalacao,	 
			String IdentificadorServidorFTP, String Observacao,CoordenadasGeograficas coord, DadosGeograficos dados, LocalizacaoPCD localizacao) {
		this.repositorioPCD.cadastrarPCD(tipo, subtipo, Identificador, Tombamento, Fabricante, DataInstalacao, IdentificadorServidorFTP, Observacao, coord, dados, localizacao);
	}
	
	public ArrayList<PCD> getPCDs(){
		return repositorioPCD.getPCDs();
	}
	
}
	
