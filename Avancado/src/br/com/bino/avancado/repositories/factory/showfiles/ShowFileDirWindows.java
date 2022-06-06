package br.com.bino.avancado.repositories.factory.showfiles;

import java.io.IOException;

import br.com.bino.avancado.abstracts.showfiledir.AbstractShowFileDir;
import br.com.bino.avancado.exceptions.BinoException;

public class ShowFileDirWindows extends AbstractShowFileDir {

	@Override
	public void showFiles() {
		
		BinoException binoException = new BinoException();
		
		try {
			
			System.out.println( "Showing file dir of the Windows SO" );
			
			new ProcessBuilder("cmd","/c","dir").inheritIO()
				.start().waitFor();
			
		}catch(IOException error) {
			
			binoException.setMessage(error.getMessage());
			throw binoException;
			
		}catch(InterruptedException error) {
			
			binoException.setMessage(error.getMessage());
			throw binoException;
			
		}
		
	}
	
}
