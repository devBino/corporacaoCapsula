package br.com.bino.avancado.ifaces.proxy;

public interface BankOperations {

	void deposit(int amount);
	void withdraw(int amount);
	int getBalance();
	
}
