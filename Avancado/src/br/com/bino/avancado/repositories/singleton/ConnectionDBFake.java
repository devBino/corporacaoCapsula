package br.com.bino.avancado.repositories.singleton;

public class ConnectionDBFake {

	private static ConnectionDBFake connection;
	
	public ConnectionDBFake() {}
	
	public static ConnectionDBFake getInstance() {
		
		if( connection == null ) {
			connection = new ConnectionDBFake();
		}
		
		return connection;
		
	}
	
}
