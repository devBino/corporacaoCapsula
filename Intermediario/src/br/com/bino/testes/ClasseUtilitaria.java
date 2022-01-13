package br.com.bino.testes;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.CLASSE_UTILITARIA, testar = true)
public class ClasseUtilitaria extends TesteAbstract {

	public ClasseUtilitaria() {
		super.setNomeTeste(TestesConstants.CLASSE_UTILITARIA);
	}

	@Override
	public void teste() {
		
		testeClasseMath();
		testeClassesData();
		testeComparaDatas();
		testeSimpleDateFormat();
		testeDateFormat();
		testeTimeZone();
		
	}
	
	/**
	 * Algumas funções de exemplo disponíveis da classe Math
	 * uma curiosidade sobre números no java, se vamos utilizar
	 * java em um sistema financeiro, devemos fugir de fazer operações simples
	 * com números primitivos, precisamos utilizar as classes
	 */
	public void testeClasseMath() {
		
		System.out.println( "Potência " + Math.pow(2, 3) );
		System.out.println( "Arredondamento para cima " + Math.round(4.7) );
		System.out.println( "Arredondamento para baixo " + Math.round(4.4) );
		System.out.println( "Força arredondamento para cima " + Math.ceil(4.7));
		System.out.println( "Força arredondamento para cima " + Math.ceil(4.4));
		System.out.println( "Força arredondamento para baixo " + Math.floor(4.7));
		System.out.println( "Força arredondamento para baixo " + Math.floor(4.4));
		
		int n = (int) Math.round(Math.random() * 10);
		System.out.println( "Gerando números aleatórios " + n );
		
		System.out.println( Math.sin(Math.toRadians(30)) );
		System.out.println( Math.cos(Math.toRadians(1)) );
		System.out.println( Math.tan(Math.toRadians(45)) );
		
	}
	
	public void testeClassesData() {
	
		//classe Date (não é a melhor forma)
		Date data1 = new Date();
		System.out.println(data1);
		
		System.out.println("Milesegundos desde de 1970 " + data1.getTime());
		System.out.println("Dia do mes " + data1.getDate());
		System.out.println("Mês " + data1.getMonth());
		System.out.println("Ano " + data1.getYear());

		//classe Calendar (mais completo que o Date)
		Calendar data2 = Calendar.getInstance();
		
		System.out.println(data2);
		
		data2.add(Calendar.DAY_OF_MONTH, 5);
		data2.add(Calendar.DAY_OF_MONTH, -4);
		
		int ano = data2.get(Calendar.YEAR);
		int mes = data2.get(Calendar.MONTH);
		int dia = data2.get(Calendar.DAY_OF_MONTH);
		int hora = data2.get(Calendar.HOUR);
		int minutos = data2.get(Calendar.MINUTE);
		int segundos = data2.get(Calendar.SECOND);
		
		int s = data2.get(Calendar.WEEK_OF_YEAR);
		
		System.out.printf( "Data: %02d-%02d-%d %02d:%02d:%02d", dia,(mes+1),ano,hora,minutos,segundos );

		//classe GregorianCalendar
		GregorianCalendar data3 = new GregorianCalendar();
		System.out.println( data3.isLeapYear(2016) );
		
		GregorianCalendar data4 = new GregorianCalendar(2022,0,11);
		System.out.println(data4.get(Calendar.YEAR));
		
	}
	
	public void testeComparaDatas() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			Date dt1 = sdf.parse("01-01-2022");
			Date dt2 = sdf.parse("11-01-2022");
			Date dt3 = sdf.parse("01-01-2021");
			
			System.out.println( dt1.compareTo(dt2) );
			
			Calendar c1 = Calendar.getInstance();
			c1.setTime(dt1);
			
			Calendar c2 = Calendar.getInstance();
			c2.setTime(dt2);
			
			System.out.println(c1.compareTo(c2));
			
		}catch(ParseException err) {
			err.printStackTrace();
		}
		
	}
	
	/**
	 * Utilizamos SimpleDateFormat quando queremos especificar 
	 * formatos em datas, formatar datas
	 */
	public void testeSimpleDateFormat() {
		
		//formatando datas, de formatos para datas
		String formatoBrasil = "dd-MM-yyyy HH:mm:ss";
		String formatoAmericano = "yyyy-MM-dd";
		
		SimpleDateFormat sdf = new SimpleDateFormat(formatoBrasil);
		
		Calendar data = new GregorianCalendar(1989,9,14,17,10,05);
		
		System.out.println( "Data formatada: " + sdf.format(data.getTime()) );
		
		//convertendo datas, de string para datas
		String strData = "14-10-1989 17:10:05";
		
		try {
			Date dtData = sdf.parse(strData);
			System.out.println( dtData );
		}catch(ParseException err) {
			err.printStackTrace();
		}
		
	}
	
	/**
	 * Utilizamos DateFormat quando necessitamos
	 * trabalhar com Locale nas datas
	 */
	public void testeDateFormat() {
		
		Date hoje = new Date();
		System.out.println( Locale.getDefault() );
		
		//Locale.setDefault(new Locale("en", "US"));
		Locale.setDefault(new Locale("pt","BR"));
		
		//formato data completa de acordo com Locale padrão do sistema operacional
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//formato data pegando apenas o tempo horas minutos e segundos
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//formato data pegando dia mes e ano
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//formato data completa
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//convertendo strings em datas, desde que respeitado o formato
		String strData = "07/09/2017 13:57";
		
		try {
			
			Date dtData = DateFormat.getInstance().parse(strData);
			System.out.println(dtData);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(dtData);
			
			System.out.println(cal);
			
		}catch(ParseException err) {
			err.printStackTrace();
		}
		
	}
	
	public void testeTimeZone() {
		
		Calendar cal = Calendar.getInstance();
		TimeZone tz = cal.getTimeZone();
		
		System.out.println(tz);
		
		TimeZone tzSp = TimeZone.getTimeZone("America/Sao_Paulo");
		
		System.out.println(tzSp.getDisplayName());
		System.out.println(tzSp.getID());
				
	}
	
	
}
