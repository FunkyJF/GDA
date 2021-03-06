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
import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.PackAssociation;
import fr.afcepf.al32.service.IServicePack;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServicePackAssociation {
	
	private Logger logger = LoggerFactory.getLogger(TestServicePackAssociation.class);

	@Autowired
	private IServicePack servicePackAssociation;
	
	@Test
    public void ajouterPackAssociation() {
	    
		Pack pAssociation = new PackAssociation("pack9",90.0);		
		
		servicePackAssociation.ajouterPack(pAssociation);
		 
	    logger.debug("pAssociation="+pAssociation.toString());		
	}
	
	@Test
	public void testRechercherPackAssociationParNumero() {		
		PackAssociation p = (PackAssociation)servicePackAssociation.rechercherPackParNumero(4L);
		Assert.assertTrue(p.getId()==4L);
		logger.debug("p="+p.toString());			
	}
	
	@Test
	public void testRechercherPackAssociationTous() {
		List<PackAssociation> listePacks = servicePackAssociation.rechercherPackAssociation();			
		for(PackAssociation p : listePacks) {
			System.out.println("Pack: "+p.getLibelle()+" - " +p.getAssociation());				
		    //KO logger.debug("*** Pack= "+p.toString());

		}	
		
	}
	
	@Test
	public void testRechercherPackAssociationParType() {
		Long type = 1L;
		List<PackAssociation> listePacks = servicePackAssociation.rechercherPackAssociationParType(type);	
		for(PackAssociation p : listePacks) 
		{
			Assert.assertTrue(p.getTypeProduit().getId()==type);
		}	
		
	}
	
	@Test
	public void testRechercherPackAssociationParAssociation() {
		Long id = 1L;
		List<PackAssociation> listePacks = servicePackAssociation.rechercherPackAssociationParAssociation(id);	
		for(PackAssociation p : listePacks) 
		{
			Assert.assertTrue(p.getAssociation().getId()==id);
		}	
		
	}
	
	@Test
	public void testRechercherPackAssociationParAssociationEtType() {
		Long type = 1L;
		Long id = 1L;
		List<PackAssociation> listePacks = servicePackAssociation.rechercherPackAssociationParAssociationEtType(id, type);	
		for(PackAssociation p : listePacks) 
		{
			Assert.assertTrue((p.getAssociation().getId()==id) && (p.getTypeProduit().getId()==type));
		}	

	}
	
		@Test
		public void testDesactiverPackAssociation() {
			PackAssociation p = (PackAssociation)servicePackAssociation.rechercherPackParNumero(4L);
			Assert.assertTrue(p.getDateRetrait() == null);
			
			servicePackAssociation.desactiverPack(p);
			PackAssociation p2 = (PackAssociation)servicePackAssociation.rechercherPackParNumero(4L);
			Assert.assertTrue(p2.getDateRetrait() != null);
				

		}

}	
