package br.com.bino.avancado.repositories.chain.responsability;

public class Bill {

	private Integer value;
	private Bill next;
	
	public Bill(int value) {
		this.value = value;
	}
	
	public void setNext(Bill bill) {
		this.next = bill;
	}
	
	public void execute(int pRemaing) {
		
		int remaining = 0;
		
		if( pRemaing >= value && pRemaing > 0 ) {
			
			int qtde = pRemaing / value;
			remaining = pRemaing % value;
			int total = qtde * value;
			
			System.out.println(qtde + " Bills of $" + value + " = " + total + ". Remaining " + remaining );
			
		}else if( pRemaing < value && pRemaing > 0 ) {
			
			remaining = pRemaing;
			
		}
		
		if(remaining == 0){
			return;
		}
		
		if(next != null) {
			next.execute(remaining);
		}
		
	}
	
}
