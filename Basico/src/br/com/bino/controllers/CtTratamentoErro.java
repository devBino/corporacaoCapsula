package br.com.bino.controllers;

import java.util.Scanner;

import br.com.bino.constants.TestesConstants;

import br.com.bino.exceptions.DivisaoPorZeroException;

public class CtTratamentoErro extends ObjetoTeste {

	public CtTratamentoErro() {
		nomeTeste = TestesConstants.TRATAMENTO_ERRORS;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			
			//try catch simplis
			exemploTryCatch();
			
			//try catch com multi catch
			exemploMultiCatch();
			
			//multi catch agrupado por família de Exceptions 
			exemploMultiCatchAgrupados();
			
			//finaly após try catch
			exemploFinaly();
			
			//erros genéricos com Exception
			exemploExceptionGenerica();
			
			//exemplo com throws na assinatura do metodo
			try {
				exemploThrows();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(linhaDivisao('_', (char) 60 ));

			
			/*
			 * alguns exemplos com throw new Exception("mensagem")
			 * dentro de ifs verificados  
			 */
			try {
				exemploNewException(null);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				exemploNewException(new char[] {});
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				exemploNewException(new char[] {1,2,3,4,5,6,7,8,9,10});
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			/**
			 * Exemplo com tratamento de erros personalizado
			 * quando nós mesmos criamos nossas 
			 * classes de erros
			 */
			try {
				exemploTratamentoPersonalizado( (byte) 10, (byte) 0);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			exemploFinalyPegadinha();
			System.out.println(linhaDivisao('_', (char) 60 ));
			
		}
		
	}
	
	public void exemploTryCatch() {
		
		char[] letras = new char[] {'f','e','r'};
		
		System.out.println("inicio");
		
		try {
			System.out.println(letras[4]);
			System.out.println("Dados acessados com sucesso...");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao tentar acessar dados do array...");
		}
		
		System.out.println("fim");
		
		System.out.println(linhaDivisao('_', (char) 60 ));
		
	}
	
	/**
	 * Para fazer multi catch capturando varios erros basta criar catchs sequenciais
	 * além disso, criamos primeiro os catchs para erros específicos e por final
	 * adicionamos o Throwalbe para erros mais genéricos, e Throwable sempre deve ser o último
	 */
	public void exemploMultiCatch() {
		
		byte[] nums = {10,20,4,5,90};
		byte[] den = {2,0,5,0};
		
		for( int i=0; i<nums.length; i++ ) {
			
			try {
				System.out.println( nums[i] / den[i] );
			}catch(ArithmeticException e) {
				System.out.println("Erro: Divisão por zero!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: Posição não existe no array...");
			}catch(Throwable e) {
				System.out.println("Erro: Genérico...");
			}
			
		}
		
		System.out.println(linhaDivisao('_', (char) 60 ));
		
	}
	
	
	/**
	 * Aqui, o trecho 
	 * }catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
	 * teve os cathcs agrupados por serem da mesma familia
	 */
	public void exemploMultiCatchAgrupados() {
		
		byte[] nums = {10,20,4,5,90};
		byte[] den = {2,0,5,0};
		
		for( int i=0; i<nums.length; i++ ) {
			
			try {
				System.out.println( nums[i] / den[i] );
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: Divisão por zero!!");			
			}catch(Throwable e) {
				System.out.println("Erro: Genérico...");
			}
			
		}
		
		System.out.println(linhaDivisao('_', (char) 60 ));
		
	}
	
	public void exemploFinaly() {
		
		char[] letras = {'w','f','r'};
		
		try {
		
			System.out.println(letras[4]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: posição não existe no array");
		}catch(Throwable e) {
			System.out.println("Erro genérico...");
		}finally {
			System.out.println("Finalizou programa...");
		}
		
		System.out.println(linhaDivisao('_', (char) 60 ));
		
	}
	
	public void exemploFinalyPegadinha() {
		
		char[] letras = {'w','f','r'};
		
		try {
		
			System.out.println(letras[4]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: posição não existe no array");
			System.exit(0);
		}catch(Throwable e) {
			System.out.println("Erro genérico...");
			System.exit(0);
		}finally {
			System.out.println("Finalizou programa...");
		}
		
		System.out.println(linhaDivisao('_', (char) 60 ));
		
	}
	
	public void exemploExceptionGenerica() {
		
		try {
			int num = 10 / 0;
			System.out.println(num);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(linhaDivisao('+',(char) 60));
			
			e.printStackTrace();
			System.out.println(linhaDivisao('+',(char) 60));
			
		}
		
		System.out.println(linhaDivisao('_', (char) 60 ));
	}
	
	public void exemploThrows() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu peso: ");
		
		double peso = scan.nextDouble();
		
		System.out.println("Peso digitado: " + peso);
		
	}
	
	public void exemploNewException( char[] pLetras ) throws Exception {

		if( pLetras == null ){
			throw new Exception("Valor nulo recebido como prametro");
		}
		
		if( pLetras.length == 0 ) {
			throw new Exception("Nenhuma letra recebida no array");
		}
		
		String palavra = new String(pLetras);

		System.out.println(palavra);
		
	}

	public void exemploTratamentoPersonalizado(byte pNum1, byte pNum2) throws DivisaoPorZeroException {
	
		if( pNum2 == 0 ) {
			throw new DivisaoPorZeroException("Denominador recebido como valor de zero.\nPor favor informa um número maior que zero ...");
		}
		
		System.out.println( "Resultado do Cálculo: " +  pNum1 / pNum2 );
		
	}
	
}
