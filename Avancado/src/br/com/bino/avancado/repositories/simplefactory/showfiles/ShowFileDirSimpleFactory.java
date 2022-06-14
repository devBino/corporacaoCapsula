package br.com.bino.avancado.repositories.simplefactory.showfiles;

import br.com.bino.avancado.abstracts.simplefactory.AbstractShowFileDir;

public class ShowFileDirSimpleFactory {

	public static AbstractShowFileDir getDomonstrator() {
		
		AbstractShowFileDir abstractShowFileDir = null;
		
		if( System.getProperty("os.name").contains("Windows") ) {
			
			abstractShowFileDir = new ShowFileDirWindows();
			
		}else if( System.getProperty("os.name").contains("Linux") ) {
			
			abstractShowFileDir = new ShowFileDirLinux();
			
		}
		
		return abstractShowFileDir;
		
	}
	
}
