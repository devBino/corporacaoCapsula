package br.com.bino.avancado.repositories.proxy;

import br.com.bino.avancado.ifaces.proxy.BankOperations;

public class Bank implements BankOperations {

	private int balance;
	
	@Override
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("You will be rich :)");
	}
	
	@Override
	public void withdraw(int amount) {
		
		if( this.balance > amount ) {
			this.balance -= amount;
		}else {
			System.err.println("You does not nothing :( ");
		}
		
	}
	
	@Override
	public int getBalance() {
		return this.balance;
	}
	
}
