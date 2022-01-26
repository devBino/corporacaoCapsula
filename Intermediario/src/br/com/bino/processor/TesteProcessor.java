package br.com.bino.processor;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.constants.Maps;
import br.com.bino.constants.TestesConstants;
import br.com.bino.exceptions.ConfigBusinessException;
import br.com.bino.exceptions.MapTesteException;

import br.com.bino.annotations.TesteMap;

import java.io.File;
import java.lang.Class;
import java.util.ArrayList;

import java.lang.annotation.Annotation;

public class TesteProcessor {

	/**
	 * Faz validações, busca os testes implementados
	 * e aplica os testes
	 *  
	 * @throws ConfigBusinessException
	 */
	public static void runTestes() throws ConfigBusinessException {
	
		try {
		
			StringBuilder msgErro = new StringBuilder();
			
			//verifica se a Constant de testes está devidamente configurada
			if( TestesConstants.PADRAO == null ) {
				
				msgErro.append("Erro de Configuração: \n");
				msgErro.append("\tPor favor, configure a constante TESTE_PADRAO em TestesConstants.\n");
				msgErro.append("\tValor não pode ser null ou empty...");
				
				throw new ConfigBusinessException( msgErro );
				
			}

			if( TestesConstants.PADRAO.isEmpty() ) {
				
				msgErro.append("Erro de Configuração: \n");
				msgErro.append("\tPor favor, configure a constante TESTE_PADRAO em TestesConstants.\n");
				msgErro.append("\tValor não pode ser null ou empty...");
				
				throw new ConfigBusinessException( msgErro );
				
			}
			
			ArrayList<TesteAbstract> testes = getTestes();
			
			//verifica se existem testes implementados
			if(testes.size() == 0) {
				
				msgErro.append("Erro de implementação: \n");
				msgErro.append("\tCertifique se de que existem testes implementados em: ");
				msgErro.append("\t\n\t");
				msgErro.append( Maps.PATH_TESTES );
				
				throw new ConfigBusinessException( msgErro );
				
			}
			
			
			//se não caiu em nenhuma regra, aplica os testes
			aplicarTestes(testes);
			
			
		}catch(Exception e) {
			
			System.out.println("Um erro inesperado ocorreu...\n");
			System.out.println(e.getMessage());
			
		}
		
	}
	
	/**
	 * Recupera os testes implementados no pacote testes
	 * 
	 * @return ArrayList<TesteAbstract> testes = lista de testes implementados mapeados
	 * @throws MapTesteException
	 */
	public static ArrayList<TesteAbstract> getTestes() throws MapTesteException {
		
		ArrayList<TesteAbstract> testes = new ArrayList<TesteAbstract>();
		
		try {
			
			File dirFiles = new File(Maps.PATH_TESTES);
			File[] files = dirFiles.listFiles();
			
			for( File f : files ) {
				
				String className = f.getName().replaceAll(".java","");
				
				Class c = Class.forName( Maps.PACKAGE_TESTES + className );
				
				//verifica se existe anotação
				boolean anPresent = c.isAnnotationPresent(TesteMap.class);
				
				//verifica se a classe de teste está anotada com @TesteMap
				if( !anPresent ) {
					continue;
				}
				
				//verifica se classe deve ser testada
				Annotation objAnTesteMap = c.getAnnotation(TesteMap.class);
				TesteMap anTesteMap = (TesteMap) objAnTesteMap;
				
				if( !anTesteMap.testar() ) {
					continue;
				}
					
				//Verifica a classe teste está anotada como teste padrão	
				if( anTesteMap.nomeTeste().equals(TestesConstants.PADRAO) ) {
				
					testes.add( (TesteAbstract) c.newInstance() );
					break;
					
				//caso a classe teste não seja teste padrão, será teste genérico, para todas as classes
				}else if( !anTesteMap.nomeTeste().equals(TestesConstants.PADRAO) 
						&& TestesConstants.PADRAO.equals(TestesConstants.GENERICO)) {
				
					testes.add( (TesteAbstract) c.newInstance() );
					
				}
				
			}
			
		}catch(Exception e) {
			
			StringBuilder msgErro = new StringBuilder();
			
			msgErro.append("Erro ao localizar o arquivo correspondente o teste especificado...\n");
			msgErro.append(e.getMessage());
			
			throw new MapTesteException(msgErro);
			
		}
		
		return testes;
		
	}
	
	/**
	 * Recebe a lista de testes implementados e 
	 * aplica os testes em cada metodo teste()
	 * sobreescrito em cada classe de teste implementada
	 * 
	 * @param pTestes
	 */
	public static void aplicarTestes(ArrayList<TesteAbstract> pTestes) {
		
		for( TesteAbstract t : pTestes ) {
			t.teste();
		}
		
	}
	
}
