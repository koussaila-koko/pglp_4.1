package UVSQ;

import java.util.ArrayList;
/**
 * la classe Composite
 *pour afficher le groupe de personnel.
 * @author koussiala HAMMOUCHE .
 *
 */
public class Composite implements print {
	/**
     *la liste des personnes
     */
	private ArrayList<print> Persone ;
	/**
     *Le nom de groupe des ces personnes.
     */private String NomGroupe;
		{
		this.NomGroupe = " ";
		this.Persone = new ArrayList<print>();
	}
		/**
		* Constructor Composite
		 * @param NomGroupe le nom de qroupe.
		 * @param Persone la liste des personnes
		 * */
		public Composite(ArrayList<print> Persone, String NomGroupe)
		{
		this.NomGroupe = NomGroupe;
		this.Persone = Persone;
		}
		/**
		 * fonction qui retourne le tableu des personnes
	     * @return laliste des personnes.
	     */
		public  ArrayList<print>getPersonnel()
		{
		return this.Persone;}
		/**
		 * la methode print la methode de linterface
	     * elle return laliste des personnes.
	     */
	public void print() {
		System.out.println("Le nom du groupe est : " + this.NomGroupe);
		for (print personne :Persone) {
			   ((UVSQ.print) Persone).print();
		    }
	}
}
