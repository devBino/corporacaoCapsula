package br.com.bino.avancado.repositories.chain.responsability;

public class Dispenser {

	private Bill chain;
	
	public Dispenser() {
		this(
			new Bill(50),
			new Bill(20),
			new Bill(10),
			new Bill(5),
			new Bill(1)
		);
	}
	
	public Dispenser(Bill... bills) {
		
		for(int i=0; i<bills.length - 1; i++) {
			bills[i].setNext( bills[i + 1] );
		}
		
		chain = bills[0];
		
	}
	
	public void withDraw(int amount) {
		chain.execute(amount);
	}
	
}
