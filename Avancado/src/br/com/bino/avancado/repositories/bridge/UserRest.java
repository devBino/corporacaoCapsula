package br.com.bino.avancado.repositories.bridge;

import br.com.bino.avancado.ifaces.bridge.UserDAO;
import br.com.bino.avancado.ifaces.bridge.UserService;

public class UserRest implements UserService {

	@Override
	public void save(UserDAO pUserDAO) {
		pUserDAO.save();
	}
	
}
