package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;
import java.util.Scanner;

public class CtLerDadosTeclado extends ObjetoTeste {

	public CtLerDadosTeclado() {
		nomeTeste = TestesConstants.LER_DADOS_TECLADO;
	}
	
	@Override
	public void teste() {
		
		testar = false;
		
		if(testar) {
			lerDados();
		}
		
	}
	
	public void lerDados() {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder opcaoUsuario = new StringBuilder(); 
		
		for(String s : getOpcoes()) {
			
			System.out.println(s);
			
			if( s.contains("(linha)") ) {
				
				opcaoUsuario.append("Nome Completo = ");
				opcaoUsuario.append(scan.nextLine());
				
			}else if( s.contains("(palavra)") ) {
				
				opcaoUsuario.append("Primeiro nome = ");
				opcaoUsuario.append(scan.next());
				
			}else if( s.contains("(char)") ) {
				
				char vDigitado = (char) scan.nextInt();
				
				opcaoUsuario.append("Sua idade = ");
				opcaoUsuario.append(vDigitado);
				
			}else if( s.contains("(byte)") ) {
				
				opcaoUsuario.append("Quantidade de irmãos e irmãs = ");
				opcaoUsuario.append(scan.nextByte());
				
			}else if( s.contains("(int)") ) {
				
				opcaoUsuario.append("Nasceu no mês = ");
				opcaoUsuario.append(scan.nextInt());
				
			}else if( s.contains("(long)")) {
				
				opcaoUsuario.append("Distancia da Terra para Lua = ");
				opcaoUsuario.append(scan.nextLong());
				
			}else if( s.contains("(double)") ) {
				
				opcaoUsuario.append("Sua altura é = ");
				opcaoUsuario.append(scan.nextDouble());
				
			}else if( s.contains("(float)") ) {
				
				opcaoUsuario.append("Seu peso é = ");
				opcaoUsuario.append(scan.nextFloat());
				
			}
			
			opcaoUsuario.append("\n\r_______________________________________________\n\r");
			
		}
		
		System.out.println(opcaoUsuario.toString());
		System.out.println("--------------------------------------------------------------------------------");
		
		opcaoUsuario.delete(0, opcaoUsuario.length());
		
	}
	
	public String[] getOpcoes() {
		return new String[] {
			"Digite seu nome completo (linha)",
			"Confirme seu primeiro nome (palavra)",
			"Digite sua idade (char)",
			"Quantos irmãos ou irmãs você tem?? (byte)",
			"Que mês do ano você nasceu? (int)",
			"Qual a distancia ente a terra e a lua? (long)",
			"Qual seu peso? (double)",
			"Qual sua altura? (float)"
		};
	}
	
}
