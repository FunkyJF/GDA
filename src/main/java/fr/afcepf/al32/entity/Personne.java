package fr.afcepf.al32.entity;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="Personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typePersonne",
                     discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Personne")//valeur de typePersonne pour cette classe
public abstract class Personne 
{
	@Id
	private Long id;

	private String prenom;
	
	private String nom;
	
	private String email;
	
	private String telephone;
	
	@OneToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name="idConnexion")
	private Connexion connexion;
	
	@OneToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name="idAdresse")
	private Adresse adresse;
}
