package donapp.dao;

import java.util.ArrayList;
import donapp.model.Oggetto;

public interface OggettoDao {
	
	//OPERAZIONI CRUD
	public boolean insertOggetto(Oggetto o);
	public boolean updateOggetto(Oggetto o);
	public boolean deleteOggetto(int idOggetto);
	
	//METODI
	public ArrayList<Oggetto> getAllMyOggetti(String username);
	public ArrayList<Oggetto> searchOggetti(String username);
	public boolean prenotaOggetto(String username,int idOggetto);
	public boolean deletePrenotazione(int idOggetto);
	

}
