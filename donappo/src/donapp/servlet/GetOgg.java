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
import donapp.model.OggettoDto;

/**
 * Servlet implementation class Oggetto
 */
@WebServlet("/GetOgg")
public class GetOgg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetOgg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session= request.getSession();

		String idoggetto= request.getParameter("idoggetto");
		int idogg= Integer.parseInt(idoggetto);
		
		OggettoDaoImpl o= new OggettoDaoImpl(); 
		
		OggettoDto x= new OggettoDto();
		
		x= o.getOggetto(idogg);
		
		request.setAttribute("oggetto", x);
		request.setAttribute("idoggetto", x.getIdOggetto());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("single-product.jsp");
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
