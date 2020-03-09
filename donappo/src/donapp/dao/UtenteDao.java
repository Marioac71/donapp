package donapp.dao;

import donapp.model.Utente;

public interface UtenteDao {
	
	//OPERAZIONI CRUD
	public boolean insertUtente(Utente u);
	public boolean updateUtente(Utente u);
	public boolean deleteUtente(String username);
	public boolean loginUtente(String username, String password);
	public Utente getUtente(String username);
	

}
