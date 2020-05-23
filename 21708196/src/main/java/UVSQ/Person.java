package UVSQ;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *class  Person .
 * @author HAMMOUCHE Koussaila.
 */
public final class Person {
/**
	 *nom: le nom de  Person . 
	 */
	private final String nom;
	/**
	 *prenom: le prenom de  Person .
	 */
	private final String prenom;
	/**
	 *fonction: le fonction de  Person .
	 */
	private final Fonction fonction;
	/**
	 *dateNaissance: le dateNaissance de  Person .
	 */
	private final LocalDate dateNaissance;
	/**
	 *numerosTelephone: la liste des numerosTelephone de  Person .
	 */
	private final List<Telephone> numerosTelephone;
	/**
	 *la PersonBuilder  .
	 */
	public static class PersonBuilder {
		/**
		 *le nom  .
		 */
        private final String nom;
        /**
		 *le prenom  .
		 */
		private final String prenom;
		/**
		 *la fonction   .
		 */
		private final Fonction fonction;
		/**
		 *la dateNaissance  . 
		 */
		private LocalDate dateNaissance = null;
		/**
		 *numerosTelephone la liste de numeros  .
		 */
		private List<Telephone> numerosTelephone = new ArrayList<Telephone>();
		/**
		 *la PersonBuilder avec nom prenom et fonction
		 *@param nom ..
		 *@param prenom ..
		 *@param fonction ..
		 */
		public PersonBuilder(String nom, String prenom, Fonction fonction) {
			/**
			 *le nom  .
			 */
			this.nom = nom;
			/**
			 *le prenom  .
			 */
			this.prenom = prenom;
			/**
			 *la fonction   .
			 */
			this.fonction = fonction;
		}
		/**
		 *le builder de dateNaissance   .
		 *@param dateNaissance dateNaissance ..
		 *@return this dateNaissance
		 */
		public PersonBuilder dateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
			return this;
		}
		/**
		 *le builder de addNumeroTelephone   .
		 *@param numeroTelephone le telphone ..
		 *@return this numerosTelephone
		 */
	public PersonBuilder addNumeroTelephone(Telephone numeroTelephone) {
			this.numerosTelephone.add(numeroTelephone);
			return this;
		}
	/**
	 *le builder de peson   .
	 *@return person(i) .
	 */
		public Person build() {
			return new Person(this);
		}
	}
	/**
	 *le builder de peson   .
	 *@param builder ..
	 */
	private Person(PersonBuilder builder) {
		/**
		 *le prenom  .
		 */
		nom = builder.nom;
		/**
		 *le prenom  .
		 */
		prenom = builder.prenom;
		/**
		 *la fonctio, .
		 */
		fonction = builder.fonction;
		/**
		 * la dateNaissance
		 *  */
		dateNaissance = builder.dateNaissance;
		/**
		 * la numerosTelephone
		 **/
		numerosTelephone = builder.numerosTelephone;
	}
	/**
	 * la methode getNom
	 * qui retourn le nom
	 * @return nom  .
	 **/
	public String getNom() {
		return nom;
	}
	/**
	 * la methode getPrenom
	 * qui retourn le prenom
	 * @return prenom  .
	 **/
	public String getPrenom() {
		return prenom;
	}
	/**
	 * la methode getFonction
	 * qui retourn la fonction
	 * @return prenom  .
	 **/
	public Fonction getFonction() {
		return fonction;
		}/**
	 * la methode getNumerosTelephone
	 * qui retourn la liste des Numeros d Telephone
	 * @return prenom  .
	 **/
	public List<Telephone> getNumerosTelephone() {
		return numerosTelephone;
	}
	/**
	 * la methode getDateNaissance
	 * qui retourn la dateNaissance
	 * @return dateNaissance  .
	 **/
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	}