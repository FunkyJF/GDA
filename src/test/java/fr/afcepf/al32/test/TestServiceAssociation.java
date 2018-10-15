package fr.afcepf.al32.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al32.config.ServiceConfig;
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Personne;
import fr.afcepf.al32.service.IServicePersonne;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})

public class TestServiceAssociation {
	
	private Logger logger = LoggerFactory.getLogger(TestServiceAssociation.class);

	@Autowired
	private IServicePersonne  serviceAssociation; //à tester
	
	
	@Test
	public void AjouterAssociation() {
		System.out.println("Avt constructeur");
		Personne  association  = new Association( "TestraisonSociale",  "Testsiret",  "Testape",  "15/10/2018");
		System.out.println("Apres constructeur");
		serviceAssociation.ajouterPersonne(association);
	
		logger.debug("a="+association.toString());
	}
	
	

}