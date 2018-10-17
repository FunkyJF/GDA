package fr.afcepf.al32.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al32.config.ServiceConfig;
import fr.afcepf.al32.entity.FournitureScolaire;
import fr.afcepf.al32.service.IServiceProduit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceProduitFScolaire {
	private Logger logger = LoggerFactory.getLogger(TestServiceProduitFScolaire.class);
	
	@Autowired	
	IServiceProduit serviceProduitFScolaire;
	
	@Test
	public void ajouterProduitFScolaire() {
		FournitureScolaire prodFScolaire = new FournitureScolaire("AAAA Lot de 3 cahiers ","Cahier AA",10.0,"AAAAAAAABBBBB");
		
		serviceProduitFScolaire.ajouterProduit(prodFScolaire);
		logger.debug("produit Scolaire="+prodFScolaire.toString());	
	}
}
