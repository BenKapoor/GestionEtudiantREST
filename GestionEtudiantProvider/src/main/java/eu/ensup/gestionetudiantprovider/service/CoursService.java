package eu.ensup.gestionetudiantprovider.service;

import java.util.List;

import eu.ensup.gestionetudiantprovider.dao.CoursDao;
import eu.ensup.gestionetudiantprovider.dao.ICoursDao;
import eu.ensup.gestionetudiantprovider.domaine.Cours;



public class CoursService implements ICoursService {
	ICoursDao dao = new CoursDao();
	
	public List<Cours> listerCours() {
		// TODO Auto-generated method stub
		return dao.listerCours();
	}

	public int creerCours(Cours cours) {
		// TODO Auto-generated method stub
		return dao.creerCours(cours);
	}

	public Cours lireInfoCours(int idCours) {
		// TODO Auto-generated method stub
		return dao.lireInfoCours(idCours);
	}

}
