package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.CachorroRepository;

import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class CtCachorro extends ObjetoTeste {

	public String reflectionClassPath;
	
	public CtCachorro() {
		nomeTeste = TestesConstants.REFLECTION_CACHORRO;
		reflectionClassPath = "br.com.bino.repositories.CachorroRepository";
	}
	
	@Override
	public void teste() {
	
		try {
			
			if(testar) {
			
				listarNomeMetodos();
				listarAtributosMetodos();
				listarAnnotationsMetodos();
				invocarMetodos();
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void listarNomeMetodos() {
		try {
			
			Class c = Class.forName(reflectionClassPath);
			
			Method[] methods = c.getDeclaredMethods();
			
			for(Method m : methods) {
				System.out.println(m.toString());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listarAtributosMetodos() {
		try {
			
			Class c = Class.forName(reflectionClassPath);
			Method[] methods = c.getDeclaredMethods();
			
			for(Method m : methods) {
				System.out.println("Nome do método: " + m.getName());
				System.out.println("Retorno do método: " + m.getReturnType());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listarAnnotationsMetodos() {
		try {
			
			Class c = Class.forName(reflectionClassPath);
			Method[] methods = c.getDeclaredMethods();
			
			for(Method m : methods) {
				
				Annotation an = m.getAnnotation(Override.class);
				
				if(m.isAnnotationPresent(Override.class)) {
					System.out.println("Metodo foi sobreescrito");
				}else {
					System.out.println("Metodo não foi sobreescrito");
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void invocarMetodos() {
		try {
			
			Class c = Class.forName(reflectionClassPath);
			Method[] methods = c.getDeclaredMethods();
			
			for(Method m : methods) {
				m.invoke(new CachorroRepository());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	
}
