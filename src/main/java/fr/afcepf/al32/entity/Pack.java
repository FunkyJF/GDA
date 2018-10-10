package fr.afcepf.al32.entity;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typePack",
                     discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Pack")
public abstract class Pack 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	private Double prix;
	
	@ManyToOne
	@JoinColumn(name="idTypeProduit")
	private TypeProduit typeProduit;
	
	@ManyToMany
	@JoinTable(name="Pack_Produit",
    joinColumns= {@JoinColumn(name="idProduit")},
    inverseJoinColumns = {@JoinColumn(name="idPack")})
	private List<Produit> produits;
	
	@ManyToMany(mappedBy="packs")//LAZY par defaut
	private List<Don> dons;
}
