package eu.ensup.gestionetudiantprovider.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.gestionetudiantprovider.domaine.Cours;



/**
 * @author benja
 *	Classe DAO contenant toutes les m�thodes utiles aux Cours
 */
public class CoursDao implements ICoursDao {
	// ouverture unit� de persistance
	EntityManagerFactory emf;
	// porter de requete
	EntityManager em;
	
	public List<Cours> listerCours() {
		emf = Persistence.createEntityManagerFactory("gestion-etu");
		em = emf.createEntityManager();
		List<Cours> cours = new ArrayList();
		Query req = em.createQuery("select cours from Cours cours");
		cours = req.getResultList();
		return cours;
	}

	public int creerCours(Cours cours) {
		emf = Persistence.createEntityManagerFactory("gestion-etu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// 1 d�buter la transaction
			tx.begin();
			// 2 Effectuer l'op�ration
			em.persist(cours);
			// 3 valider la transaction
			tx.commit();
			// 4 fermet l'unit� de persistence
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}
	
	public Cours lireInfoCours(int idCours) {
		emf = Persistence.createEntityManagerFactory("gestion-etu");
		em = emf.createEntityManager();
		Cours cours = em.getReference(Cours.class, idCours);
		return cours;
	}

}
