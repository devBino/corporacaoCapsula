package br.com.bino.avancado.repositories.composite;

import java.util.List;

import br.com.bino.avancado.ifaces.composite.FileSystemItem;

public class Folder implements FileSystemItem {

	protected String name;
	
	protected List<FileSystemItem> childrens;
	
	public Folder(String name, List<FileSystemItem> childrens) {
		this.name = name;
		this.childrens = childrens;
	}
	
	public List<FileSystemItem> getChildrens(){
		return this.childrens;
	}
	
	@Override
	public void print(String structure) {
		
		System.out.println(structure + name);
		
		for(FileSystemItem c : childrens) {
			c.print(structure + "| ");
		}
		
	}
	
}
