package br.com.bino.avancado.ifaces.bridge;

public interface UserDAO {

	default void save() {
		System.out.println("Saving default UserDAO...");
	}
	
}
