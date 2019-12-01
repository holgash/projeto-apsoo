package beans;

public class CoordenadasGeograficas {
	private int latitudeGrau;
	private int latitudeMinuto;
	private int latitudeSegundo;
	private int longitudeGrau;
	private int longitudeMinuto;
	private int longitudeSegundo;
	
	public CoordenadasGeograficas(int latitudeGrau, int latitudeMinuto, int latitudeSegundo, int longitudeGrau,
			int longitudeMinuto, int longitudeSegundo) {
		this.latitudeGrau = latitudeGrau;
		this.latitudeMinuto = latitudeMinuto;
		this.latitudeSegundo = latitudeSegundo;
		this.longitudeGrau = longitudeGrau;
		this.longitudeMinuto = longitudeMinuto;
		this.longitudeSegundo = longitudeSegundo;
	}
	public int getLatitudeGrau() {
		return latitudeGrau;
	}
	public void setLatitudeGrau(int latitudeGrau) {
		this.latitudeGrau = latitudeGrau;
	}
	public int getLatitudeMinuto() {
		return latitudeMinuto;
	}
	public void setLatitudeMinuto(int latitudeMinuto) {
		this.latitudeMinuto = latitudeMinuto;
	}
	public int getLatitudeSegundo() {
		return latitudeSegundo;
	}
	public void setLatitudeSegundo(int latitudeSegundo) {
		this.latitudeSegundo = latitudeSegundo;
	}
	public int getLongitudeGrau() {
		return longitudeGrau;
	}
	public void setLongitudeGrau(int longitudeGrau) {
		this.longitudeGrau = longitudeGrau;
	}
	public int getLongitudeMinuto() {
		return longitudeMinuto;
	}
	public void setLongitudeMinuto(int longitudeMinuto) {
		this.longitudeMinuto = longitudeMinuto;
	}
	public int getLongitudeSegundo() {
		return longitudeSegundo;
	}
	public void setLongitudeSegundo(int longitudeSegundo) {
		this.longitudeSegundo = longitudeSegundo;
	}
	
	@Override
	public String toString() {
		return "\nCOORDENADAS GEOGRAFICAS\n"+"Latitude:"+latitudeGrau+"º "+latitudeMinuto+"' "+ latitudeSegundo + "''"+
				"\nlongitude:"+longitudeGrau+"º "+longitudeMinuto+"' "+ longitudeSegundo + "''";
	}
	
}
