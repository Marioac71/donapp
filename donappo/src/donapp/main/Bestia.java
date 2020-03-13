package donapp.main;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;

public class Bestia {

	public static void main(String[] args) {
		
		OggettoDaoImpl a= new OggettoDaoImpl();
		
		System.out.println(a.getOggetto(2));
//A
	}

}
