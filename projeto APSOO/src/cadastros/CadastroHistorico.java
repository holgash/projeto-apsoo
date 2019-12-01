package cadastros;

import java.util.ArrayList;
import java.util.Date;

import beans.Periferico.tipoPeriferico;
import beans.Registro;
import beans.Registro.tipoOperacao;
import interfaces.IRepositorioHistorico;
import repositorios.RepositorioHistorico;

public class CadastroHistorico {
	private IRepositorioHistorico repositorioHistorico;
	
	public CadastroHistorico() {
		repositorioHistorico = RepositorioHistorico.getInstance();
	}
	
	public void gerarHistorico(Date data, tipoOperacao op, tipoPeriferico tipoPeri, int numeroPreOP, int numeroPosOP, String obs) {
		this.repositorioHistorico.gerarHistorico(data, op, tipoPeri, numeroPreOP, numeroPosOP, obs);
	}
	
	public ArrayList<Registro> getRegistros(){ 
		return this.repositorioHistorico.getRegistros();
	}
}
