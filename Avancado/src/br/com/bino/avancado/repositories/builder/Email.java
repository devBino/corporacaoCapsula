package br.com.bino.avancado.repositories.builder;

public class Email {

	private String email;
	private String domain;
	
	public Email(String pEmail, String pDomain) {
		email = pEmail;
		domain = pDomain;
	}
	
	public String getEmail() {
		return email;
	}
	public String getDomain() {
		return domain;
	}
	
}
