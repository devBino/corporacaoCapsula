package br.com.bino.avancado.repositories.factory.iphone.packing;

import br.com.bino.avancado.ifaces.fatory.PackingIface;

public class UsPacking implements PackingIface {

	@Override
	public void packing() {
		
		System.out.println("packing iphone to the US");
		
	}
	
}
