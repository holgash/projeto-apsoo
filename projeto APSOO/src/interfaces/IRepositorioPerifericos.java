package interfaces;

import java.util.ArrayList;

import beans.PCD;
import beans.Periferico;
import beans.Periferico.tipoPeriferico;

public interface IRepositorioPerifericos {
	void adicionarPeriferico(ArrayList<Periferico> periferico,PCD pcd);
	void removerPeriferico(Periferico periferico);
	ArrayList<Periferico> consultarPeriferico(tipoPeriferico tipo);
	void realizarSubstituicao(Periferico perifericoPre,Periferico perifericoPos);
}
