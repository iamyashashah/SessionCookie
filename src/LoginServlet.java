

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		HttpSession session = request.getSession();
		if (request.getParameter("select").equalsIgnoreCase("Login")){
			session.setAttribute("Login", true);
			request.getRequestDispatcher("/content.jsp").forward(request, response);
			session.setAttribute("Hi", "eni maa ne pan mari na mane");
		}else{
			session.setAttribute("Login", false);
			request.getRequestDispatcher("/content.jsp").forward(request, response);
			session.setAttribute("Hi", "Tari Maa ne pan mari na mane");
		}
		
		
	}

}
