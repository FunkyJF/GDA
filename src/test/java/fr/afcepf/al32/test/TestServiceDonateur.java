package fr.afcepf.al32.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al32.config.ServiceConfig;
import fr.afcepf.al32.entity.Donateur;
import fr.afcepf.al32.service.IServiceDonateur;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceDonateur {
	
	private Logger logger = LoggerFactory.getLogger(TestServiceDonateur.class);

	@Autowired
	private IServiceDonateur serviceDonateur; //à tester
	
	
//	@Test
//	public void testRechercheDonateurParConnexion() {
//		Donateur d = serviceDonateur.rechercherDonateurParConnexion("user1", "pwd1"); //Personne Id=3
//		Assert.assertTrue(d.getId()==3L);
//		logger.debug("d="+d.toString());
//		
//	}
//	
//	@Test
//	public void testRechercheErroneDonateurParConnexion() {
//		Donateur d = serviceDonateur.rechercherDonateurParConnexion("scxsx", "pwd1"); //Inconnu
//		Assert.assertTrue(d==null);
//		
//	}
	

}