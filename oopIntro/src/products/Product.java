package products;

public class Product {
private String model;
private String yil;
private int km;
private double fiyat;
private double discount;
private double unitPriceAfterDiscount;

public Product() {
}

public Product(String model, String yil, int km, double fiyat,double discount,double unitPriceAfterDiscount) {
	super();
	this.model = model;
	this.yil = yil;
	this.km = km;
	this.fiyat = fiyat;
	this.discount=discount;
	this.unitPriceAfterDiscount=unitPriceAfterDiscount;
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

public double getDiscount() {
	return discount;
}

public void setDiscount(double discount) {
	this.discount = discount;
}

public double getUnitPriceAfterDiscount() {
	return this.fiyat-(this.fiyat*this.discount/100);
}



}
