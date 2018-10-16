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
		
		Personne  association  = new Association( "TestraisonSociale",  "Testsiret",  "Testape",  "");
		serviceAssociation.ajouterModifierAssociation(association);
		logger.debug("ajout association="+association.toString());
	}
	@Test
	public void supprimerAssociation()
	{
		if(serviceAssociation.rechercheAssociation(100l) != null)
		{
			serviceAssociation.supprimerAssociation(100L);
		}
		
		else logger.debug("Supprimer: Association n'existe pas");
			
	}
	
	@Test
	public void rechercheTypeProduit()
	{
		List<Personne> associations = null;
		associations = serviceAssociation.rechercheAssociationTypePt(1L);
		for(Personne ass: associations )
		{
			logger.debug("ListeAss par type: " +ass.toString());
		}
	}
	@Test
	public void rechercheTypePays()
	{
		List<Personne> associations = null;
		associations = serviceAssociation.rechercheAssociationTypePays(1L);
		for(Personne ass: associations )
		{
			logger.debug("ListeAss par pays: " +ass.toString());
		}
	}
	
	@Test
	public void rechercheNouvelleAssociation()
	{
		List<Personne> associations = null;
		associations = serviceAssociation.rechercheAssociationNouvelle();
		for(Personne ass: associations )
		{
			logger.debug("ListeAss par nouvelle" +ass.toString());
		}
	}
	@Test
	public void accepterAssoc()
	{
		if(serviceAssociation.rechercheAssociation(10L) != null)
		{
			serviceAssociation.accepterAssociation(10L, "2022/05/12");
		}
		
		else logger.debug("Accepter: Association n'existe pas");
			
		
	}
	@Test
	public void reffuserAssoc()
	{
		if(serviceAssociation.rechercheAssociation(7L) != null)
			{
				serviceAssociation.refuserAssociation(7L, "2022/05/12");
			}
			
			else logger.debug("Refuser: Association n'existe pas");
		}
//	@Test
//	public void testRechercheAssociationParConnexion() {
//		Association a = serviceAssociation.rechercherAssociationParConnexion("assos1", "pwd1"); //Personne (Id = 7)
//		Assert.assertTrue(a.getId()==7L);
//		logger.debug("a="+a.toString());
//		


}