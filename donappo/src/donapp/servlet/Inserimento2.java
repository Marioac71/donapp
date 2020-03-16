package donapp.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.util.Streams;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/Inserimento2")
public class Inserimento2 extends HttpServlet {

	private String filePath="";
	private int maxFileSize = 200 * 1024;
	private int maxMemSize = 4 * 1024;
	private File file ;
	 

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Inserimento2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Check that we have a file upload request
	HttpSession session= request.getSession();
		
		String foto=null;
		String nome=null;
		String colore=null;
		String descrizione=null;
		String luogoritiro=null;
		String disponibilita=null;
		String idproprietario= (String) session.getAttribute("username");
		String idprenotante=null;
		String estensione=null;
		String idcategoria=null;
		String fileName=null;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter( );

		DiskFileItemFactory factory = new DiskFileItemFactory();


		// maximum size that will be stored in memory
		factory.setSizeThreshold(maxMemSize);

		// Location to save data that is larger than maxMemSize.
		factory.setRepository(new File("c:\\temp"));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);


		// maximum file size to be uploaded.
		upload.setSizeMax( maxFileSize );

		try { 

			// Parse the request to get file items.
			FileItemIterator i = upload.getItemIterator(request);

			while ( i.hasNext () ) {
				FileItemStream fi = i.next();
				if ( !fi.isFormField () ) {
					// Get the uploaded file parameters
					String fieldName = fi.getFieldName();
					fileName = fi.getName();
					estensione= fileName.substring( fileName.lastIndexOf(".")) ;
					fileName=String.valueOf(timestamp.getTime());
					
					String contentType = fi.getContentType();

					// Write the file
					if( fileName.lastIndexOf("\\") >= 0 ) {
						file = new File( filePath + fileName.substring( fileName.lastIndexOf("\\"))) ;
					} else {
						file = new File( filePath + fileName.substring(fileName.lastIndexOf("\\")+1)) ;
					}
					try (InputStream input = fi.openStream()) {
						Files.copy(input, file.toPath());
					}
					out.println("Uploaded Filename: " + fileName + "<br>");

				}
				else {
					// Normal field
					String name = fi.getFieldName(); //nome del campo, sarebbe quello che mettete nell'attributo name del tag input
					String value = Streams.asString(fi.openStream()); // valore associato al nome
					out.println(value + "<br>");
					switch (name) {

					case "nome":
						nome=value;
						break;
					case "colore":
						colore=value;
						break;
					case "descrizione":
						descrizione=value;
						break;
					case "luogoritiro":
						luogoritiro=value;
						break;
					case "disponibilita":
						disponibilita=value;
						break;
					case "idcategoria":
						idcategoria=value;
					}

				}
			}
				int intero = Integer.parseInt(idcategoria);
				
				foto="assets/img/"+fileName+estensione;
				OggettoDaoImpl a= new OggettoDaoImpl (); 
				
				Oggetto x = new Oggetto(null,foto, nome, colore, descrizione, luogoritiro, disponibilita, idproprietario, idprenotante, intero);
				
				
				Integer chiave;
				chiave= a.insertOggetto(x);

		} catch(Exception ex) {
			ex.printStackTrace();
		
		}
	}

}
