package br.com.bino.testes;

import java.util.Locale;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.FORMATA_NUMEROS, testar = true)
public class FormataNumeros extends TesteAbstract {

	public FormataNumeros() {
		super.setNomeTeste( TestesConstants.FORMATA_NUMEROS );
	}
	
	@Override
	public void teste() {

		try {
			
			testeNumberFormat();
			linha();
			
			testeDecimalFormat();
			linha();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void testeNumberFormat() throws ParseException {
		
		//formatando números
		Locale en = new Locale("en", "Unitad States");
		NumberFormat fmt = NumberFormat.getInstance(en);

		System.out.println( fmt.format(134.56) );
		
		Locale br = new Locale("pt", "Brazil");
		fmt = NumberFormat.getInstance(br);
		
		System.out.println( fmt.format(134.56) );
		
		//formatando como moeda
		NumberFormat fmtMoeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		System.out.println( fmtMoeda.format(53678.89) );
		
		//formatando percentual
		NumberFormat fmtPorcento = NumberFormat.getPercentInstance(Locale.getDefault());
		
		fmtPorcento.setMaximumIntegerDigits(5);
		fmtPorcento.setMinimumIntegerDigits(1);
		
		fmtPorcento.setMaximumFractionDigits(4);
		fmtPorcento.setMinimumFractionDigits(1);
		
		System.out.println( fmtPorcento.format(34.56) );
		
		//arredondamentos
		fmt = NumberFormat.getInstance(Locale.getDefault());
		
		fmt.setRoundingMode(RoundingMode.UP);
		fmt.setMaximumFractionDigits(0);
		fmt.setMinimumFractionDigits(0);
		
		System.out.println( fmt.format(29.61) );
		
		/**
		 * Transformando strings de números em números
		 * essa utilização do parse de NumberFormat 
		 * vai depender do Locale que foi passado
		 * para getInstance, mas o interessante é que ela evita
		 * replaces e verificações, basta passar
		 * o número dentro da string, do jeito que
		 * lemos naturalmente, 1 virgula 99
		 * e o parse se encarregara do resto
		 */
		
		System.out.println( fmt.parse("45.67") );
		
	}
	
	public void testeDecimalFormat() {
		
		String padrao1 = "###,###.##";
		String padrao2 = "###,###.##";
		
		DecimalFormat df = new DecimalFormat(padrao1);
		
		System.out.println(df.format(87288273382.89));
		
		df.applyPattern(padrao2);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","Brazil"));
		
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		DecimalFormat df2 = new DecimalFormat(padrao2, dfs);
		
		System.out.println(df2.format(87288273382.89));
		
		String padrao3 = "###,##0.00";
		DecimalFormat df3 = new DecimalFormat(padrao3);

		System.out.println(df3.format(0.1));
		
		String padrao5 = "-###,##0.00%";
		DecimalFormat df4 = new DecimalFormat(padrao5);
		
		System.out.println(df4.format(0.55));
		
	}

	
	
}
