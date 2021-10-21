package br.com.bino.repositories.enumeradores;

public enum Calculadora {

	SOMA{
		@Override
		public double calcular(double pV1, double pV2) {
			return pV1 + pV2;
		}
	},
	SUBTRACAO{
		@Override
		public double calcular(double pV1, double pV2) {
			return pV1 - pV2;
		}
	},
	MULTIPLICACAO{
		@Override
		public double calcular(double pV1, double pV2) {
			return pV1 * pV2;
		}
	},
	DIVISAO{
		@Override
		public double calcular(double pV1, double pV2) {
			double r = (pV1 > 0 && pV2 > 0) ? pV1 / pV2 : 0;
			return r;
		}
	};
	
	public abstract double calcular(double pV1, double pV2);
	
}
