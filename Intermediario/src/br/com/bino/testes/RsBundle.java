package br.com.bino.testes;

import java.util.ResourceBundle;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste=TestesConstants.RS_BUNDLE, testar=true)
public class RsBundle extends TesteAbstract {

	public RsBundle() {
		super.setNomeTeste(TestesConstants.RS_BUNDLE);
	}
	
	@Override
	public void teste() {
		
		testeRsBundle();
		linha();
		
	}
	
	public void testeRsBundle() {
		
		ResourceBundle rs = ResourceBundle.getBundle("intermediario");
		
		System.out.println( rs.getString("classe") );
		System.out.println( rs.getString("database") );
		System.out.println( rs.getString("user") );
		System.out.println( rs.getString("pass") );
		System.out.println( rs.getString("host") );
		System.out.println( rs.getString("resources") );
		
	}
	
}
