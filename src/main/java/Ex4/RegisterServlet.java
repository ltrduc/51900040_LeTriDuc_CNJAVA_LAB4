package Ex4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Ex4/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String birthday = request.getParameter("birthday");
		String birthtime = request.getParameter("birthtime");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String[] favorite_ide = request.getParameterValues("favorite_ide[]");
		String toeic = request.getParameter("toeic");
		String message = request.getParameter("message");

		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("birthday", birthday);
		request.setAttribute("birthtime", birthtime);
		request.setAttribute("gender", gender);
		request.setAttribute("country", country);
		request.setAttribute("favorite_ide", favorite_ide);
		request.setAttribute("toeic", toeic);
		request.setAttribute("message", message);

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");

		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}

}
