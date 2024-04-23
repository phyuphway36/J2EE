package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ParameterReader
 */
public class ParameterReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParameterReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();
		 ServletConfig initParameter = getServletConfig();
		 ServletContext contextParameter = getServletContext();
		 String param1 = initParameter.getInitParameter("param1");
		 String param2 = initParameter.getInitParameter("param2");
		 String driver = contextParameter.getInitParameter("driver");
		 String maxFileSize = contextParameter.getInitParameter("max-file-size");
		 
		 out.println("Param1 : " + param1 + "\n");
		 out.println("Param2 : " + param2 + "\n");

		 out.println("driver : " + driver + "\n");
		 out.println("maxFileSize : "+maxFileSize +"\n");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
