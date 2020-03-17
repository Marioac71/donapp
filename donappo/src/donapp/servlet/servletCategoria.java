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

import donapp.dao.impl.CategoriaDaoImpl;
import donapp.model.Oggetto;

/**
 * Servlet implementation class servletCategoria
 */
@WebServlet("/servletCategoria")
public class servletCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		HttpSession session= request.getSession();
		String username=(String)session.getAttribute("username");
		String categoria=request.getParameter("categoria");
		
		CategoriaDaoImpl c= new CategoriaDaoImpl();
		
		int a= Integer.parseInt(categoria);
		
		ArrayList <Oggetto> x= new ArrayList();
		x=c.getAllOggettiCat(username,a);
		
		request.setAttribute("listaogg", x);
		RequestDispatcher dispatcher = request.getRequestDispatcher("categoryT.jsp");
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
