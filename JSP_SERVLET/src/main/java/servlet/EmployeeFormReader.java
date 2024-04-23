package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EmployeeFormReader
 */
public class EmployeeFormReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeFormReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out =	response.getWriter();
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String country = request.getParameter("country");
	String gender = request.getParameter("gender");
	String[] language = request.getParameterValues("language");
	String description = request.getParameter("description");
	
	out.println("FirstName = "+ fname + "\n");
	out.println("LastName = "+ lname + "\n");
	out.println("Email = "+ email + "\n");
	out.println("Password = "+ password + "\n");
	out.println("Country = "+ country + "\n");
	out.println("Gender = "+ gender + "\n");


	
	for(String temp: language) {
		out.println("Language = "+ temp + "\n");
	}
	
	out.println("Description = "+ description + "\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
