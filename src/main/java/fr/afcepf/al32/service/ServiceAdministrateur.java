package fr.afcepf.al32.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.dao.IAdministrateurDao;
import fr.afcepf.al32.entity.Administrateur;

@Component //ou bien @Service qui herite de @Component
@Transactional
public class ServiceAdministrateur implements IServiceAdministrateur {
	private Logger logger = LoggerFactory.getLogger(ServiceAdministrateur.class);
	
	@Autowired
	private IAdministrateurDao administrateurDao=null;
	
	//pour injection de dépendance xml:
	public void setAdministrateurDao(IAdministrateurDao administrateurDao) {
		this.administrateurDao = administrateurDao;
	}
	
	public ServiceAdministrateur() {
		logger.debug("constructeur de ServiceAdministrateur appelé avant injections "
				+ " avec administrateurDao="+administrateurDao);
	}
	
	@PostConstruct
	public void initBean() {
		logger.debug("initBean() appelée après injection avec @PostConstruct "
				+ " avec administrateurDao="+administrateurDao);
	}


	@Override
	public Administrateur rechercherAdministrateurParNumero(Long num) {
		// v1 pas bien sans spring:
		//IPersonneDao dao = new PersonneDaoSimulation();
		//return dao.findOne(num);
		
		//V2 utilisant dao injecté par spring:
		return administrateurDao.findOne(num);
	}

	

}
