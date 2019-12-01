package controladores;

import java.util.ArrayList;
import java.util.Date;

import beans.CoordenadasGeograficas;
import beans.DadosGeograficos;
import beans.LocalizacaoPCD;
import beans.PCD;
import beans.Periferico;
import beans.Registro;
import beans.PCD.subtype;
import beans.PCD.type;
import beans.Periferico.tipoPeriferico;

public class Fachada {

	private static Fachada instancia = null;
	private ControladorAssociarPerifericoPCD controladorAssociarPerifericoPCD;
	private ControladorManterPCD controladorManterPCD;
	
	private Fachada() {
		this.controladorAssociarPerifericoPCD =  new ControladorAssociarPerifericoPCD();
		this.controladorManterPCD = new ControladorManterPCD();
	}

	public static Fachada getInstancia() {
		if(instancia == null) {
			instancia =  new Fachada();
		}
		return instancia;
	}

	public PCD consultaPCD(CoordenadasGeograficas coord, DadosGeograficos dados, boolean ativado, type tipo, subtype subtipo, 
							Date dataInstalacao) {
		return controladorManterPCD.consultarPCD(coord, dados, ativado, tipo, subtipo, dataInstalacao);
	}
	
	public void cadastrarPCD(type tipo,subtype subtipo, String Identificador, String Tombamento,String Fabricante, Date DataInstalacao,	 
			String IdentificadorServidorFTP,String Observacao,CoordenadasGeograficas coord,DadosGeograficos dados,LocalizacaoPCD localizacao){
		
		controladorManterPCD.cadastrarPCD(tipo, subtipo, Identificador, Tombamento, Fabricante, DataInstalacao, IdentificadorServidorFTP, 
										Observacao, coord, dados, localizacao);
	}
	
	public void adicionarPeriferico(ArrayList<Periferico> periferico,PCD pcd) {
		controladorAssociarPerifericoPCD.adicionarPeriferico(periferico,pcd);
	}
	
	public void removerPeriferico(Periferico periferico) {
		controladorAssociarPerifericoPCD.removerPeriferico(periferico);
	}
	
	public ArrayList<Periferico> consultarPeriferico(tipoPeriferico tipo){
		return controladorAssociarPerifericoPCD.consultarPeriferico(tipo);
	}
	
	public void realizarSubstituicao(Periferico perifericoPre, Periferico perifericoPos,Date data, String observacao) {
		controladorAssociarPerifericoPCD.realizarSubstituicao(perifericoPre, perifericoPos, data, observacao);
	}
	
	public ArrayList<Registro> getRegistros(){ 
		return this.controladorAssociarPerifericoPCD.getRegistros();
	}
	
	public ArrayList<PCD> getPCDs(){
		return this.controladorManterPCD.getPCDs();
	}

	public ControladorManterPCD getControladorManterPCD() {
		return controladorManterPCD;
	}
	
	
}
