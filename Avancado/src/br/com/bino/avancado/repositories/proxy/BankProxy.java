package br.com.bino.avancado.repositories.proxy;

import br.com.bino.avancado.ifaces.proxy.BankOperations;

public class BankProxy implements BankOperations {

	private BankOperations bank;
	private String nameUser;
	
	public BankProxy(BankOperations bank, String nameUser) {
		this.bank = bank;
		this.nameUser = nameUser;
	}
	
	public String getNameUser() {
		return this.nameUser;
	}
	
	@Override
	public void deposit(int amount) {
		this.bank.deposit(amount);
	}
	
	@Override
	public void withdraw(int amount) {
		
		if( amount <= 500 ) {
			bank.withdraw(amount);
		}else {
			System.err.println("Sorry, You cannot do it!!!!!");
		}
	
	}
	
	@Override
	public int getBalance() {
		return bank.getBalance();
	}
	
}
