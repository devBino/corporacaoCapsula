package br.com.bino.avancado.repositories.iterator;

import java.util.Iterator;

public class Channels implements Iterator<Integer> {

	private Integer[] channels;
	private int index;
	
	public Channels(Integer[] channels) {
		this.channels = channels;
		index = 0;
	}
	
	@Override
	public boolean hasNext() {
		
		if( channels == null ) {
			return false;
		}
		
		if( channels.length <= index ) {
			return false;
		}
		
		return channels[index] != null;
		
	}
	
	@Override
	public Integer next() {
		
		return channels[index++];
		
	}
	
	
}
