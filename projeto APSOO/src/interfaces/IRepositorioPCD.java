package interfaces;

import java.util.ArrayList;
import java.util.Date;

import beans.CoordenadasGeograficas;
import beans.DadosGeograficos;
import beans.LocalizacaoPCD;
import beans.PCD;
import beans.Periferico;
import beans.PCD.subtype;
import beans.PCD.type;
import beans.Periferico.tipoPeriferico;

public interface IRepositorioPCD {
	PCD consultarPCD(CoordenadasGeograficas coord, DadosGeograficos dados, boolean ativado, type tipo, subtype subtipo, Date dataInstalacao);
	void cadastrarPCD(type tipo,subtype subtipo, String Identificador, String Tombamento,String Fabricante, Date DataInstalacao,	 
			String IdentificadorServidorFTP, String Observacao,CoordenadasGeograficas coord, DadosGeograficos dados, LocalizacaoPCD localizacao);	
	void adicionarPeriferico(ArrayList<Periferico> periferico,PCD pcd);
	void removerPeriferico(Periferico periferico);
	ArrayList<Periferico> consultarPeriferico(tipoPeriferico tipo);
	void realizarSubstituicao(Periferico perifericoPre,Periferico perifericoPos);
	ArrayList<PCD> getPCDs();
}
