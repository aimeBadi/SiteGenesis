package tech.genesis.digitManager.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Contact implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = true)
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String message;
    
    
	public Contact() {
		super();
		
	}

	public Contact(String nom, String prenom, String telephone, String email, String commentaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.message = commentaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String commentaire) {
		this.message = commentaire;
	}
   
	 
}
