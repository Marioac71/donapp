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
 * Servlet implementation class GetAllPrenotation
 */
@WebServlet("/GetAllPrenotation")
public class GetAllPrenotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllPrenotation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		HttpSession session= request.getSession();
		String idprenotante=(String)session.getAttribute("username");
		System.out.println(idprenotante);
		OggettoDaoImpl o= new OggettoDaoImpl();
		ArrayList<Oggetto> a= new ArrayList<Oggetto>();
		a= o.getAllPrenotation(idprenotante);
		for(Oggetto ob: a ) {
			System.out.println(ob.getNome()); 

		}

		request.setAttribute("mypren", a);
		RequestDispatcher dispatcher = request.getRequestDispatcher("PrenotazioniT.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
