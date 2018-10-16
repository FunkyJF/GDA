package fr.afcepf.al32.service;

import java.util.List;

import fr.afcepf.al32.entity.Personne;

public interface IServicePersonne {
	void ajouterPersonne(Personne p);
	Personne rechercherPersonneParNumero(Long num);
	List<Personne> recherchePersonneParm(String hql, Long parm);
	/*----------------------------- Connexion ------------------------------*/
	Personne rechercherParConnexion(String login, String password);
}
