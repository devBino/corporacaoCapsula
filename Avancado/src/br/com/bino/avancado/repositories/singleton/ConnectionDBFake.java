package br.com.bino.avancado.repositories.singleton;

public class ConnectionDBFake {

	public static String name;
	private static ConnectionDBFake connection;
	
	private ConnectionDBFake() {}
	
	public static ConnectionDBFake getInstance() {
		
		if( connection == null ) {
			connection = new ConnectionDBFake();
		}
		
		return connection;
		
	}
	
}
