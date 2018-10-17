package fr.afcepf.al32.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import fr.afcepf.al32.dao.IProduitDao;
import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.Produit;

@Component 
@Transactional
public class ServiceProduitImpl implements IServiceProduit {
	private Logger logger = LoggerFactory.getLogger(ServiceProduitImpl.class);
	
	@Autowired 
	private IProduitDao produitDao=null;

	public void setProduitDao(IProduitDao produitDao) {
		this.produitDao = produitDao;}

	public ServiceProduitImpl() {
		logger.debug("constructeur de ServiceProduitImpl appelé avant injections "
				+ " avec produitDao="+produitDao);
	}
	
	@PostConstruct
	public void initBean() {
		logger.debug("initBean() appelée après injection avec @PostConstruct "
				+ " avec produitDao="+produitDao);
	}

	@Override
	public List<Produit> rechercherProduitDuType(long idTypeProduit) {	
		return produitDao.produitParType(idTypeProduit);		
	}
	
	@Override
	public void ajouterProduit(Produit p) {
		produitDao.save(p);
	}
	
//	@Override
//	public Produit rechercherPackAvecProduits(long idPack) {
//		return produitDao.packAvecProduits(idPack);
//	}


}
