package br.com.bino.testes;

import java.util.Set;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.time.Period;

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
		linha();
		
		testeClassesData();
		linha();
		
		testeComparaDatas();
		linha();
		
		testeSimpleDateFormat();
		linha();
		
		testeDateFormat();
		linha();
		
		testeTimeZone();
		linha();
		
		testeLocalDate();
		linha();
		
		testeLocalTime();
		linha();
		
		testeLocalDateTime();
		linha();
		
		testeFusos();
		linha();
		
		testeConvesaoObjetosDataAntigosParaAtuais();
		linha();
		
		testeDifDatasDate();
		linha();
		
		testeDifDatasLocalDate();
		linha();
		
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
	
	public void testeLocalDate() {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println(LocalDate.of(2022, 1, 17));
		System.out.println(LocalDate.parse("2022-01-17"));
		
		System.out.println( hoje.plusDays(156) );
		System.out.println( hoje.minusDays(160) );
		System.out.println( hoje.plusMonths(18) );
		System.out.println( hoje.minus(18, ChronoUnit.MONTHS) );
		System.out.println( hoje.getDayOfWeek() );
		System.out.println( hoje.getDayOfMonth() );
		System.out.println( hoje.getDayOfYear() );
		System.out.println( hoje.isLeapYear() );
		
	}
	
	public void testeLocalTime() {
		
		LocalTime agora = LocalTime.now();
		System.out.println( agora );
		
		System.out.println( LocalTime.of(20,34,45) );
		System.out.println( LocalTime.parse("19:34:54") );
		
		System.out.println( agora.plusMinutes(45) );
		System.out.println( agora.plusSeconds(245) );
		System.out.println( agora.plusHours(2) );
		
		System.out.println( agora.minusHours(4) );
		System.out.println( agora.plus(35, ChronoUnit.MINUTES) );
		
		System.out.println( agora.getHour() );
		System.out.println( agora.getMinute() );
		
		
	}
	
	public void testeLocalDateTime() {
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		System.out.println( LocalDateTime.of(2022,1,17,20,16,45) );
		System.out.println( LocalDateTime.parse("2022-01-17T20:16:45") );
		
		System.out.println( agora.plusSeconds(30) );
		System.out.println( agora.plusMinutes(10) );
		System.out.println( agora.plusHours(2) );
		System.out.println( agora.plusDays(1) );
		System.out.println( agora.plusWeeks(2) );
		System.out.println( agora.plusMonths(3) );
		System.out.println( agora.plusYears(2) );
		
		System.out.println( agora.minus(1,ChronoUnit.YEARS) );
		
		System.out.println( agora.getMinute() );
		System.out.println( agora.getDayOfYear() );
		
		
	}
	
	public void testeFusos() {
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println( fuso );
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		
		for(String f : fusos){
			System.out.println(f);
			System.out.println( ZoneId.of(f) );
		}
		
		ZoneId znSp = ZoneId.of("America/Sao_Paulo");
		System.out.println(znSp);
		
	}
	
	/**
	 * As vezes será necessário converter datas de bibliotecas mais antigas 
	 * para datas em bibliotecas mais modernas
	 */
	public void testeConvesaoObjetosDataAntigosParaAtuais() {
		
		Date dt1 = new Date();
		Calendar c1 = Calendar.getInstance();
		
		System.out.println( dt1 );
		System.out.println( c1 );
		
		LocalDateTime cv1 = LocalDateTime.ofInstant(dt1.toInstant(), ZoneId.systemDefault());
		LocalDateTime cv2 = LocalDateTime.ofInstant(c1.toInstant(), ZoneId.systemDefault());
		
		System.out.println( cv1 );
		System.out.println( cv2 );
		
	}
	
	/**
	 * Calculando diferença com Date,
	 * maneira antiga
	 */
	public void testeDifDatasDate() {
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			Date dt1 = fmt.parse("01/01/2022");
			Date dt2 = fmt.parse("10/01/2022");
			
			long diffMls = Math.abs(dt1.getTime() - dt2.getTime());
			
			long dias = TimeUnit.DAYS.convert(diffMls, TimeUnit.MILLISECONDS);
			
			System.out.println( dias );
			
		}catch(ParseException err) {
			err.printStackTrace();
		}
		
	}
	
	public void testeDifDatasLocalDate() {
		
		LocalDate dt1 = LocalDate.of(2022, 1, 1);
		LocalDate dt2 = LocalDate.of(2022,2,1);
		
		Period periodo = Period.between(dt1, dt2);
		
		System.out.println( periodo.getDays() );
		System.out.println( periodo.getMonths() );
		System.out.println( periodo.getYears() );
		
	}
	
	public void testeDifTempo() {
		
		LocalDateTime dt1 = LocalDateTime.of(2022,1,1,1,0,0);
		LocalDateTime dt2 = LocalDateTime.of(2022,1,1,5,56,34);
		
		Duration d = Duration.between(dt1, dt2);
		
		System.out.println( d.toHours() );
		System.out.println( d.toMinutes() );
		System.out.println( d.toSeconds() );
		
	}
	
}
