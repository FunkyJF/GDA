package fr.afcepf.al32.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Vetement extends Produit {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Boolean sexe;
	private Boolean adulte;
	
	@ManyToOne
	@JoinColumn(name="idNatureVetement")
	private NatureVetement natureVetement;
}
