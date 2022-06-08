package br.com.bino.avancado.repositories.factory.iphone.abstractfactory;

import br.com.bino.avancado.ifaces.fatory.CertificateIface;
import br.com.bino.avancado.ifaces.fatory.PackingIface;
import br.com.bino.avancado.repositories.factory.iphone.certificate.UsCertificate;
import br.com.bino.avancado.repositories.factory.iphone.packing.UsPacking;

public class UsRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public CertificateIface getCertificate() {
		return new UsCertificate();
	}
	
	@Override
	public PackingIface getPacking() {
		return new UsPacking();
	}
	
}
