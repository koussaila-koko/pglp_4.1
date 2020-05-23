package UVSQ;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *class  IteratorGroupeafficher .
 * @author HAMMOUCHE Koussaila.
 */
public class IteratorGroupeafficher extends IteratorGroupe  implements
Iterator<print> {
	/**
	* constructeur IteratorGroupeafficher
	*  appeller le constructeur de IteratorGroupe.
	 * @param listComposite .
	 * */
	public IteratorGroupeafficher(ArrayList<print> listComposite) {
		super(listComposite);
	}
	/**
	 * methode afficher qui affiche la liste de groupe
	 *  de personnel.
	 * */
	@Override
	public void afficher() {
 Iterator<print> iterator = this.getList().iterator();
	    while (iterator.hasNext()) {
             iterator.next().print();
        }
	    }
	}