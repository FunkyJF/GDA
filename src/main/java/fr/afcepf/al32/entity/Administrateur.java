package fr.afcepf.al32.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NamedQueries({
	@NamedQuery(name="Administrateur.Connexion2", query="SELECT a FROM Administrateur a "
															+ "WHERE a.connexion.password = :password "
															+ "and a.connexion.login = :login ")
			
})
@DiscriminatorValue("Administrateur")
@Getter @Setter @NoArgsConstructor
public class Administrateur extends Personne{

	private Date dateDebut;
	
	private Date dateFin;

	public Administrateur(String prenom, String nom, String email, String telephone, Adresse adresse) {
		super(prenom, nom, email, telephone, adresse);
		
	}
	
	@Override
	public String toString() {
		return "Administrateur [dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]" + super.toString();
	}
	
}