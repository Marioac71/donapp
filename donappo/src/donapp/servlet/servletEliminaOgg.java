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

/**
 * Servlet implementation class servletEliminaOgg
 */
@WebServlet("/servletEliminaOgg")
public class servletEliminaOgg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletEliminaOgg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
	HttpSession session= request.getSession();
		String idogg = request.getParameter("idoggetto");
		OggettoDaoImpl o = new OggettoDaoImpl();
		int ido = Integer.parseInt(idogg);
		o.deleteOggetto(ido);
		
		session.setAttribute("typemessage", "warning");
		session.setAttribute("message", "Eliminazione articolo eseguita correttamente");
		
		response.sendRedirect("GetAllMyOggetti");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
