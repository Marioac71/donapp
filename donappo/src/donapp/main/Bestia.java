package donapp.main;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;

public class Bestia {

	public static void main(String[] args) {
		
		OggettoDaoImpl a= new OggettoDaoImpl();
		
		Oggetto x = new Oggetto(null,"","saassas","sddsadsds","eeqqee","jjnjn","2020-11-11","Marioac71",null,1);
		a.insertOggetto(x);
//A
	}

}
