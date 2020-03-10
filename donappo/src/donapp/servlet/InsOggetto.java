package donapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;

/**
 * Servlet implementation class InsOggetto
 */
@WebServlet("/InsOggetto")
public class InsOggetto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsOggetto() {
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
	// aaas
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		doGet(request, response);
		boolean d;
		d=(boolean)session.getAttribute("loggato");
		
		if (d) {
			
		String foto= request.getParameter("foto");
		String nome= request.getParameter("nome");
		String colore= request.getParameter("colore");
		String descrizione= request.getParameter("descrizione");
		String luogoritiro= request.getParameter("luogoritiro");
		String disponibilità= request.getParameter("disponibilità");
		String idproprietario= (String) session.getAttribute("username");
		String idprenotante=null;
		String idcategoria= request.getParameter("idcategoria");
		
		Integer u;
		
		u=Integer.parseInt(idcategoria);
		
		OggettoDaoImpl a= new OggettoDaoImpl (); 
		
		Oggetto x = new Oggetto(null,foto, nome, colore, descrizione, luogoritiro, disponibilità, idproprietario, idprenotante, u);
		
		a.insertOggetto(x);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("profilo.jsp");
		
		}
	}

}
