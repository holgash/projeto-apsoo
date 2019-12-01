package repositorios;

import java.util.ArrayList;
import java.util.Date;

import beans.CoordenadasGeograficas;
import beans.DadosGeograficos;
import beans.LocalizacaoPCD;
import beans.PCD;
import beans.PCD.subtype;
import beans.PCD.type;
import beans.Periferico;
import beans.Periferico.tipoPeriferico;
import interfaces.IRepositorioPCD;

public class RepositorioPCD implements IRepositorioPCD{
	private ArrayList<PCD> PCDs;
	private static RepositorioPCD instance = null;
	
	private RepositorioPCD() {
		PCDs = new ArrayList<PCD>();
	}
	
	public static RepositorioPCD getInstance() {
		if(instance == null) {
			instance = new RepositorioPCD();
		}
		return instance;
	}
	
	@Override
	public PCD consultarPCD(CoordenadasGeograficas coord, DadosGeograficos dados, boolean ativado, type tipo,
			subtype subtipo, Date dataInstalacao) {
		for(int i = 0; i< PCDs.size(); i++) {
			if(PCDs.get(i).getCoordGeo() == coord && PCDs.get(i).getDadosGeo() == dados && PCDs.get(i).isAtivado() == ativado 
					&& PCDs.get(i).getTipo() == tipo && PCDs.get(i).getSubtipo() == subtipo && PCDs.get(i).getDataInstalacao() == dataInstalacao) {
				return PCDs.get(i);
			}
		}
		return null;
	}

	@Override
	public void cadastrarPCD(type tipo, subtype subtipo, String Identificador, String Tombamento, String Fabricante,
			Date DataInstalacao, String IdentificadorServidorFTP, String Observacao, CoordenadasGeograficas coord,
			DadosGeograficos dados, LocalizacaoPCD localizacao) {
		
		PCDs.add(new PCD(true, tipo, subtipo, Identificador,Tombamento,Fabricante,DataInstalacao,IdentificadorServidorFTP,Observacao, 
				coord, dados, localizacao));
	}

	@Override
	public void adicionarPeriferico(ArrayList<Periferico> periferico, PCD pcd) {
		int i =PCDs.indexOf(pcd);
		PCDs.get(i).getPerifericos().addAll(periferico);
	}

	@Override
	public void removerPeriferico(Periferico periferico) {
		for(int i = 0; i< PCDs.size(); i++) {//varrer os PCD
			for(int j = 0;j<PCDs.get(i).getPerifericos().size();j++) {//varrer os perifericos do PCD[i]
				if(PCDs.get(i).getPerifericos().get(j) == periferico) {
					PCDs.get(i).getPerifericos().remove(periferico);
					
				}
			}
		}
	}

	@Override
	public ArrayList<Periferico> consultarPeriferico(tipoPeriferico tipo) {
		ArrayList<Periferico> consulta = new ArrayList<Periferico>();
		for(int i = 0; i< PCDs.size(); i++) {//varrer os PCD
			for(int j = 0;j<PCDs.get(i).getPerifericos().size();j++) {//varrer os perifericos do PCD[i]
				if(PCDs.get(i).getPerifericos().get(j).getTipo() == tipo) {
					consulta.add(PCDs.get(i).getPerifericos().get(j));
				}
			}
		}
		return consulta;
	}

	@Override
	public void realizarSubstituicao(Periferico perifericoPre, Periferico perifericoPos) {
		for(int i = 0; i< PCDs.size(); i++) {//varrer os PCD
			for(int j = 0;j<PCDs.get(i).getPerifericos().size();j++) {//varrer os perifericos do PCD[i]
				if(PCDs.get(i).getPerifericos().get(j) == perifericoPre) {
					PCDs.get(i).getPerifericos().remove(perifericoPre);
					PCDs.get(i).getPerifericos().add(perifericoPos);
				}
			}
		}
	}

	public ArrayList<PCD> getPCDs() {
		return PCDs;
	}
	
	

}
