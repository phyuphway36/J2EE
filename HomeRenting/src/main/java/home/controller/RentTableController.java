package home.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

import home.model.House;
import home.model.RentTable;
import home.model.RentTableDAO;
import home.model.User;

/**
 * Servlet implementation class RentTableController
 */
public class RentTableController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/homeRenting")
	private DataSource dataSource;

	private RentTableDAO rentTableDAO;

	@Override
	public void init() throws ServletException {
		rentTableDAO = new RentTableDAO(dataSource);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RentTableController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
		if (user != null) {

			String mode = request.getParameter("mode");

			if (mode == null) {
				mode = "LIST";

			}
			switch (mode) {
			case "SUBMIT":
				createRent(request, response);
				break;
			case "LIST":
				showAllRentList(request, response);
				break;
			default:
				showRentList(request, response);
				break;
			}
		}
	}

	private void createRent(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		double rentPrice = Double.parseDouble(request.getParameter("rentPrice"));
		int bedRoom = Integer.parseInt(request.getParameter("bedRoom"));
		int kitchen = Integer.parseInt(request.getParameter("kitchen"));
		int bathRoom = Integer.parseInt(request.getParameter("bathRoom"));

		RentTable house = new RentTable(username, address, rentPrice, bedRoom, kitchen, bathRoom);

		int rowEffected = this.rentTableDAO.createRent(house);

		if (rowEffected > 0)
			showRentList(request, response);
		else
			System.out.println("Fail");

	}

	private void showRentList(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		List<RentTable> rentList = this.rentTableDAO.getRentTable(user.getName());
		request.setAttribute("rentList", rentList);

		RequestDispatcher rd = request.getRequestDispatcher("rentlist.jsp");
		rd.forward(request, response);

	}

	private void showAllRentList(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		List<RentTable> allRentList = this.rentTableDAO.getRentTableList();
		request.setAttribute("allRentList", allRentList);

		RequestDispatcher rd = request.getRequestDispatcher("rentlist.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
