package products;

public class OopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopIntro product=new OopIntro();
		product.fiyat=24.55;
		product.km=250;
		product.model="Pegout";
		product.yil="2022";
		OopIntro product2=new OopIntro();
		product2.fiyat=24.55;
		product2.km=250;
		product2.model="Pegout";
		product2.yil="2022";
		OopIntro[] products = {product,product2};
		ProductService productService=new ProductService();
		productService.addToCard(product2);
		productService.addToCard(product);
		for (OopIntro oopIntro : products) {
			System.out.println(oopIntro.model);
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
