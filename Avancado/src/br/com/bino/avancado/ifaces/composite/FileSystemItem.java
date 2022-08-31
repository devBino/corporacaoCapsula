package br.com.bino.avancado.ifaces.composite;

public interface FileSystemItem {

	default void print(String structure) {
		System.out.println(structure);
	}
	
}
