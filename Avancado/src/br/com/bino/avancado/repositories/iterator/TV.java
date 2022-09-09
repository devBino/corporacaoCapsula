package br.com.bino.avancado.repositories.iterator;

import java.util.Iterator;

public class TV implements Iterable<Integer> {

	private Integer[] channels;
	
	public TV() {
		channels = new Integer[] {10,20,30,40,50};
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Channels(channels);
	}
	
}
