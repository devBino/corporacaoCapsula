/**
 * Objetivo dessa classe controller
 * é simplismente conter um método
 * que relembre o passo a passo
 * de como instalar java no linux
 */
package br.com.bino.controllers;

import java.util.ArrayList;

import br.com.bino.constants.TestesConstants;

public class CtInstalarJavaLinux extends ObjetoTeste{

	public String divisorLinhaInstrucao;
	
	public CtInstalarJavaLinux() {
		nomeTeste = TestesConstants.INSTALAR_JAVA_LINUX;
		divisorLinhaInstrucao = "...................................................";
	}
	
	@Override
	public void teste() {
		
		if(testar) {
			algoritimoInstalaJavaLinux(0, getSteps());
		}
		
	}
	
	public void algoritimoInstalaJavaLinux(int cont, ArrayList<String> steps) {
		try {
			
			int controle = cont + 1;
			
			if( controle < steps.size() ) {
				System.out.print(steps.get(controle));
				//Thread.sleep(100);
				algoritimoInstalaJavaLinux(controle, steps);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<String> getSteps() {
		
		ArrayList<String> arrSteps = new ArrayList<String>();
		
		arrSteps.add("=> - É possível baixar o Java na documentação oficial em:\nhttps://www.java.com/pt-BR/");
		
		arrSteps.add(quebraLinha(2));
		arrSteps.add("=> -Também é possível seguindo o passo a passo:");
		
		arrSteps.add(quebraLinha(2));
		arrSteps.add(tabular(1));
		arrSteps.add("1 - Baixar Repositorio rodando o seguinte comando no terminal:");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"sudo add-apt-repository ppa:webupd8team/java\"");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("Durante o Download do repositório, confirme quando solicitado");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(1));
		arrSteps.add("2 - Após ter baixado o reposotório, atualize as definições do linux com o comando abaixo:");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"sudo apt-get update\"");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("Da mesma maneira, se solicitado confirme as ações");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(1));
		arrSteps.add("3 - Com o proximo comando iremos instalar o Java:");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"sudo apt-get install oracle-jdk7-installer\"");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("Aqui, basta ir confirmando e aceitar os termos.");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(1));
		arrSteps.add("4 - Podemos testar se o Java foi corretamente instalado com comando:");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"java -version\"");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("Esse comando verifica a versão do Java");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(1));
		arrSteps.add("5 - Agora podemos testar outro comando:");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"javac -version\"");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("Esse outro comando verifica a versão do compilador do Java");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(1));
		arrSteps.add("6 - Crie em algum diretorio de estudos um arquivo com nome Start.java com o seguinte conteúdo:");
		
		arrSteps.add(quebraLinha(2));
		arrSteps.add(tabular(2));
		arrSteps.add("public class Start {");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(3));
		arrSteps.add("public static void main(String[] args) {");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(4));
		arrSteps.add("System.out.println(\"Iniciando com Java...\");");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(3));
		arrSteps.add("}");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("}");
		
		arrSteps.add(quebraLinha(2));
		arrSteps.add(tabular(1));
		arrSteps.add("7 - Agora, utilizando o terminal acesse a pasta onde salvou o script e utilize o comando abaixo para compilar sua classe");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"javac Start.java\"");
		
		arrSteps.add(quebraLinha(2));
		arrSteps.add(tabular(1));
		arrSteps.add("8 - Por fim, rode seu programinha em java com comando abaixo");
		
		arrSteps.add(quebraLinha(1));
		arrSteps.add(tabular(2));
		arrSteps.add("\"java Start\"");
		
		return arrSteps;
		
	}
	
	public String quebraLinha(int qtde) {
		return "\n".repeat(qtde);
	}
	
	public String tabular(int qtde) {
		return "\t".repeat(qtde);
	}
	
}
