package donapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;
import donapp.model.Utente;

/**
 * Servlet implementation class PrenotaOggetto
 */
@WebServlet("/PrenotaOggetto")
public class PrenotaOggetto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     /**
     * @see HttpServlet#HttpServlet()
     */
    public PrenotaOggetto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		OggettoDaoImpl o= new OggettoDaoImpl();
		HttpSession session = request.getSession();
		String username=(String)session.getAttribute("username");
		System.out.println(username);
		String idoggetto= request.getParameter("idogge");
		System.out.println(idoggetto);
		int idogg= Integer.parseInt(idoggetto);
		System.out.println(idogg);
		
		boolean flag = o.prenotaOggetto(username, idogg);
		System.out.println(flag);
		if (flag == true)
		{
			session.setAttribute("typemessage", "success");
			session.setAttribute("message", "Prenotazione avvenuta con successo");
			response.sendRedirect("GetAllPrenotation");
		}
		else
		{
			response.sendRedirect("indexT.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
