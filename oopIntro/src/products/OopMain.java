package products;

public class OopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setYil("2005");
		product.setKm(100);
		product.setFiyat(150000);
		product.setModel("Mercedes");
		product.setDiscount(14.5);
		Product product2=new Product();
		product2.setYil("2015");
		product2.setKm(200);
		product2.setFiyat(250000);
		product2.setModel("Bmw");
		product2.setDiscount(10.5);
		Product[] products = {product,product2};
		ProductService productService=new ProductService();
		productService.addToCard(product2);
		productService.addToCard(product);
		for (Product oopIntro : products) {
			System.out.println(oopIntro.getUnitPriceAfterDiscount());
		}
		System.out.println(products.length);
	   Category category=new Category();
	   category.id=1;
	   category.name="Bahçe Envanteri";
	   Category category2=new Category();
	   category2.id=1;
	   category2.name="Bahçe Envanteri";
	   Category[] categories= {category,category2};
	   for (Category cat : categories) {
	   System.out.println(cat.name);
	}
		
	}

}
