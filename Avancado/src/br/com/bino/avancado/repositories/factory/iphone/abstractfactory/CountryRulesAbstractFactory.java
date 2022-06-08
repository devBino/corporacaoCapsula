package br.com.bino.avancado.repositories.factory.iphone.abstractfactory;

import br.com.bino.avancado.ifaces.fatory.CertificateIface;
import br.com.bino.avancado.ifaces.fatory.PackingIface;

public interface CountryRulesAbstractFactory {

	CertificateIface getCertificate();
	
	PackingIface getPacking();
	
}
