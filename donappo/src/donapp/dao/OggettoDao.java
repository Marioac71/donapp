package donapp.dao;

import java.util.ArrayList;
import donapp.model.Oggetto;
import donapp.model.OggettoDto;

public interface OggettoDao {
	
	//OPERAZIONI CRUD
	public Integer insertOggetto(Oggetto o);
	public boolean updateOggetto(Oggetto o);
	public boolean deleteOggetto(int idOggetto);
	
	//METODI
	public ArrayList<Oggetto> getAllMyOggetti(String username);
	public ArrayList<Oggetto> searchOggetti(String username);
	public boolean prenotaOggetto(String username,int idOggetto);
	public boolean deletePrenotazione(int idOggetto);
	public boolean updateFoto(int idoggetto, String foto);
	public OggettoDto getOggetto(int idoggetto);
	public ArrayList<Oggetto> getAllPrenotation(String username);
	public ArrayList<Oggetto> ricercaOgg (String nome);

}
