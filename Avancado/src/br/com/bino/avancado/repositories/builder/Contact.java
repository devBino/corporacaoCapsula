package br.com.bino.avancado.repositories.builder;

import java.util.List;
import java.util.ArrayList;

public class Contact {

	private String name;
	private boolean status;
	private List<Phone> phones;
	private List<Email> emails;
	
	public Contact() {
		phones = new ArrayList<Phone>();
		emails = new ArrayList<Email>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String pName) {
		name = pName;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean pStatus) {
		status = pStatus;
	}
	
	public List<Phone> getPhones(){
		return phones;
	}
	
	public List<Email> getEmails(){
		return emails;
	}
	
	@Override
	public String toString() {
		StringBuilder strThis = new StringBuilder();
		
		strThis.append(String.format("%-15s%s %n%-15s%s", "Nome:",name,"Status:",status));
		strThis.append(String.format("%n%-15s%s", "Telefone 1:", String.valueOf(phones.get(0).getNumber())));
		strThis.append(String.format("%n%-15s%s", "Email 1:", String.valueOf(emails.get(0).getEmail())));
		
		return strThis.toString();
	}

	
}
