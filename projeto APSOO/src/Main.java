import java.util.ArrayList;
import java.util.Date;

import beans.CoordenadasGeograficas;
import beans.DadosGeograficos;
import beans.LocalizacaoPCD;
import beans.PCD;
import beans.Periferico;
import controladores.Fachada;

public class Main {

	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstancia();
		fachada.cadastrarPCD(PCD.type.METEREOLOGICA, PCD.subtype.METEREOLOGICA, "PCD 1", "Tombamento 1", 
				"Fabricante 1", new Date(), "IdentificadorServidorFTP 1", "Sem obs", new CoordenadasGeograficas(1, 2, 3, 3, 2, 1), 
				new DadosGeograficos("Regiao 1","Rio 1","Bacia 1","Recife", "qualquer"),
				new LocalizacaoPCD("123", "asd", 999, "", "espinheiro", "", "Vai na fé que chega", "estacao 1"));
		ArrayList<Periferico> a = new ArrayList<Periferico>();
		a.add(new Periferico(Periferico.tipoPeriferico.TIPO1, 1, "Perifericos Inc", "Periferico 1"));
		Periferico peri =new Periferico(Periferico.tipoPeriferico.TIPO2,321,"asd","gg izi");
		a.add(peri);
		fachada.adicionarPeriferico(a, fachada.getPCDs().get(0));
		System.out.println(Fachada.getInstancia().getPCDs().get(0));
		
		fachada.removerPeriferico(peri);
		System.out.println(Fachada.getInstancia().getPCDs().get(0));
		System.out.println(fachada.getRegistros());
	
	}
}
