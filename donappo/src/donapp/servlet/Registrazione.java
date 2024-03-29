package donapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;

import donapp.dao.impl.UtenteDaoImpl;
import donapp.model.Utente;

/**
 * Servlet implementation class Registrazione
 */
@WebServlet("/Registrazione")
public class Registrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrazione() {
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
		doGet(request, response);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		UtenteDaoImpl u = new UtenteDaoImpl();
		Utente utente = new Utente(username, password, nome, cognome, email);
		boolean flag = false;
		flag = u.insertUtente(utente);
		HttpSession session= request.getSession();
		session.setAttribute("typemessage", "success");
		session.setAttribute("message", "Registrazione avvenuta con successo, effettua il login");
		response.sendRedirect("loginT.jsp");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("loginT.jsp");
//		dispatcher.forward(request, response);

		
	}

}
