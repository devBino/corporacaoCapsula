package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.math.BigDecimal;

@TesteMap(nomeTeste = TestesConstants.CLASSES_PRECISAO_NUMERICA, testar = true )
public class ClassesPrecisaoNumerica extends TesteAbstract {

	public ClassesPrecisaoNumerica() {
		super.setNomeTeste(TestesConstants.CLASSES_PRECISAO_NUMERICA);
	}
	
	@Override
	public void teste() {
		try {
			
			testeBigInteger();
			linha();
			
			testeBigDecimal();
			linha();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void testeBigInteger() throws ParseException {
		
		//velocidade da luz em um segundo
		BigInteger b1 = new BigInteger("300000");
		BigInteger anoLuz = b1.multiply(new BigInteger("31536000"));
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		System.out.println(String.format("A luz percorre %s Kms em um ano...", String.valueOf(df.format(anoLuz.doubleValue())) ));
		
	}
	
	public void testeBigDecimal() {
	
		//problemas de precisão usando double ou mesmo double
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		
		System.out.println( c );
		
		//calculando da maneira correta
		BigDecimal _a = new BigDecimal(String.valueOf(a));
		BigDecimal _b = new BigDecimal(String.valueOf(b));
		BigDecimal _c = _b.subtract(_a);
		
		System.out.println(_c);
		
		System.out.println( _b.multiply(_a));
		System.out.println( _b.add(_a) );
		System.out.println( new BigDecimal("100.99").divide( new BigDecimal("10") ) );
		
	}
	
}
