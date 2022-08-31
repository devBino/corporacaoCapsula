package br.com.bino.avancado.patterns;

import java.util.Arrays;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.composite.File;
import br.com.bino.avancado.repositories.composite.Folder;

@PatternMap(patternName = Constants.P_COMPOSITE, call = true)
public class PComposite extends AbstractPattern {

	public PComposite() {
		super.setPatternName(Constants.P_COMPOSITE);
	}
	
	@Override
	public void cleanCode() {
	
		File f1 = new File("teste1.txt");
		File f2 = new File("teste2.txt");
		File f3 = new File("teste3.txt");
		File f4 = new File("teste4.txt");
		File f5 = new File("teste5.txt");
		
		Folder fd1 = new Folder("Pasta1.1", Arrays.asList(f1,f2));
		Folder fd2 = new Folder("Pasta1.2", Arrays.asList(f3,f4));
		Folder fd3 = new Folder("Pasta 1", Arrays.asList(fd1, fd2, f5));
		
		fd3.print("");
		
	}
	
}
