package services;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.daoCategorie;
import models.Categorie;

public class ServiceCategorie {
	public static ArrayList<Categorie> listeCategories() throws ClassNotFoundException, SQLException{
		return daoCategorie.listeCategories();}

}
