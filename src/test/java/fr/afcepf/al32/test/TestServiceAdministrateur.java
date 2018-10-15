<<<<<<< HEAD
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
import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.service.IServiceAdministrateur;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceAdministrateur {
	
	private Logger logger = LoggerFactory.getLogger(TestServiceAdministrateur.class);

	@Autowired
	private IServiceAdministrateur serviceAdministrateur; //à tester
	
	
//	@Test
//	public void testRechercheAdministrateurParConnexion() {
//		Administrateur a = serviceAdministrateur.rechercherAdministrateurParConnexion("admin1", "pwd1");
//		Assert.assertTrue(a.getId()==1L);
//		logger.debug("a="+a.toString());
//		
//	}
//	
//	@Test
//	public void testRechercheErroneAdministrateurParConnexion() {
//		Administrateur a = serviceAdministrateur.rechercherAdministrateurParConnexion("adxscdc1", "pwd1");
//		Assert.assertTrue(a==null);
//		
//	}
	

=======
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
import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.entity.Adresse;
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Personne;
import fr.afcepf.al32.service.IServiceAdministrateur;
import fr.afcepf.al32.service.IServicePersonne;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceAdministrateur {
	
	private Logger logger = LoggerFactory.getLogger(TestServiceAdministrateur.class);

	@Autowired
	private IServicePersonne serviceAdministrateur;
	//private IServiceAdministrateur serviceAdministrateur; //à tester
	
	
	@Test
	public void testRechercheParNum() {
		Administrateur a = (Administrateur) serviceAdministrateur.rechercherPersonneParNumero(1L);
		Assert.assertTrue(a.getId()==1L);
		logger.debug("a="+a.toString());
	}
	
	@Test
	public void testRechercheIcorrecte() {
//		Administrateur a = serviceAdministrateur.rechercherAdministrateurParNumero(4L);
//		Assert.assertFalse(a.getClass().equals(Administrateur.class));
	}
	@Test
	public void AjouterAdministrateur() {
		System.out.println("Avt constructeur");
		Adresse adress = new Adresse();
		Personne  admin  = new Administrateur("mamadou", "babar", "mamadou@gmail.com", "99999999", adress);
		System.out.println("Apres constructeur");
		serviceAdministrateur.ajouterPersonne(admin);
	
		logger.debug("a="+admin.toString());
	}

>>>>>>> ff5a8e4f10c5bd060295c5696bc9e43a2aad194c
}