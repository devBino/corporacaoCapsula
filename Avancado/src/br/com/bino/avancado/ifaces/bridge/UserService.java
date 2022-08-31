package br.com.bino.avancado.ifaces.bridge;

public interface UserService {

	default void save(UserDAO pUserDAO) {
		pUserDAO.save();
	}
	
}
