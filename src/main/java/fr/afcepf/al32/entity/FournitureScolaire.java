package fr.afcepf.al32.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@DiscriminatorValue("FournitureScolaire")
public class FournitureScolaire extends Produit {
	
	@ManyToOne
	@JoinColumn(name="idNatureFourniture")
	private NatureFourniture natureFourniture;
}
