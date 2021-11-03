package br.com.bino.avancado.app;

import br.com.bino.avancado.processor.PatternProcessor;

public class StartJavaAvancado {

	public static void main(String[] args) {
		try {
			PatternProcessor.runPatterns();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
