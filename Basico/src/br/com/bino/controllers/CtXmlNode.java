package br.com.bino.controllers;

import java.util.Random;
import java.util.HashMap;
import java.util.Map;

import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.XmlNodeRepository;

public class CtXmlNode extends ObjetoTeste {

	public CtXmlNode() {
		nomeTeste = TestesConstants.XML_NODE;
	}
	
	@Override
	public void teste() {
		
		if( testar ) {
			
			exemploAddTags();
			
		}
		
	}
	
	public void exemploAddTags() {

		//crio valor para atributo id
		String strId = "imp_cofins";
		
		//primeiro adiciono a tagItem com um atributo
		StringBuilder corpoXml = new StringBuilder("<testeCilada></testeCilada>");
		XmlNodeRepository xml = new XmlNodeRepository(corpoXml);
	
		xml.addTag("nse0:Reg30Item", "testeCilada", null, strId);
		
		xml.setDocument(xml.getDocument());
		
		Map<String, Double> tagsFilhas = new HashMap<String, Double>();
		
		tagsFilhas.put("nfs0:TributoSigla", 1.00);
		tagsFilhas.put("nfs0:TributoAliquota", 2.00);
		tagsFilhas.put("nfs0:TributoValor",3.00);
		
		xml.addTags(tagsFilhas,"nse0:Reg30Item", strId);
		
		xml.removeAttr("nse0:Reg30Item", "Id");
		
	}
	
	public void exemploAddPrefixo() {
		StringBuilder pXmlDocument = new StringBuilder();
		pXmlDocument.append(getStringTest());
		
		XmlNodeRepository xml = new XmlNodeRepository(pXmlDocument);
		
		String newXml = xml.mudarPrefixoTags("DescricaoRps", "urn:");
		
		xml.setDocument(new StringBuilder(newXml));
		
		System.out.println( newXml );
	}
	
	public static String getStringTest() {
		return "<DescricaoRps>            \n" + 
				"    <ccm>1157</ccm>            \n" + 
				"    <cnpj>33200056020093</cnpj>            \n" + 
				"    <senha>bancoteste</senha>            \n" + 
				"    <!--<crc>?</crc>            \n" + 
				"    <crc_estado>?</crc_estado>            -->\n" + 
				"    <aliquota_simples>sim</aliquota_simples>            \n" + 
				"    <!--<id_sis_legado>?</id_sis_legado>-->\n" + 
				"    <servico>1</servico>            \n" + 
				"    <situacao>im</situacao>            \n" + 
				"    <valor>1,00</valor>            \n" + 
				"    <base>1,00</base>            \n" + 
				"    <descricaoNF>Seção de Acupultura Milagrosa</descricaoNF>\n" + 
				"    <tomador_tipo>1</tomador_tipo>            \n" + 
				"    <tomador_cnpj>33200056014522</tomador_cnpj>            \n" + 
				"    <tomador_email>tomador_teste@gmail.com</tomador_email>            \n" + 
				"    <tomador_ie>0</tomador_ie>            \n" + 
				"    <tomador_im>0</tomador_im>            \n" + 
				"    <tomador_razao>Razão Tomador Teste</tomador_razao>            \n" + 
				"    <tomador_fantasia>Tomator Fantasia Teste</tomador_fantasia>            \n" + 
				"    <tomador_endereco>Rua Teste Bauru</tomador_endereco>            \n" + 
				"    <tomador_numero>1</tomador_numero>            \n" + 
				"    <tomador_complemento>Sala</tomador_complemento>            \n" + 
				"    <tomador_bairro>Vila Noemy</tomador_bairro>            \n" + 
				"    <tomador_CEP>17014900</tomador_CEP>            \n" + 
				"    <tomador_cod_cidade>3506003</tomador_cod_cidade>            \n" + 
				"    <tomador_fone>1111111111</tomador_fone>            \n" + 
				"    <!--<tomador_ramal>?</tomador_ramal>            \n" + 
				"    <tomador_fax>?</tomador_fax>            -->\n" + 
				"    <rps_num>1</rps_num>            \n" + 
				"    <rps_serie>1</rps_serie>            \n" + 
				"    <rps_dia>27</rps_dia>            \n" + 
				"    <rps_mes>08</rps_mes>            \n" + 
				"    <rps_ano>2021</rps_ano>            \n" + 
				"    <!--<outro_municipio>?</outro_municipio>            \n" + 
				"    <cod_outro_municipio>?</cod_outro_municipio>            -->\n" + 
				"    <servico_exporta>0</servico_exporta>            \n" + 
				"    <retencao_iss>0,00</retencao_iss>            \n" + 
				"    <pis>0,00</pis>            \n" + 
				"    <cofins>0,00</cofins>            \n" + 
				"    <inss>0,00</inss>            \n" + 
				"    <irrf>0,00</irrf>            \n" + 
				"    <csll>0,00</csll>            \n" + 
				"    <tipo_obra>3</tipo_obra>\n" + 
				"    <dia_emissao>27</dia_emissao>\n" + 
				"    <mes_emissao>08</mes_emissao>\n" + 
				"    <ano_emissao>2021</ano_emissao>            \n" + 
				"    <tributos>0,00</tributos>\n" + 
				"    <id_atividade>870</id_atividade>\n" + 
				"</DescricaoRps>";
	}
	
	
}
