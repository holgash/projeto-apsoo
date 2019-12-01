package interfaces;

import java.util.ArrayList;
import java.util.Date;

import beans.Periferico.tipoPeriferico;
import beans.Registro;
import beans.Registro.tipoOperacao;

public interface IRepositorioHistorico {
	void gerarHistorico(Date data, tipoOperacao op, tipoPeriferico tipoPeri, int numeroPreOP, int numeroPosOP, String obs);
	ArrayList<Registro> getRegistros(); 
}
