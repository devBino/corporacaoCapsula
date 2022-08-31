package br.com.bino.avancado.repositories.bridge;

import br.com.bino.avancado.ifaces.bridge.UserDAO;

public class UserOracle implements UserDAO {

	@Override
	public void save() {
		System.out.println("Saving User Oracle...");
	}
	
}
