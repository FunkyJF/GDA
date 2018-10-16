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
	
	
//	@Override  
//	public List<PackAssociation> rechercherTousLesPacks() {		
//		return packDao.findAll();
//		return null;
//	}	
//	
	@Override
	public Pack rechercherPackParNumero(Long num) {			
		return (PackAssociation)packDao.findOne(num);		
	}
		
	@Override  
	public List<PackAssociation> rechercherPackAssociation() {		
		return packDao.findAllPackAssociation();		
	}	
	
//	@Override
//	public void saveOrUpdatePackAssociation(PackAssociation p) {
//		
//		System.out.println("pack="+p.getLibelle()+"--"+p.getId());
//		
//		packDao.save(p);
//		
//		
//		System.out.println("pack="+p.getLibelle()+"--"+p.getId());		
//		
//	}
	
	
	
	
}
