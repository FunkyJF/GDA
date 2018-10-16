package fr.afcepf.al32.test;

import java.sql.Timestamp;
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
		
		Timestamp dteAjout = new Timestamp( System.currentTimeMillis() );		
	    //Association a = new Association();		   
	    
		Pack pAssociation = new PackAssociation("pack9",90.0,dteAjout);		
		
		servicePackAssociation.ajouterPack(pAssociation);
		 
	    logger.debug("pAssociation="+pAssociation.toString());		
	}
	
	//@Test
	public void testRechercherPackAssociationParNumero() {		
		PackAssociation p = (PackAssociation)servicePackAssociation.rechercherPackParNumero(4L);
		Assert.assertTrue(p.getId()==4L);
		logger.debug("p="+p.toString());			
	}
	
	//@Test
	public void testRechercherPackAssociationTous() {
		List<PackAssociation> listePacks = servicePackAssociation.rechercherPackAssociation();	
		//(List<PackAssociation>)
		//System.out.println("aaa");
		for(PackAssociation p : listePacks) {
			System.out.println("aaaaaaaaaaa");
		//System.out.println("Pack: "+p.getLibelle()+" - "+p.getAssociation());			
////		//logger.debug("*** Pack= "+p.toString());
		}	
		
	}
	
}
