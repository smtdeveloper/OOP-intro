package oopIntro;

import java.util.Iterator;
 
public class Main {

	public static void main(String[] args) {
	// 
		
	
		
		Product product1 = new Product();  // örnek oluþturma, referans , intance
		product1.id =1;
		product1.name = "Moster Abra A5 v15.6";
		product1.unitPrice = 7500;
		product1.detail = "16 GB Ram";
		
		
		Product product2 = new Product(); 
		product2.name = "Hp gp v12";
		product2.unitPrice = 3500;
		product2.detail = "4 GB Ram";
		
		
		Product product3 = new Product( 3, "Lenova v16 ", 1400, "16GB Ram" );
		Product product4 = new Product( 4, "Casper A15 ", 1200, "12GB Ram" );
		
		
		System.out.println("  ");
		
		
		
		Product[] products = { product1 , product2, product3, product4 };

		for (Product product : products) {
			
			System.out.println(product.name);
			
		}
		
		System.out.println( "________________ Ürün Sayýmýz : " +  products.length);
		
		System.out.println("  ");
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Telefon";
		
		Category category3 =new Category( 3 , "Kitap" );
		
		
		Category[] categories = { category1 ,category2, category3 };
		
		
		
		for (Category category : categories) {
		
			System.out.println(category.name);
			
		}
		
		System.out.println( "_______________ Kategori Sayýmýz : " + categories.length );
		
		
		System.out.println("  ");
		System.out.println(" ---------------- Metotlar Ürünler ------------------");
		System.out.println("  ");
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart( product1);
		productManager.addToCart( product2 );
	
		productManager.add(product3);
		productManager.update(product3);
		productManager.delete(product3);
		
		
		
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category2);

	
		System.out.println("  ");
		System.out.println("-------------- Ödevler -----------");
		System.out.println("  ");
		
		Car car1 = new Car(); 
		car1.name = "Opel Astra";
		car1.unitPrice = 55000;
		car1.detail = "Manuel vites";
		
		
		
		Car car2 = new Car( 2, "Pejo 307 ", 65000, "Otomatik Vites" );
		Car car3 = new Car( 3, "Pejo RCZ", 95000, "Manuel Vites" );
		
		Brand brand1 = new Brand( 1, "Opel ");
		Brand brand2 = new Brand( 1, "Pejo ");
		
		
		Car[] cars =  { car1, car2 ,car3 };
		Brand[] brands = { brand1 ,brand2 };
		
		System.out.println(" ---------- Arabalar -----------");
		
		for(Car car : cars ) {
			
			System.out.println(car.name);
			}
		
		System.out.println( " Araba sayýsý : " + cars.length);
		
		
		System.out.println(" ---------- Markalar -----------");
		
		for(Brand brand : brands ) {
			
			System.out.println(brand.brandName);
			}
		
		System.out.println( " Marka sayýsý "  + brands.length);
		
		
		
		
		System.out.println("  ");
		System.out.println(" ---------------- Metotlar Arabalar ------------------");
		System.out.println("  ");
		
		CarManager carManager = new CarManager();
		carManager.add(car3);
		carManager.rental(car3);
		carManager.update(car3);
		carManager.delete(car3);
		
		
		System.out.println("  ");
		System.out.println(" ---------------- Metotlar Markalar ------------------");
		System.out.println("  ");
		
		BrandManager brandManager = new BrandManager();
		brandManager.add(brand2);
		brandManager.update(brand2);
		brandManager.delete(brand2);
		
	}
	
	
	
	


}
  