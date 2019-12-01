package beans;

public class DadosGeograficos {
	private String MesoRegiao;
	private String Rio;
	private String BaciaHidrografica;
	private String Municipio;
	private String MicroRegiao;
	
	
	public DadosGeograficos(String mesoRegiao, String rio, String baciaHidrografica, String municipio,
			String microRegiao) {
		MesoRegiao = mesoRegiao;
		Rio = rio;
		BaciaHidrografica = baciaHidrografica;
		Municipio = municipio;
		MicroRegiao = microRegiao;
	}
	public String getMesoRegiao() {
		return MesoRegiao;
	}
	public void setMesoRegiao(String mesoRegiao) {
		MesoRegiao = mesoRegiao;
	}
	public String getRio() {
		return Rio;
	}
	public void setRio(String rio) {
		Rio = rio;
	}
	public String getBaciaHidrografica() {
		return BaciaHidrografica;
	}
	public void setBaciaHidrografica(String baciaHidrografica) {
		BaciaHidrografica = baciaHidrografica;
	}
	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
	public String getMicroRegiao() {
		return MicroRegiao;
	}
	public void setMicroRegiao(String microRegiao) {
		MicroRegiao = microRegiao;
	}
	
	@Override
	public String toString() {
		
		return "\n\nDADOS GEOGRAFICOS\n"+"Meso Região: "+ MesoRegiao +" Rio: "+ Rio +" Bacia Hidrográfica: "+BaciaHidrografica +"\nMunicípio: " + Municipio 
				+ " Micro Região: " + MicroRegiao;
	}
}
