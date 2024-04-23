package home.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.sql.DataSource;

import home.model.House;
import home.model.HouseDAO;
import home.model.User;

/**
 * Servlet implementation class HouseController
 */
public class HouseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/homeRenting")
	private DataSource dataSource;

	private HouseDAO houseDAO;

	@Override
	public void init() throws ServletException {
		houseDAO = new HouseDAO(dataSource);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HouseController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
		if (user != null) {

			String mode = request.getParameter("mode");

			if (mode == null) {
				mode = "LIST";
			}

			switch (mode) {
			case "LIST":
				showHouseList(request, response);
				break;
			case "CREATE":
				createHouse(request, response);
				break;
			case "UPDATE":
				updateHouse(request, response);
				break;
			case "DELETE":
				deleteHouse(request, response);
				break;
			case "LOAD":
				loadHouseById(request, response);
				break;
			case "RENT":
				loadRentById(request, response);
				deleteHouse(request, response);
				break;
				
			
			case "LOGOUT":
				session.invalidate();
				response.sendRedirect("login");
				break;
			default:
				showHouseList(request, response);
				break;

			}
		} else {
			response.sendRedirect("login");
		}

	}

	

	private void showHouseList(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		List<House> houseList = this.houseDAO.getHouseList();
		request.setAttribute("houseList", houseList);
		if (user.getRole().contains("owner")) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("user-index.jsp");
			rd.forward(request, response);
		}

	}

	private void loadHouseById(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		int id = Integer.parseInt(request.getParameter("id"));
		House house = this.houseDAO.getHouse(id);
		request.setAttribute("house", house);
		RequestDispatcher rd = request.getRequestDispatcher("updateform.jsp");
		rd.forward(request, response);
	}

	private void loadRentById(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		int id = Integer.parseInt(request.getParameter("id"));
		House house = this.houseDAO.getHouse(id);
		request.setAttribute("house", house);
		RequestDispatcher rd = request.getRequestDispatcher("rentupdate.jsp");
		rd.forward(request, response);
	}

	private void createHouse(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		String address = request.getParameter("address");
		double rentPrice = Double.parseDouble(request.getParameter("rentPrice"));
		int bedRoom = Integer.parseInt(request.getParameter("bedRoom"));
		int kitchen = Integer.parseInt(request.getParameter("kitchen"));
		int bathRoom = Integer.parseInt(request.getParameter("bathRoom"));
		boolean vaccancy = Boolean.parseBoolean(request.getParameter("vaccancy"));

		House house = new House(address, rentPrice, bedRoom, kitchen, bathRoom, vaccancy);
		int rowEffected = this.houseDAO.createHouse(house);

		if (rowEffected > 0)
			showHouseList(request, response);
	}

	private void updateHouse(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		int id = Integer.parseInt(request.getParameter("id"));
		String address = request.getParameter("address");
		double rentPrice = Double.parseDouble(request.getParameter("rentPrice"));
		int bedRoom = Integer.parseInt(request.getParameter("bedRoom"));
		int kitchen = Integer.parseInt(request.getParameter("kitchen"));
		int bathRoom = Integer.parseInt(request.getParameter("bathRoom"));
		boolean vaccancy = Boolean.parseBoolean(request.getParameter("vaccancy"));

		House house = new House(id, address, rentPrice, bedRoom, kitchen, bathRoom, vaccancy);

		int rowEffected = this.houseDAO.updateHouse(house);
		if (rowEffected > 0)
			showHouseList(request, response);

	}

	private void deleteHouse(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		request.setAttribute("user", user);

		int id = Integer.parseInt(request.getParameter("id"));
		int rowEffected = this.houseDAO.deleteHouse(id);
		PrintWriter out = response.getWriter();
		if (rowEffected > 0)
			showHouseList(request, response);

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



