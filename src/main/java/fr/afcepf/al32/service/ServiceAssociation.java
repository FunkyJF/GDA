package fr.afcepf.al32.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.dao.IPersonneDao;
import fr.afcepf.al32.entity.Personne;


@Component //ou bien @Service qui herite de @Component
@Transactional
public class ServiceAssociation implements IServiceAssociation {
	private Logger logger = LoggerFactory.getLogger(ServiceAssociation.class);
	
	@Autowired
	private IPersonneDao personneDao=null;

	@Override
	public List<Personne> rechercheAssociationTypePt( Long param) {
		
		return personneDao.findAllByParam("AssociationParType", param);
	}

	@Override
	public List<Personne> rechercheAssociationTypePays(Long param) {
		return personneDao.findAllByParam("AssociationParPays", param);
		}

	@Override
	public void ajouterPersonne(Personne p) {
		 personneDao.save(p);
	}

	
	
	

}
