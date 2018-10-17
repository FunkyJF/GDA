package fr.afcepf.al32.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.dao.IPackDao;
import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.PackAssociation;
import fr.afcepf.al32.entity.Produit;


@Component 
@Transactional
public class ServicePackImpl implements IServicePack {
	private Logger logger = LoggerFactory.getLogger(ServicePackImpl.class);
	
	@Autowired 
	private IPackDao packDao=null;	

	public void setPackDao(IPackDao packDao) {
		this.packDao = packDao;
	}

	
	public ServicePackImpl() {
		logger.debug("constructeur de ServicePackImpl appelé avant injections "
				+ " avec packDao="+packDao);
	}
	
	
	@PostConstruct
	public void initBean() {
		logger.debug("initBean() appelée après injection avec @PostConstruct "
				+ " avec packDao="+packDao);
	}
	
	@Override
	public void ajouterPack(Pack p) {
		packDao.save(p);
	}	
	

	@Override
	public Pack rechercherPackParNumero(Long num) {			
		return (PackAssociation)packDao.findOne(num);		
	}
		
	@Override  
	public List<PackAssociation> rechercherPackAssociation() {		
		return packDao.findAllPackAssociation();		
	}


	@Override
	public List<PackAssociation> rechercherPackAssociationParType(Long idType) {
		return packDao.findAllPackAssociationByType(idType);
	}


	@Override
	public List<PackAssociation> rechercherPackAssociationParAssociation(Long id) {
		return packDao.findAllPackAssociationByAssociation(id);
	}


	@Override
	public List<PackAssociation> rechercherPackAssociationParAssociationEtType(Long id, Long idType) {
		return packDao.findAllPackAssociationByAssociationAndType(id, idType);
	}


	@Override
	public void ajouterProduit(Pack pa, Produit pr) 
	{
		if(pa.getTypeProduit().equals(pr.getTypeProduit()))
		{
			List<Produit> produits = pa.getProduits();
			produits.add(pr);
			pa.setProduits(produits);
			packDao.save(pa);
		}
	}


	@Override
	public void retirerProduit(Pack pa, Produit pr) 
	{
		List<Produit> produits = pa.getProduits();
		produits.remove(pr);
		pa.setProduits(produits);
		packDao.save(pa);
	}	

}
