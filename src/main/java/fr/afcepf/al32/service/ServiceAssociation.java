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
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Donateur;
import fr.afcepf.al32.entity.Personne;


@Component //ou bien @Service qui herite de @Component
@Transactional
public class ServiceAssociation implements IServiceAssociation {
	private Logger logger = LoggerFactory.getLogger(ServiceAssociation.class);
	
	@Autowired
	private IPersonneDao personneDao=null;

	@Override
	public List<Personne> rechercheAssociationTypePt( Long param) {
		
		return personneDao.findAllByParam("AssociationParType", "id",param);
	}

	@Override
	public List<Personne> rechercheAssociationTypePays(Long param) {
		return personneDao.findAllByParam("AssociationParPays","idPaysAide", param);
		}

	@Override
	public void ajouterModifierAssociation(Personne p) {
		 personneDao.save(p);
	}

	@Override
	public void supprimerAssociation(Long num) {
		personneDao.delete(num);
	}

	@Override
	public List<Personne> rechercheAssociationNouvelle() {
		return personneDao.findAll("AssociationNouvelle");
	}

	@Override
	public Personne rechercherParConnexion(String login, String password) {
		return personneDao.findByConnexion(login, password);
	}

	@Override
	public Personne rechercheAssociation(Long num) {
	
		Personne p = personneDao.findOne(num);
		if(p instanceof Association)
		{
			return p;
		}else return null;
		
	}
		
	

	@Override
	public void accepterAssociation(Long num, String dateAcc ) {
		Association a = (Association) personneDao.findOne(num);
		a.setDateAcceptation(dateAcc);
		 personneDao.save(a);
	}

	@Override
	public void refuserAssociation(Long num, String dateFin) {
		Association a = (Association) personneDao.findOne(num);
		a.setDateFin(dateFin);
		 personneDao.save(a);
		
	}

	
	
	

}
