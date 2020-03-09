package donapp.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import donapp.dao.CategoriaDao;
import donapp.dbmanager.DbManager;
import donapp.model.Categoria;

public class CategoriaDaoImpl implements CategoriaDao {
	
	DbManager db;
	private PreparedStatement insertPs;
	private PreparedStatement updatePs;
	private PreparedStatement deletePs;
	private PreparedStatement selectPsCat;
	private PreparedStatement selectPsAllCat;
	//COSTRUTTORE
	public CategoriaDaoImpl() {
		String insertQry="INSERT INTO categoria (idcategoria,nome) "
				+ "VALUES (?,?)";
		String updateQry="UPDATE categoria "
				+ "SET nome=? WHERE idcategoria=?";
		String deleteQry="DELETE FROM categoria WHERE idcategoria=?";
		
		String selectCatQry="SELECT * FROM categoria WHERE idcategoria=?";
		
		String selectAllCatQry="SELECT * FROM categoria";
		try {
			
			insertPs = db.getCon().prepareStatement(insertQry);
			updatePs = db.getCon().prepareStatement(updateQry);
			deletePs = db.getCon().prepareStatement(deleteQry);
			selectPsCat = db.getCon().prepareStatement(selectCatQry);
			selectPsAllCat = db.getCon().prepareStatement(selectAllCatQry);
		} catch (SQLException e) {
			System.err.println("Errore nel costruttore");
			e.printStackTrace();
		}
	
	}
	
	
	//METODO CHE INSERISCE UNA NUOVA CATEGORIA
	@Override
	public boolean insertCategoria(Categoria a) {
		boolean flag=false;
		try {
			insertPs.setInt(1, a.getIdCategoria());
			insertPs.setString(2, a.getNome());
			int righe = insertPs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			System.err.println("Inserimento categoria non riuscito");
		}
		return flag;
	}

	//METODO CHE AGGIORNA UNA CATEGORIA
	@Override
	public boolean updateCategoria(Categoria a) {
		boolean flag=false;
		try {
			updatePs.setString(1, a.getNome());
			updatePs.setInt(2, a.getIdCategoria());
			int righe = updatePs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			System.err.println("Errore nella modifica della categoria");
			e.printStackTrace();
		}
		return flag;
	}

	//METODO CHE ELIMINA UNA CATEGORIA
	@Override
	public boolean deleteCategoria(int idCategoria) {
		boolean flag = false;
		
		try {
			deletePs.setInt(1, idCategoria);
			
			int righe = deletePs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			System.err.println("Errore nella cancellazione della categoria");
		}
		return flag;
	}

	//METODO CHE RITORNA TUTTE LE CATEGORIE
	@Override
	public ArrayList <Categoria> getAllCategorie() {
		ArrayList<Categoria> ac = new ArrayList<Categoria>();;
		try {
			ResultSet rs = selectPsAllCat.executeQuery();
			while(rs.next()) {
	
				Categoria c = new Categoria();
				c.setIdCategoria(rs.getInt("idcategoria"));
				c.setNome(rs.getString("nome"));
				ac.add(c);
				
			}
		} catch (SQLException e) {
			System.err.println("Impossibile visualizzare tutte le categorie");
		}
		return ac;
	}


	//METODO CHE RITORNA UNA SPECIFICA CATEGORIA
	@Override
	public Categoria getCategoria(int idCategoria) {
		Categoria c = null;
		try {
			selectPsCat.setInt(1, idCategoria);
			ResultSet rs = selectPsCat.executeQuery();
			while(rs.next()) {
				c = new Categoria();
				c.setIdCategoria(rs.getInt("idcategoria"));
				c.setNome(rs.getString("nome"));
			}
		} catch (SQLException e) {
			System.err.println("Non esiste nessuna categoria con questo id.");
		}
		return c;
	}

}
