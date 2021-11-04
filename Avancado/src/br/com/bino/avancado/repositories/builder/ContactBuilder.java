package br.com.bino.avancado.repositories.builder;

public class ContactBuilder {

	private Contact instance;
	
	public ContactBuilder() {
		instance = new Contact();
	}
	
	public ContactBuilder setName(String pName) {
		instance.setName(pName);
		return this;
	}
	
	public ContactBuilder setStatus(boolean pStatus) {
		instance.setStatus(pStatus);
		return this;
	}
	
	public ContactBuilder addPhone(int pNumber, int pDdd) {
		Phone p = new Phone(pNumber, pDdd);
		instance.getPhones().add(p);
		
		return this;
	}
	
	public ContactBuilder addEmail(String pEmail, String pDomain) {
		Email e = new Email(pEmail, pDomain);
		instance.getEmails().add(e);
		
		return this;
	}
	
	public Contact builder() {
		return instance;
	}
	
	
}
