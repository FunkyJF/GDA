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
import fr.afcepf.al32.entity.Produit;
import fr.afcepf.al32.service.IServiceProduit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ServiceConfig.class})
public class TestServiceProduit {
	
	private Logger logger = LoggerFactory.getLogger(TestServiceProduit.class);
	
	@Autowired	
	IServiceProduit serviceProduit;	
	
	//@Test
	public void testRechercherProduitDuType() {			
		 List<Produit> listeProduits = serviceProduit.rechercherProduitDuType(1L);	 		 
		 for(Produit p : listeProduits) {
			 System.out.println("produit: "+p.getLibelleCourt()+" - "+p.getPrix());						 
		 } 
	}
	
	@Test
	public void testRechercherPackAvecProduits() {	
		List<Produit> listeProduits = serviceProduit.rechercherPackAvecProduits(1L);		
		for(Produit p : listeProduits) {
			 System.out.println("produit: "+p.getLibelleCourt()+" - "+p.getPrix());						 
		 } 
	}
}
