package donapp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import donapp.dao.impl.OggettoDaoImpl;
import donapp.model.Oggetto;

/**
 * Servlet implementation class barraRicerca
 */
@WebServlet("/barraRicerca")
public class barraRicerca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public barraRicerca() {
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
OggettoDaoImpl o= new OggettoDaoImpl();
		
		HttpSession session= request.getSession();
		String nome=request.getParameter("campo");
		System.out.println(nome);
		ArrayList<Oggetto> a= new ArrayList<Oggetto>();
		a= o.ricercaOgg(nome);
		
		for(Oggetto ob: a ) {
			System.out.println(ob.getNome()); 
			
		}
		
		request.setAttribute("listaogg", a);
		RequestDispatcher dispatcher = request.getRequestDispatcher("categoryT.jsp");
		dispatcher.forward(request, response);
	}

}
