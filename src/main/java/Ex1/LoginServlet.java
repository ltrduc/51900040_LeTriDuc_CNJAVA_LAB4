package Ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Ex1/login" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	HashMap<String, String> accounts;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Start");
		accounts = new HashMap<String, String>();
		accounts.put("admin1", "123456");
		accounts.put("admin2", "123456");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("login.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); 
		PrintWriter printWriter = resp.getWriter();

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
			printWriter.println("Username/Password match");
			return;
		}
		printWriter.println("Username/Password does not match");
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
}
