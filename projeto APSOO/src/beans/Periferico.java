package beans;

public class Periferico {
	public static enum tipoPeriferico{
		TIPO1,TIPO2,TIPO3;
	}
	private tipoPeriferico tipo;
	private int numSerie;
	private String Marca;
	private String Modelo;
	
	
	public Periferico(tipoPeriferico tipo, int numSerie, String marca, String modelo) {
		this.tipo = tipo;
		this.numSerie = numSerie;
		Marca = marca;
		Modelo = modelo;
	}
	
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public tipoPeriferico getTipo() {
		return tipo;
	}
	public void setTipo(tipoPeriferico tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
	
		return "\nTipo: "+ tipo+ " Número de série: "+ numSerie + " Marca: "+ Marca+ " Modelo: "+ Modelo;
	}
}
