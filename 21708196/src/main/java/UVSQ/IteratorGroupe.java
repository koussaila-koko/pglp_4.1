package UVSQ;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *class  IteratorGroupe .  
 * @author HAMMOUCHE Koussaila.
 * 
 */
public class IteratorGroupe implements Iterator  <print> {
	/**
     *listComposite liste de groupe des personnes
     */
	private ArrayList<print> listComposite;
	/**
     *i conteur.
     **/
	private int i;
	/**
	* Constructor IteratorGroupe
 	 * @param listComposite.
	 * La liste des groupes des personnes .
	 * */
	public IteratorGroupe(ArrayList<print> listComposite) {
		this.i = -1;
		this.listComposite = listComposite;
	}
/**
	 * methed hasNext pour savoir si une liste est vide ou non
     * Retourne un boullean 1 si la liste vide  .
     * @return un boullean 1 si la liste a n'est pas vide  .
     */
	public boolean hasNext() {
		return !listComposite.isEmpty();
	}
/**
     * Retourne listComposite.
     * @return LlistComposite.
     *
     */
	public  ArrayList<print> getList() {
		return listComposite;
	}
	/**
	 * methode print qui affiche
	 *  la liste de groupe de personnel.
	 * */
	public print next() {
		System.out.println(listComposite.get(i++));
        listComposite.get(i).print();
        	return listComposite.get(i);
	}
	/**
	 * methode afficher qui a ete appler dans IteratorGroupeaffiche
	 * */
	public void afficher() {
		}
	}
