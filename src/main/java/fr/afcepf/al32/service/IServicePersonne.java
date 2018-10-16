package fr.afcepf.al32.service;

import fr.afcepf.al32.entity.Personne;

public interface IServicePersonne {
	void ajouterPersonne(Personne p);
	Personne rechercherPersonneParNumero(Long num);
	
	/*----------------------------- Connexion ------------------------------*/
	Personne rechercherParConnexion(String login, String password);
}
