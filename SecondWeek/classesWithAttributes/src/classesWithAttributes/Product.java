package classesWithAttributes;

public class Product {
	    
	public Product() {
		System.out.println("Yapıcı blok çalıştı");
	    this.id = id;
	    this.name = name;
	    this.desciption = desciption;
	    this.price = price;
	    this.stockAmount = stockAmount;
	    this.renk = renk;
	    this.kod = kod; 
	}
	
	private int id;
	private String name;
	private String desciption;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1)+ id; 
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

}
