package br.com.bino.repositories.enumeradores;

import java.util.Random;

public enum TipoDocumento {

	CPF{
		@Override
		public String gerarNumero() {
			Random r = new Random();
			return String.valueOf(r.nextInt());
		}
	},
	CNPJ{
		@Override
		public String gerarNumero() {
			Random r = new Random();
			return String.valueOf(r.nextInt());
		}
	};

	
	
	public abstract String gerarNumero();
	
}
