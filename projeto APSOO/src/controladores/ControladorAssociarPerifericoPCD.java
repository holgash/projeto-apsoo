package controladores;

import java.util.ArrayList;
import java.util.Date;

import beans.PCD;
import beans.Periferico;
import beans.Registro;
import beans.Periferico.tipoPeriferico;
import beans.Registro.tipoOperacao;
import cadastros.CadastroHistorico;
import cadastros.CadastroPeriferico;

public class ControladorAssociarPerifericoPCD {
	private CadastroHistorico cadastroHistorico;
	private CadastroPeriferico cadastroPeriferico;
	
	public ControladorAssociarPerifericoPCD() {
		cadastroHistorico = new CadastroHistorico();
		cadastroPeriferico = new CadastroPeriferico();
	}
	
	public void adicionarPeriferico(ArrayList<Periferico> periferico,PCD pcd) {
		this.cadastroPeriferico.adicionarPeriferico(periferico,pcd);
		for(int i = 0; i<periferico.size();i++) {
			Date data = new Date();
			String obs = "Adicionando o periferico: "+ periferico.get(i).getNumSerie();
			this.cadastroHistorico.gerarHistorico(data, tipoOperacao.INCLUSAO, periferico.get(i).getTipo(), 0, periferico.get(i).getNumSerie(), obs);
		}
	}
	
	public void removerPeriferico(Periferico periferico) {
		this.cadastroPeriferico.removerPeriferico(periferico);
		Date data = new Date();
		String obs = "Removendo o periferico: " +periferico.getNumSerie();
		this.cadastroHistorico.gerarHistorico(data, tipoOperacao.REMOCAO, periferico.getTipo(),periferico.getNumSerie(),0, obs);
	}
	
	public ArrayList<Periferico> consultarPeriferico(tipoPeriferico tipo) {
		ArrayList<Periferico> consulta = this.cadastroPeriferico.consultarPeriferico(tipo);
		return consulta;
	}
	
	public void realizarSubstituicao(Periferico perifericoPre, Periferico perifericoPos,Date data, String observacao) {
		this.cadastroPeriferico.realizarSubstituicao(perifericoPre, perifericoPos);	
		this.cadastroHistorico.gerarHistorico(data, tipoOperacao.SUBSTITUICAO, perifericoPre.getTipo(), perifericoPre.getNumSerie(), perifericoPos.getNumSerie(), observacao);
		
	}
	
	public ArrayList<Registro> getRegistros(){ 
		return this.cadastroHistorico.getRegistros();
	}
}
