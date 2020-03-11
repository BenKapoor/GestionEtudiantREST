package eu.ensup.gestionetudiantprovider.dao;

import java.util.List;

import eu.ensup.gestionetudiantprovider.domaine.Cours;



/**
 * @author benja
 * Interface du DAO de l'entit� Cours
 *
 */
public interface ICoursDao {

	/**
	 * @return une liste des cours
	 */
	public List<Cours> listerCours();
	
	/**
	 * Cr�ation d'un cours
	 * @param cours
	 * @return un cours
	 */
	public int creerCours(Cours cours);
	
	/**
	 * Lit le d�tail des informations d'un cours
	 * @param idCours
	 * @return Cours
	 */
	public Cours lireInfoCours(int idCours);
}
