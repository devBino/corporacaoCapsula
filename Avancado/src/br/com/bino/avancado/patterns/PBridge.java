package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.bridge.UserMysql;
import br.com.bino.avancado.repositories.bridge.UserOracle;
import br.com.bino.avancado.repositories.bridge.UserRest;
import br.com.bino.avancado.repositories.bridge.UserSoap;

@PatternMap(patternName = Constants.P_BRIDGE, call = true)
public class PBridge extends AbstractPattern {

	public PBridge() {
		super.setPatternName(Constants.P_BRIDGE);
	}
	
	@Override
	public void cleanCode() {
		
		UserRest userRest = new UserRest();
		UserSoap userSoap = new UserSoap();
		
		userRest.save(new UserOracle());
		userRest.save(new UserMysql());
		userSoap.save(new UserOracle());
		userSoap.save(new UserMysql());
		
	}
	
}
