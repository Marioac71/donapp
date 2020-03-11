package donapp.servlet;

import java.io.IOException;     
import donapp.model.*; 
import java.io.PrintWriter;


import donapp.dao.UtenteDao;
import donapp.dao.impl.UtenteDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
 
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
	//aa
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
//		PrintWriter out = response.getWriter();
		System.out.println("ok 1");
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		System.out.println("ok 2");
		UtenteDaoImpl a = new UtenteDaoImpl();
		boolean d=false;
		
		d = a.loginUtente(username, password);
		System.out.println(d);
		HttpSession session= request.getSession();
		if(d==true) {
			
			Utente x = new Utente ();
			x = a.getUtente(username);
			
			session.setAttribute("loggato", true);
			session.setAttribute("username",username);
			session.setAttribute("password", password);
			session.setAttribute("utente", x);
			session.setMaxInactiveInterval(120);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("profilo.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
//			 out.println("<script type=\"text/javascript\">");
//			   out.println("alert('User or password incorrect');");
//			   out.println("location='index.jsp';");
//			   out.println("</script>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			
		}
		
	}

}
