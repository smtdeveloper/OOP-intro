package oopIntro;

public class CategoryManager {

	public void add(Category category) {
		
		System.out.println( category.name +" Kategorisi Eklendi");
	}
	
	public void update(Category category) {
		
		System.out.println( category.name +" Kategorisi Güncellendi");
	}
	
	public void delete(Category category) {
	
	System.out.println( category.name +" Kategorisi silindi");
	}
	
	
}
