package fr.afcepf.al32.dao;

import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.entity.Connexion;;

/*
 * DAO = Data Access Object (objet spécialisé dans l'accès aux données)
 * couche logicielle "persistance" ou "accès aux données"
 * avec méthodes "CRUD" 
 * C: Create (insert into)
 * R: Recherche
 * U: Update
 * D: Delete
 */

public interface IAdministrateurDao extends IGenericDao<Administrateur>{

	public Administrateur findOneByConnexion(Connexion c);
}
