package br.com.bino.avancado.repositories.prototype;

public class Computer implements Cloneable {

	private String color;
	private int wWindow;
	private int hWindow;
	private int year;
	private String so;
	private ComputerTools computerTools;
	private double price;
	private Company company;
	
	public Computer(ComputerTools pComputerTools) {
		color = "black";
		wWindow = 1500;
		hWindow = 550;
		year = 2000;
		so = "Windows";
		computerTools = pComputerTools;
		company = new Company("PC Business Fake Company");
		price = 2000.00;
	}
	
	public Computer(String pColor, int pwWindow, int phWindow, int pYear, String pSo, double pPrice, Company pCompany) {
		color = pColor;
		wWindow = pwWindow;
		hWindow = phWindow;
		year = pYear;
		so = pSo;
		computerTools = new ComputerTools();
		company = pCompany;
		price = pPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getwWindow() {
		return wWindow;
	}

	public void setwWindow(int wWindow) {
		this.wWindow = wWindow;
	}

	public int gethWindow() {
		return hWindow;
	}

	public void sethWindow(int hWindow) {
		this.hWindow = hWindow;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public ComputerTools getComputerTools() {
		return computerTools;
	}

	public void setComputerTools(ComputerTools computerTools) {
		this.computerTools = computerTools;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public Computer clone() throws CloneNotSupportedException {
		
		Computer computerClone = (Computer) super.clone();
		
		computerClone.computerTools = (ComputerTools) computerTools.clone();
		computerClone.company = (Company) company.clone();
		
		return computerClone;
	}
	
	@Override
	public String toString() {
		
		return new StringBuilder()
				.append("Computer [")
				.append("so = ")
				.append(so)
				.append(", ")
				.append("color = ")
				.append(color)
				.append(", ")
				.append("wWindow = ")
				.append(String.valueOf(wWindow))
				.append(", ")
				.append("hWindow = ")
				.append(String.valueOf(hWindow))
				.append(", ")
				.append("year = ")
				.append(String.valueOf(year))
				.append(", ")
				.append("price = ")
				.append(String.valueOf(price))
				.append(", ")
				.append("company = ")
				.append(company)
				.append(", ")
				.append("computerTools = ")
				.append(computerTools)
				.append("]")
				.toString();
				
		
	}
		
}
