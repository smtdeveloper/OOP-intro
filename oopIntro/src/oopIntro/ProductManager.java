package oopIntro;

public class ProductManager {

	public void addToCart( Product product ) {
		System.out.println( product.name + " - Sepete  eklendi "  );
	}
	
	public void add( Product product ) {
		System.out.println( product.name + " Ürün  Eklendi "  );
		
	}
	
	public void update( Product product ) {
		System.out.println( product.name + " Ürün  Güncellendi "  );
		
	}
	
	
	public void delete( Product product ) {
		System.out.println( product.name + " Ürün  Silindi "  );
		
	}
	
}


