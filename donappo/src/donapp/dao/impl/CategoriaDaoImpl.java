package donapp.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import donapp.dao.CategoriaDao;
import donapp.dbmanager.DbManager;
import donapp.model.Categoria;
import donapp.model.Oggetto;

public class CategoriaDaoImpl implements CategoriaDao {
	
	DbManager db;
	//Inserimento per una categoria
	private PreparedStatement insertPs;
	//Modifica una categoria
	private PreparedStatement updatePs;
	//Elimina una categoria
	private PreparedStatement deletePs;
	//Restituisce una categoria
	private PreparedStatement selectPsCat;
	//Restituisce tutte le categorie
	private PreparedStatement selectPsAllCat;
	//Restituisce tutti gli oggetti di una determinata categoria
	private PreparedStatement categoriaPsOggetto;
	//COSTRUTTOREa
	public CategoriaDaoImpl() {
		String insertQry="INSERT INTO categoria (idcategoria,nome) "
				+ "VALUES (?,?)";
		String updateQry="UPDATE categoria "
				+ "SET nome=? WHERE idcategoria=?";
		String deleteQry="DELETE FROM categoria WHERE idcategoria=?";
		
		String selectCatQry="SELECT * FROM categoria WHERE idcategoria=?";
		
		String selectAllCatQry="SELECT * FROM categoria";
		
		String categoriaAllOggettiQry="Select * from new_view where (idproprietario!=? AND idcategoria=?)";
		
		try {
			db=DbManager.getIstance("root","root");
			insertPs = db.getCon().prepareStatement(insertQry);
			updatePs = db.getCon().prepareStatement(updateQry);
			deletePs = db.getCon().prepareStatement(deleteQry);
			selectPsCat = db.getCon().prepareStatement(selectCatQry);
			selectPsAllCat = db.getCon().prepareStatement(selectAllCatQry);
			categoriaPsOggetto=db.getCon().prepareStatement(categoriaAllOggettiQry);
			
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
	
	public ArrayList<Oggetto> getAllOggettiCat(String username, int idcategoria) {
		ArrayList<Oggetto> arrO = new ArrayList<Oggetto>();
		try {
			categoriaPsOggetto.setString(1, username);
			categoriaPsOggetto.setInt(2, idcategoria);
			ResultSet rs = categoriaPsOggetto.executeQuery();
			while(rs.next()) {
				Oggetto o = new Oggetto();
				o.setIdOggetto(rs.getInt("idoggetto"));
				o.setFoto(rs.getString("foto"));
				o.setNome(rs.getString("nome"));
				o.setColore(rs.getString("colore"));
				o.setDescrizione(rs.getString("descrizione"));
				o.setLuogoRitiro(rs.getString("luogoritiro"));
				o.setDisponibilita(rs.getString("disponibilita"));
				o.setIdProprietario(rs.getString("idproprietario"));
				o.setIdPrenotante(rs.getString("idprenotante"));
				o.setIdCategoria(rs.getInt("idcategoria"));
				arrO.add(o);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arrO;
	}



}
