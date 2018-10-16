package fr.afcepf.al32.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al32.config.ServiceConfig;
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Personne;
import fr.afcepf.al32.service.IServiceAssociation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceAssociation {
	
	private Logger logger = LoggerFactory.getLogger(TestServiceAssociation.class);

	@Autowired
	private IServiceAssociation serviceAssociation; //à tester
	@Test
	public void AjouterAssociation() {
		
		Personne  association  = new Association( "TestraisonSociale",  "Testsiret",  "Testape",  "15/10/2018");
		serviceAssociation.ajouterPersonne(association);
		logger.debug("ajout association="+association.toString());
	}
	@Test
	public void rechercheTypeProduit()
	{
		List<Personne> associations = null;
		associations = serviceAssociation.rechercheAssociationTypePt(1L);
		for(Personne ass: associations )
		{
			System.out.println("ListeAss par type" +ass.toString());
		}
	}
	@Test
	public void rechercheTypePays()
	{
		List<Personne> associations = null;
		associations = serviceAssociation.rechercheAssociationTypePays(1L);
		for(Personne ass: associations )
		{
			System.out.println("ListeAss par pays" +ass.toString());
		}
	}
//	@Test
//	public void testRechercheAssociationParConnexion() {
//		Association a = serviceAssociation.rechercherAssociationParConnexion("assos1", "pwd1"); //Personne (Id = 7)
//		Assert.assertTrue(a.getId()==7L);
//		logger.debug("a="+a.toString());
//		
//	}
//	
//	@Test
//	public void testRechercheErroneAssociationParConnexion() {
//		Association a = serviceAssociation.rechercherAssociationParConnexion("vfdvd", "pwd1"); //Inconnu
//		Assert.assertTrue(a==null);
//		
//	}

}