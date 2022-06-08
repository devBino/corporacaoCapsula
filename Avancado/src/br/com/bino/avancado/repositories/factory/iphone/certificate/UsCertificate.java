package br.com.bino.avancado.repositories.factory.iphone.certificate;

import br.com.bino.avancado.ifaces.fatory.CertificateIface;

public class UsCertificate implements CertificateIface {

	@Override
	public void applyCertificate() {
		
		System.out.println("Certificate iphone to US");
		
	}
	
}
