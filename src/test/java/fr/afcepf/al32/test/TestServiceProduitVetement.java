package fr.afcepf.al32.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al32.config.ServiceConfig;
import fr.afcepf.al32.entity.Vetement;
import fr.afcepf.al32.service.IServiceProduit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceProduitVetement {
	private Logger logger = LoggerFactory.getLogger(TestServiceProduitVetement.class);
	
	@Autowired	
	IServiceProduit serviceProduitVetement;
	
	@Test
	public void ajouterProduitVetement() {
		Vetement prodVetement = new Vetement("Pantalon AAABBBBCCCC","Pantalon",5.0,"Noir Pantalon impermeable",true,false);		
		serviceProduitVetement.ajouterProduit(prodVetement);
		logger.debug("produit Vetement="+prodVetement.toString());	
	}
}
