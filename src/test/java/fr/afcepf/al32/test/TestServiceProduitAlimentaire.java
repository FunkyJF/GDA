package fr.afcepf.al32.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al32.config.ServiceConfig;
import fr.afcepf.al32.entity.Aliment;
import fr.afcepf.al32.service.IServiceProduit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceProduitAlimentaire {
	private Logger logger = LoggerFactory.getLogger(TestServiceProduitAlimentaire.class);
	
	@Autowired	
	IServiceProduit serviceProduitAliment;	
	
	@Test
	public void ajouterProduitAlimentaire() {
		Aliment prodAliment = new Aliment("Lentilles vert","Ble delicat",10.0,"1Kg - Lentilles AAAA  BBBB CCCCC");
		serviceProduitAliment.ajouterProduit(prodAliment);
		logger.debug("produit Aliment="+prodAliment.toString());	
	}
}
