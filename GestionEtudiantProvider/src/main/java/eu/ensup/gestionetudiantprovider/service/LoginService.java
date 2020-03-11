package eu.ensup.gestionetudiantprovider.service;

import java.util.List;

import eu.ensup.gestionetudiantprovider.dao.LoginDao;
import eu.ensup.gestionetudiantprovider.domaine.Direction;


public class LoginService {

	/**
	 * Service de connection/ Authentification de l'utilisateur
	 * @param login
	 * @param password
	 * @return
	 */
	public List<Direction> connection(String login, String password) {
		LoginDao dao = new LoginDao();
		return dao.login(login, password);
	}
}
