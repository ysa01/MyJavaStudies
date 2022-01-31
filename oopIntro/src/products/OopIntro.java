package products;

public class OopIntro {
String model;
String yil;
int km;
double fiyat;

public OopIntro() {
	super();
	// TODO Auto-generated constructor stub
}

public OopIntro(String model, String yil, int km, double fiyat) {
	super();
	this.model = model;
	this.yil = yil;
	this.km = km;
	this.fiyat = fiyat;
}

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getYil() {
	return yil;
}
public void setYil(String yil) {
	this.yil = yil;
}
public int getKm() {
	return km;
}
public void setKm(int km) {
	this.km = km;
}
public double getFiyat() {
	return fiyat;
}
public void setFiyat(double fiyat) {
	this.fiyat = fiyat;
}



}
