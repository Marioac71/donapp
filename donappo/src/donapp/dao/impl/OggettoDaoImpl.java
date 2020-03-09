package donapp.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import donapp.dao.OggettoDao;
import donapp.dbmanager.DbManager;
import donapp.model.Oggetto;

public class OggettoDaoImpl implements OggettoDao {
	
	DbManager db;
	private PreparedStatement insertPs;
	private PreparedStatement updatePs;
	private PreparedStatement deletePs;
	private PreparedStatement searchPsAllOgg;
	private PreparedStatement selectPsAllOgg;
	private PreparedStatement prenotaPsOgg;
	private PreparedStatement cancellaPsPren;
	
	//COSTRUTTORE
	public OggettoDaoImpl() {
		String insertQry = "INSERT INTO oggetto (idoggetto,foto,nome,colore,descrizione,luogo_ritiro"
				+ ",disponibilita,idproprietario,idprenotante,idcategoria) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
		
		String updateQry = "UPDATE oggetto "
				+ "SET idoggetto=?,foto=?,nome=?,colore=?,descrizione=?,"
				+ "luogo_ritiro=?,disponibilita=?,idproprietario=?,idprenotante=?,idcategoria=?";
		
		String deleteQry = "DELETE FROM oggetto WHERE idoggetto=?";
		
		String searchAllMyOggQry = "SELECT * FROM oggetto WHERE idproprietario=?";
		String selectAllOggQry = "SELECT * FROM oggetto WHERE idproprietario!=?";
		String prenotaOggQry = "update oggetto set idprenotante=? where idoggetto=?";
		String cancellaPrenQry = "UPDATE oggetto set idprenotante=null where idoggetto=?";
		
		try {
			insertPs = db.getCon().prepareStatement(insertQry);
			updatePs = db.getCon().prepareStatement(updateQry);
			deletePs = db.getCon().prepareStatement(deleteQry);
			searchPsAllOgg = db.getCon().prepareStatement(searchAllMyOggQry);
			selectPsAllOgg = db.getCon().prepareStatement(selectAllOggQry);
			prenotaPsOgg = db.getCon().prepareStatement(prenotaOggQry);
			cancellaPsPren = db.getCon().prepareStatement(cancellaPrenQry);
			
		} catch (SQLException e) {
			System.err.println("Errore nel costruttore");
		}
		
	}

	
	
	//METODO CHE INSERISCE UN NUOVO OGGETTO
	@Override
	public boolean insertOggetto(Oggetto o) {
		boolean flag=false;
		try {
			insertPs.setInt(1, o.getIdOggetto());
			insertPs.setString(2, o.getFoto());
			insertPs.setString(3, o.getNome());
			insertPs.setString(4, o.getColore());
			insertPs.setString(5, o.getDescrizione());
			insertPs.setString(6, o.getLuogoRitiro());
			insertPs.setString(7, o.getDisponibilita());
			insertPs.setString(8, o.getIdProprietario());
			insertPs.setString(9, o.getIdPrenotante());
			insertPs.setInt(10, o.getIdCategoria());
			
			int righe = insertPs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Errore inserimento oggetto");
		}
		return flag;
	}

	//METODO CHE AGGIORNA UN PRODOTTO
	@Override
	public boolean updateOggetto(Oggetto o) {
		boolean flag=false;
		try {
			updatePs.setInt(1, o.getIdOggetto());
			updatePs.setString(2, o.getFoto());
			updatePs.setString(3, o.getNome());
			updatePs.setString(4, o.getColore());
			updatePs.setString(5, o.getDescrizione());
			updatePs.setString(6, o.getLuogoRitiro());
			updatePs.setString(7, o.getDisponibilita());
			updatePs.setString(8, o.getIdProprietario());
			updatePs.setString(9, o.getIdPrenotante());
			updatePs.setInt(10, o.getIdCategoria());
			
			int righe = updatePs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Errore nell'aggiornamento del prodotto");
		}
		return flag;
	}
	
	//METODO CHE ELIMINA UN PRODOTTO
	@Override
	public boolean deleteOggetto(int idOggetto) {
		boolean flag=false;
		try {
			deletePs.setInt(1, idOggetto);
			
			int righe = deletePs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Errore nella cancellazione del prodotto");
		}
		return flag;
	}

	//METODO CHE RESTITUISCE TUTTI I MIEI OGGETTI
	@Override
	public ArrayList<Oggetto> getAllMyOggetti(String username) {
		ArrayList<Oggetto> arrO = new ArrayList<Oggetto>();
		try {
			searchPsAllOgg.setString(1, username);
			ResultSet rs = searchPsAllOgg.executeQuery();
			while(rs.next()) {
				Oggetto o = new Oggetto();
				o.setIdOggetto(rs.getInt("idoggetto"));
				o.setFoto(rs.getString("foto"));
				o.setNome(rs.getString("nome"));
				o.setColore(rs.getString("colore"));
				o.setDescrizione(rs.getString("descrizione"));
				o.setLuogoRitiro(rs.getString("luogo_ritiro"));
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

	//METODO CHE VISUALIZZA TUTTI I PRODOTTI TRANNE QUELLI DEL PROPRIETARIO
	@Override
	public ArrayList<Oggetto> searchOggetti(String username) {
		ArrayList<Oggetto> arrO = new ArrayList<Oggetto>();
		try {
			selectPsAllOgg.setString(1, username);
			ResultSet rs = selectPsAllOgg.executeQuery();
			while(rs.next()) {
				Oggetto o = new Oggetto();
				o.setIdOggetto(rs.getInt("idoggetto"));
				o.setFoto(rs.getString("foto"));
				o.setNome(rs.getString("nome"));
				o.setColore(rs.getString("colore"));
				o.setDescrizione(rs.getString("descrizione"));
				o.setLuogoRitiro(rs.getString("luogo_ritiro"));
				o.setDisponibilita(rs.getString("disponibilita"));
				o.setIdProprietario(rs.getString("idproprietario"));
				o.setIdPrenotante(rs.getString("idprenotante"));
				o.setIdCategoria(rs.getInt("idcategoria"));
				arrO.add(o);
			}	
		}	 catch (SQLException e) {
			e.printStackTrace();
		}
		return arrO;
	}

	//METODO CHE PRENOTA UN PRODOTTO
	@Override
	public boolean prenotaOggetto(String username, int idOggetto) {
		boolean flag=false;
		try {
			prenotaPsOgg.setString(1, username);
			prenotaPsOgg.setInt(2, idOggetto);
			
			int righe=prenotaPsOgg.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	//METODO CHE ELIMINA UNA PRENOTAZIONE
	@Override
	public boolean deletePrenotazione(int idOggetto) {
		boolean flag=false;
		try {
			cancellaPsPren.setInt(1, idOggetto);
			int righe=cancellaPsPren.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
