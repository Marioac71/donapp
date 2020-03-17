package donapp.main;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;

public class Bestia {

	public static void main(String[] args) {
		
		OggettoDaoImpl a= new OggettoDaoImpl();
		

//A

		
		System.out.println(a.ricercaOgg("a"));
		
	}

}
