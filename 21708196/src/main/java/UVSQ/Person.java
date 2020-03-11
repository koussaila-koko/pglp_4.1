package UVSQ;


import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import java.time.format.DateTimeFormatter;

import java.util.stream.Collectors;

public final class Person {

	
	
	
	private final String nom;
	private final String prenom;
	private final Fonction fonction;
	private final LocalDate dateNaissance;
	private final List<Telephone> numerosTelephone;
	
	public static class PersonBuilder {
		
		
		private final String nom;
		private final String prenom;
		private final Fonction fonction;
		
		
		private LocalDate dateNaissance = null;
		private List<Telephone> numerosTelephone = new ArrayList<Telephone>();
		
		public PersonBuilder(String nom, String prenom, Fonction fonction) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonction = fonction;
		}
		
		public PersonBuilder dateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
			return this;
		}
		
		public PersonBuilder addNumeroTelephone(Telephone numeroTelephone) {
			this.numerosTelephone.add(numeroTelephone);
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
	private Person(PersonBuilder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		fonction = builder.fonction;
		dateNaissance = builder.dateNaissance;
		numerosTelephone = builder.numerosTelephone;
	}

	

	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}


	public Fonction getFonction() {
		return fonction;
	}

	


	
	public List<Telephone> getNumerosTelephone() {
		return numerosTelephone;
	}




	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	

	
	
	


}