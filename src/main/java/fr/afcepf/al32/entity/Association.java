package fr.afcepf.al32.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("Association")//valeur de typePersonne pour cette classe
public class Association extends Personne {

	private String raisonSociale;

	   private String siret;

	   private String ape;

	   private String dateAcceptation;

	   private Date dateFin;
	   
	   @OneToMany(mappedBy="association",fetch=FetchType.LAZY)
	   private List<PackAssociation> packAssociations;
	   
	   @ManyToMany
		@JoinTable(name="Association_TypeProduit",
		     joinColumns= {@JoinColumn(name="idAssociation")} ,
		     inverseJoinColumns = {@JoinColumn(name="idTypeProduit")})
		private List<TypeProduit> typeProduits;
	   
	   @ManyToOne 
	   @JoinColumn(name="idPaysAide")
	   private PaysAide paysAide;
	   
	   public Association()
	   {
		  
	   }

	   
	   public Association(String raisonSociale, String siret, String ape, String dateAcceptation)
	   {
		   super();
		   this.raisonSociale = raisonSociale;
		   this.siret=siret;
		   this.ape = ape;
		   this.dateAcceptation = dateAcceptation;
	   }


	@Override
	public String toString() {
		return "Association [raisonSociale=" + raisonSociale + ", siret=" + siret + ", ape=" + ape
				+ ", dateAcceptation=" + dateAcceptation + ", dateFin=" + dateFin + ", packAssociations="
				+ packAssociations + ", typeProduits=" + typeProduits + ", paysAide=" + paysAide + "]";
	}


}
