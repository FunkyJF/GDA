package fr.afcepf.al32.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.dao.IPersonneDao;

@Component //ou bien @Service qui herite de @Component
@Transactional
public class ServiceAdministrateur implements IServiceAdministrateur {
	private Logger logger = LoggerFactory.getLogger(ServiceAdministrateur.class);
	
	@Autowired
	private IPersonneDao personneDao=null;
	
	//pour injection de dépendance xml:
	public void setpersonneDao(IPersonneDao personneDao) {
		this.personneDao = personneDao;
	}
	
	public ServiceAdministrateur() {
		logger.debug("constructeur de ServiceAdministrateur appelé avant injections "
				+ " avec administrateurDao="+personneDao);
	}
	
	@PostConstruct
	public void initBean() {
		logger.debug("initBean() appelée après injection avec @PostConstruct "
				+ " avec administrateurDao="+personneDao);
	}

}
