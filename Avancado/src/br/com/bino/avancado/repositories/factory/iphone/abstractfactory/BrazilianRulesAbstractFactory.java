package br.com.bino.avancado.repositories.factory.iphone.abstractfactory;

import br.com.bino.avancado.ifaces.fatory.CertificateIface;
import br.com.bino.avancado.ifaces.fatory.PackingIface;
import br.com.bino.avancado.repositories.factory.iphone.certificate.BrazilianCertificate;
import br.com.bino.avancado.repositories.factory.iphone.packing.BrazilianPackin;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public CertificateIface getCertificate() {
		return new BrazilianCertificate();
	}
	
	@Override
	public PackingIface getPacking() {
		return new BrazilianPackin();
	}
	
}
