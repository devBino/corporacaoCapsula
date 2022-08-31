package br.com.bino.avancado.repositories.composite;

import br.com.bino.avancado.ifaces.composite.FileSystemItem;

public class File implements FileSystemItem {
	
	protected String name;
	
	public File(String name) {
		this.name = name;
	}
	
	@Override
	public void print(String structure) {
		System.out.println(structure + name);
	}
	
}
