package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.testes.Pessoa;

@TesteMap(nomeTeste = TestesConstants.PASSAGEM_PARAMETRO, testar = true)
public class PassagemParametro extends TesteAbstract {

	public PassagemParametro() {
		super.setNomeTeste(TestesConstants.PASSAGEM_PARAMETRO);
	}
	
	@Override
	public void teste() {
		
		Pessoa p = new Pessoa("Homem de Ferro");
		p.setGenero('M');
		
		int anos = 30;
		
		System.out.println(p.getNome() + " tem gênero " + p.getGenero());
		
		exemplo1(anos, p);
		
		System.out.println(p.getNome() + " tem gênero " + p.getGenero());
		
		exemplo2(anos, p);
		
		System.out.println(p.getNome() + " tem gênero " + p.getGenero());
		
	}
	
	/**
	 * Recebe uma variavel como referencia do tipo Pessoa
	 * apartir de então, dentro do escopo do metodo exemplo1
	 * podemos utilizar a variavel apontando para a 
	 * referencia de memoria de Pessoa pPessoa,
	 * ou tem a possibilidade de jogar uma nova instancia 
	 * de Pessoa em pPessoa.
	 * Importante dizer que se criarmos uma nova instancia de Pessoa
	 * para pPessoa, tudo que fizermos nessa nova instancia
	 * morre dentro do escopo do metodo exemplo1, não
	 * afetando em nada o valor original recebido em pPessoa
	 * no seu respectivo endereço de memória no java
	 * 
	 * @param anos
	 * @param pPessoa
	 */
	public void exemplo1(int anos, Pessoa pPessoa) {
		
		pPessoa = new Pessoa("Viuva Negra");
		pPessoa.setGenero('F');
		anos = 55;
		
	}
	
	/**
	 * 
	 * Nesse exemplo, assim como no exemplo1 acima
	 * recebemos Pessoa pPessoa, 
	 * uma variavel do tipo Pessoa, apontando para
	 * uma referência de memória.
	 * Aqui a diferença é que usamos o que recebemos
	 * em pPessoa, inves de simplistemente jogar nela
	 * uma nova instancia que morreria no escopo de exemplo2
	 * 
	 * @param anos
	 * @param pPessoa
	 */
	public void exemplo2(int anos, Pessoa pPessoa) {
		
		pPessoa.setGenero('F');
		anos = 12;
		
	}
	
}
