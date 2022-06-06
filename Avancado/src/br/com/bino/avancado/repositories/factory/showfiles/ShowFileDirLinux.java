package br.com.bino.avancado.repositories.factory.showfiles;

import java.io.IOException;

import br.com.bino.avancado.abstracts.showfiledir.AbstractShowFileDir;
import br.com.bino.avancado.exceptions.BinoException;

public class ShowFileDirLinux extends AbstractShowFileDir {

	@Override
	public void showFiles() {
		
		BinoException binoException = new BinoException();
		
		try {
		
			System.out.println( "Showing file dir of the Linux SO..." );
			Runtime.getRuntime().exec("ls");
			
		}catch(IOException error) {
			
			binoException.setMessage(error.getMessage());
			throw binoException;
			
		}
		
	}
	
}
