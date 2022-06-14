package br.com.bino.avancado.repositories.prototype;

public class Company implements Cloneable {

	public String companyName;
	
	public Company(String pCompanyName) {
		companyName = pCompanyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public Company clone() throws CloneNotSupportedException {
		Company companyClone = (Company) super.clone();
		return companyClone;
	}
	
	@Override
	public String toString() {
		
		return new StringBuilder()
				.append("Company [")
				.append("companyName = ")
				.append(companyName)
				.append("]")
				.toString();
				
	}
	
}
