package oopIntro;

public class CarManager {

	public void rental( Car car ) {
		
		System.out.println(car.name  + " Araba kiralandi");
	}
	
	public void add( Car car ) {
		
		System.out.println(car.name  + " Araba Eklendi");
	}
	
	public void update( Car car ) {
		
		System.out.println(car.name  + " Araba Güncellendi");
	}
	
	
	public void delete( Car car ) {
		
		System.out.println(car.name  + " Araba Silindi");
	}
	
	
}
