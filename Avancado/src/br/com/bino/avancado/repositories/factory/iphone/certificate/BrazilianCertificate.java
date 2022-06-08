package br.com.bino.avancado.repositories.factory.iphone.certificate;

import br.com.bino.avancado.ifaces.fatory.CertificateIface;

public class BrazilianCertificate implements CertificateIface {

	@Override
	public void applyCertificate() {
		
		System.out.println("Certificate iphone to Brazil");
		
	}
	
}
