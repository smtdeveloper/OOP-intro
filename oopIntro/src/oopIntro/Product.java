package oopIntro;

public class Product {
	
	public Product() {
	System.out.println(" Product Çalýþtý");
	}
	
	public Product( int id,String name, double unitPrice, String detail ) {
	
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
		System.out.println("SMTcoder");
		}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
