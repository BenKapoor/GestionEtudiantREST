package eu.ensup.gestionetudiantprovider.dao;

import java.util.List;

import eu.ensup.gestionetudiantprovider.domaine.Cours;
import eu.ensup.gestionetudiantprovider.domaine.Etudiant;



/**
 * @author benja
 *	Interface du controller de la gestion des �tudiants
 *	Elle comprends toutes les m�thodes obligatoire du DAO
 */
public interface IDirectionDao {

	/**
	 * @return une liste d'�tudiant
	 */
	public List<Etudiant> listerEtudiants();
	
	/**
	 * Cr�ation d'un �tudiant
	 * @param etu
	 * @return un �tudiant
	 */
	public int creerEtudiant(Etudiant etu);
	
	/**
	 * Modifier un �tudiant
	 * @param etu
	 * @return int
	 */
	public int modifierEtudiant(Etudiant etu);
	
	/**
	 * Supprime un �tudiant
	 * @param idEtudiant
	 * @return int
	 */
	public int supprimerEtudiant(int idEtudiant);
	
	/**
	 * Lit le d�tail des informations d'un �tudiant
	 * @param idEtudiant
	 * @return Etudiant
	 */
	public Etudiant lireInfoEtudiant(int idEtudiant);
	
	/**
	 * Ajoute un �tudiaant � un cours
	 * @param etu
	 * @param c
	 * @return int
	 */
	public int ajouterEtudiantCours(Etudiant etu, Cours c);
}
