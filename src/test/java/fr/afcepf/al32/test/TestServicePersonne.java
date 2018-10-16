/*package fr.afcepf.al32.test;

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
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Connexion;
import fr.afcepf.al32.entity.Donateur;
import fr.afcepf.al32.entity.Personne;
import fr.afcepf.al32.service.IServicePersonne;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"/springConfAnnot.xml"})
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServicePersonne {
	
	private Logger logger = LoggerFactory.getLogger(TestServicePersonne.class);

	@Autowired
	private IServicePersonne servicePersonne; //à tester
	
	
	@Test
	public void testRechercheParNum() {
		Personne p = servicePersonne.rechercherPersonneParNumero(2L);
		Assert.assertTrue(p.getId()==2L);
		logger.debug("p="+p.toString());
	}
	
	
	
	@Test
	public void testRechercheParConnexion() {
		testRechercheAssosParConnexion();
		testRechercheDonateurParConnexion();
		testRechercheAdministrateurParConnexion();
	}
	
	@Test
	public void testRechercheErroneParConnexion() {
		testRechercheErroneAssosParConnexion();
		testRechercheErroneDonateurParConnexion();
		testRechercheErroneAdministrateurParConnexion();
	}

	
	public void testRechercheAssosParConnexion() {
		Personne p = servicePersonne.rechercherPersonneParNumero(10L);
		Connexion c = p.getConnexion();
		
		Association p2 = (Association) servicePersonne.rechercherParConnexion(c.getLogin(), c.getPassword());
		Assert.assertTrue(p.getId()==p2.getId());
		logger.debug("p="+p.toString());
		logger.debug("p2="+p2.toString());
	}
	
	public void testRechercheDonateurParConnexion() {
		Personne p = servicePersonne.rechercherPersonneParNumero(4L);
		Connexion c = p.getConnexion();
		
		Donateur p2 = (Donateur) servicePersonne.rechercherParConnexion(c.getLogin(), c.getPassword());
		Assert.assertTrue(p.getId()==p2.getId());
		logger.debug("p="+p.toString());
		logger.debug("p2="+p2.toString());
	}

	public void testRechercheAdministrateurParConnexion() {
		Personne p = servicePersonne.rechercherPersonneParNumero(1L);
		Connexion c = p.getConnexion();
		
		Administrateur p2 = (Administrateur) servicePersonne.rechercherParConnexion(c.getLogin(), c.getPassword());
		Assert.assertTrue(p2.getId()==1L);
		logger.debug("p="+p.toString());
		logger.debug("p2="+p2.toString());
	}
	

	public void testRechercheErroneAdministrateurParConnexion() {
		
		Administrateur p2 = (Administrateur) servicePersonne.rechercherParConnexion("bfxcbfcd", "vsdvdvvs");
		Assert.assertTrue(p2 == null);
	}
	

	public void testRechercheErroneAssosParConnexion() {

		Association p2 = (Association) servicePersonne.rechercherParConnexion("bfxcbfcd", "vsdvdvvs");
		Assert.assertTrue(p2 == null);
	}
	

	public void testRechercheErroneDonateurParConnexion() {

		Donateur p2 = (Donateur) servicePersonne.rechercherParConnexion("bfxcbfcd", "vsdvdvvs");
		Assert.assertTrue(p2 == null);
	}
}*/