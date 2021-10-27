package br.com.bino.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * utilizamos public @interface e o nome da anotação
 * 
 * Além disso, podemos utilizar Retention pra definir
 * quando essa anotação será utilizada, de forma que SOURCE é utilizada
 * apenas no código, CLASS será gravada na classe mas descartada pela VM
 * e RUNTIME poderá ser utilizada em tempo de execução
 *  
 * Target pra definir em que lugar pomos utilizar 
 * essa anotação que estamos criado
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesteMap{
	
	 //os atributos são definidos apenas pelo tipo e nome
	String nomeTeste();
	
	//além disso os atributos podem ter valores default
	String tipo() default "";
	boolean testar() default false;
	
}
