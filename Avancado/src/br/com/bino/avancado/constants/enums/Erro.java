package br.com.bino.avancado.constants.enums;

public enum Erro {

	E_001{
		@Override
		public String getError() {
			return "E001 - There's no Patterns implemented yet...";
		}
	},
	E_404{
		@Override
		public String getError() {
			return "E404 - Pattern not found";
		}
	},
	E_500{
		@Override
		public String getError() {
			return "E500 - There's no pattern yet, or this pattern not exists";
		}
	};
	
	public abstract String getError();
	
}
