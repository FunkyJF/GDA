package fr.afcepf.al32.service;


import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.dao.IPersonneDao;
import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.entity.Donateur;
import fr.afcepf.al32.entity.Personne;

@Component //ou bien @Service qui herite de @Component
@Transactional
public class ServiceAdministrateur implements IServiceAdministrateur {
	private Logger logger = LoggerFactory.getLogger(ServiceAdministrateur.class);
	
	@Autowired
	private IPersonneDao personneDao=null;

	@Override
	public void ajouterModifierAdmin(Personne p) {
		 personneDao.save(p);
	}

	@Override
	public void supprimerAdmin(Long num) {
		personneDao.delete(num);
		
	}

	@Override
	public Personne rechercheAdmin(Long num) {
		Personne p = personneDao.findOne(num);
		if(p instanceof Administrateur)
		{
			return p;
		}else return null;
		
	}


	@Override
	public Personne rechercherParConnexion(String login, String password) {
		return personneDao.findByConnexion(login, password);
	}
	
	

}
