package donapp.dao.impl;

import java.sql.PreparedStatement;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import donapp.dao.UtenteDao;
import donapp.dbmanager.DbManager;
import donapp.model.Utente;

public class UtenteDaoImpl implements UtenteDao {

	DbManager db;
	public PreparedStatement insertPs;
	public PreparedStatement updatePs;
	public PreparedStatement deletePs;
	public PreparedStatement selectPs;
	public PreparedStatement loginPs;
	//COSTRUTTOREa
	public UtenteDaoImpl() {
		String insertQry = " INSERT INTO utente (username, password, nome, cognome, email) "
				+ "VALUES (?,?,?,?,?)";
		String updateQry = "UPDATE utente "
				+ "SET password=?,nome=?,cognome=?,email=? WHERE username=?";
		String deleteQry = "DELETE FROM utente WHERE username=?";
		String getUtenteQry = "SELECT * FROM utente WHERE username=?";
		String log="SELECT * FROM utente WHERE username=? and password=?";
		
		try {
			db=DbManager.getIstance("root","root");
			insertPs= db.getCon().prepareStatement(insertQry);
			updatePs = db.getCon().prepareStatement(updateQry);
			deletePs = db.getCon().prepareStatement(deleteQry);
			selectPs = db.getCon().prepareStatement(getUtenteQry);
			loginPs= db.getCon().prepareStatement(log);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Errore nel costruttore");
		}
	
	}
	
	




	//METODO CHE INSERISCE UN UTENTE
	@Override
	public boolean insertUtente(Utente u) {
		boolean flag=false;
		try {
	
			insertPs.setString(1, u.getUsername());
			insertPs.setString(2, u.getPassword());
			insertPs.setString(3, u.getNome());
			insertPs.setString(4, u.getCognome());
			insertPs.setString(5, u.getEmail());
			
			int result = insertPs.executeUpdate();
			if (result>0) {
				flag=true;
			}
		} catch (SQLException e) {
			System.err.println("Inserimento non riuscito");
		}
		
		return flag;
	}

	//METODO CHE AGGIORNA UN UTENTE
	@Override
	public boolean updateUtente(Utente u) {
		boolean flag=false;
		try {
			updatePs.setString(1, u.getPassword());
			updatePs.setString(2, u.getNome());
			updatePs.setString(3, u.getCognome());
			updatePs.setString(4, u.getEmail());
			updatePs.setString(5, u.getUsername());
			int righe=updatePs.executeUpdate();
			if(righe>0) {
				flag=true;
			}
		} catch (SQLException e) {
			System.err.println("Aggiornamento utente non riuscito");
			e.printStackTrace();
		}
		
		return flag;
	}

	//METODO CHE ELIMINA UN UTENTE
	@Override
	public boolean deleteUtente(String username) {
		boolean flag = false;
		try
		{
			deletePs.setString(1, username);
			int result = deletePs.executeUpdate();
			if (result>0)
			{
				flag=true;
			}		
		}
		catch (Exception e)
		{
			System.err.println("Cancellazione utente non riuscita");
		}
		return flag;
	}

	@Override
	public Utente getUtente(String username) {
		Utente u = null;
		try {
			selectPs.setString(1, username);
			ResultSet rs = selectPs.executeQuery();
			while(rs.next()) {
				u = new Utente();
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setNome(rs.getString("nome"));
				u.setCognome(rs.getString("cognome"));
				u.setEmail(rs.getString("email"));	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}
	
	public boolean loginUtente(String username, String password) {
		
		boolean flag=false;
		try {
			loginPs.setString(1, username);
			loginPs.setString(2, password);
			System.out.println(loginPs);
			ResultSet rs= loginPs.executeQuery();
			if (rs.next()) {
				System.out.println("ok login");
				return true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("not found");
		return flag;
	}

}
