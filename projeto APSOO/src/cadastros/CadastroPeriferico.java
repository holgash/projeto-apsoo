package cadastros;

import java.util.ArrayList;

import beans.PCD;
import beans.Periferico;
import beans.Periferico.tipoPeriferico;
import interfaces.IRepositorioPCD;
import repositorios.RepositorioPCD;

public class CadastroPeriferico {
	private IRepositorioPCD repositorioPeriferico;
	
	public CadastroPeriferico() {
		repositorioPeriferico = RepositorioPCD.getInstance();
	}
	
	public void adicionarPeriferico(ArrayList<Periferico> periferico, PCD pcd) {
		this.repositorioPeriferico.adicionarPeriferico(periferico,pcd);
	}
	public void removerPeriferico(Periferico periferico) {
		this.repositorioPeriferico.removerPeriferico(periferico);
	}
	public ArrayList<Periferico> consultarPeriferico(tipoPeriferico tipo) {
		return this.repositorioPeriferico.consultarPeriferico(tipo);
	}
	public void realizarSubstituicao(Periferico perifericoPre,Periferico perifericoPos) {
		this.repositorioPeriferico.realizarSubstituicao(perifericoPre, perifericoPos);
	}
	
}
