package repositorios;

import java.util.ArrayList;
import java.util.Date;

import beans.Periferico.tipoPeriferico;
import beans.Registro;
import beans.Registro.tipoOperacao;
import interfaces.IRepositorioHistorico;

public class RepositorioHistorico implements IRepositorioHistorico{
	ArrayList<Registro> registros = new ArrayList<Registro>();
	private static RepositorioHistorico instance;
	
	
	private RepositorioHistorico() {
		registros = new ArrayList<Registro>();
	}
	
	public static RepositorioHistorico getInstance() {
		if(instance == null) {
			instance = new RepositorioHistorico();
		}
		return instance;
	}

	@Override
	public void gerarHistorico(Date data, tipoOperacao op, tipoPeriferico tipoPeri, int numeroPreOP, int numeroPosOP,
			String obs) {
		registros.add(new Registro(data,op, tipoPeri, numeroPreOP, numeroPosOP, obs));
		
	}

	public ArrayList<Registro> getRegistros() {
		return registros;
	}
	
	
}
