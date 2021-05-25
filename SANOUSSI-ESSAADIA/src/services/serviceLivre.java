package services;

	
	

	import java.sql.SQLException;
	import java.util.ArrayList;

	import dao.daoLivre;
	import models.Livre;

	public class serviceLivre {

	public static ArrayList<Livre> listeLivres() throws ClassNotFoundException, SQLException {

	return daoLivre.listeLivres();
	}

	}



