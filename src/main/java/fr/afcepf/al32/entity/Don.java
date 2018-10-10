package fr.afcepf.al32.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Don 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Date dateDon;
	
	@ManyToMany	
	@JoinTable(name="Don_Pack",
		     joinColumns= {@JoinColumn(name="idPack")},
		     inverseJoinColumns = {@JoinColumn(name="idDon")})
	private List<Pack> packs;
	
	@ManyToOne
	@JoinColumn(name="idDonateur")
	private Donateur donateur;

}
