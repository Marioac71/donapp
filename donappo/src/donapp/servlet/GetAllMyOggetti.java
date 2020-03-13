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
 * Servlet implementation class GetAllMyOggetti
 */
@WebServlet("/GetAllMyOggetti")
public class GetAllMyOggetti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllMyOggetti() {
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

		HttpSession session= request.getSession();
		String username=(String)session.getAttribute("username");
		ArrayList<Oggetto> a= new ArrayList<Oggetto>();
		a= o.getAllMyOggetti(username);
		for(Oggetto ob: a ) {
			System.out.println(ob.getNome()); 

		}

		request.setAttribute("listaogg", a);
		RequestDispatcher dispatcher = request.getRequestDispatcher("carrelloT.jsp");
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
