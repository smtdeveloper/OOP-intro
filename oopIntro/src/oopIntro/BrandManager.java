package oopIntro;

public class BrandManager {

	
	public void add( Brand brand ) {
		
		System.out.println(brand.brandName  + " Marka Eklendi");
	}
	
	public void update( Brand brand ) {
		
		System.out.println(brand.brandName  + " Marka G�ncellendi");
	}
	
	
	public void delete( Brand brand ) {
		
		System.out.println(brand.brandName  + " Marka Silindi");
	}
	
	
}
