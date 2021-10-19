package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import java.io.File;
import java.io.IOException;
import java.lang.Class;
import java.lang.reflect.Method;

public class Teste {

	public static String pathControllers = "src/br/com/bino/controllers";
	public static String packageControllers = "br.com.bino.controllers.";
	
	public static void runTestes() {
		
		String teste = TestesConstants.TESTE_PADRAO;
		
		if( teste.equals(TestesConstants.GENERICO) ) {
			testeGenerico();
		}else if( !teste.equals(TestesConstants.GENERICO) && !teste.isEmpty() ) {
			testeEspecifico(teste);
		}
		
		
	}
	
	public static ObjetoTeste getObjeto(String pTeste) throws ClassNotFoundException {
		
		ObjetoTeste objTestes = new ObjetoTeste();
		
		try {
			
			File dirFiles = new File(pathControllers);
			File[] files = dirFiles.listFiles();
			
			for( File f : files ) {
				
				//pula arquivos com extensão diferente de .java
				if( !f.getName().contains(".java") ) {
					continue;
				}
				
				//trata nome controller e nome do teste
				String nomeController = f.getName().replaceAll(".java", "");
				
				if( pTeste != null ) {
					
				
					String[] arrNomeTeste = pTeste.split("-");
					
					//pula os testes diferentes do pTeste caso tenha recebido pTeste
					if( pTeste != null && !nomeController.equals(arrNomeTeste[1].trim()) ) {
						continue;
					}
					
				}
				
				//pula controller genérico
				if( nomeController.toLowerCase().equals("objetoteste") ) {
					continue;
				}
				
				//busca nova instancia do controller sendo iterado
				Class c = Class.forName(packageControllers + nomeController);
				Method[] methods = c.getDeclaredMethods();
				
				for(Method m : methods) {
					
					if( m.getName().equals(TestesConstants.METODO_TESTE_GENERICO) ) {
						
						Object o = c.newInstance();
						objTestes.objetos.add( (ObjetoTeste) o);
						
					}
					
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return objTestes;
		
	}
	
	public static void testeEspecifico(String pTeste) {
		
		try {
			
		
			ObjetoTeste objTestes = getObjeto(pTeste);
			
			//seta os objetos a serem testados
			for(ObjetoTeste obj : objTestes.objetos) {
				
				obj.setTestar(false);
				
				if( obj.getNomeTeste().equals(pTeste) ) {
					obj.setTestar(true);
					obj.teste();
					System.out.println("\n\r********************************************************");
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void testeGenerico() {
		try {
		
			ObjetoTeste objTestes = getObjeto(null);
		
			//seta os objetos a serem testados
			for(ObjetoTeste obj : objTestes.objetos) {
				obj.setTestar(true);
				obj.teste();
				System.out.println("\n\r********************************************************");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
