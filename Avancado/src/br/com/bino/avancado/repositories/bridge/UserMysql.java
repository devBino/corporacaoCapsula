package br.com.bino.avancado.repositories.bridge;

import br.com.bino.avancado.ifaces.bridge.UserDAO;

public class UserMysql implements UserDAO {

	@Override
	public void save() {
		System.out.println("Saving User Mysql...");
	}
	
}
