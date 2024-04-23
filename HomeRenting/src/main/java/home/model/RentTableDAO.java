package home.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class RentTableDAO {
	private final DataSource dataSource;

	private Connection connection;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet rs;

	public RentTableDAO(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	private void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public List<RentTable> getRentTable(String username) {

		List<RentTable> rentList = new ArrayList<>();
		try {
			connection = dataSource.getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from `rent` " + "where `username`='" + username + "';");

			while (rs.next()) {
				rentList.add(new RentTable(rs.getInt("id"), rs.getString("username"), rs.getString("address"),
						rs.getDouble("rentPrice"), rs.getInt("bedRoom"), rs.getInt("kitchen"), rs.getInt("bathRoom")));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return rentList;

	}

	public List<RentTable> getRentTableList() {

		List<RentTable> rentList = new ArrayList<>();
		try {
			connection = dataSource.getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from `rent`;");

			while (rs.next()) {
				rentList.add(new RentTable(rs.getInt("id"), rs.getString("username"), rs.getString("address"),
						rs.getDouble("rentPrice"), rs.getInt("bedRoom"), rs.getInt("kitchen"), rs.getInt("bathRoom")));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return rentList;

	}

	public int createRent(final RentTable rentTable) {
		int rowEffected = 0;

		try {
			connection = dataSource.getConnection();

			pStmt = connection.prepareStatement(
					"INSERT INTO `rent` " + "(`username`,`address`, `rentPrice`, `bedRoom`, `kitchen`, `bathRoom`)"
							+ " VALUES (?,?, ?, ?, ?, ?);");
			pStmt.setString(1, rentTable.getUsername());
			pStmt.setString(2, rentTable.getAddress());
			pStmt.setDouble(3, rentTable.getRentPrice());
			pStmt.setInt(4, rentTable.getBedRoom());
			pStmt.setInt(5, rentTable.getKitchen());
			pStmt.setInt(6, rentTable.getBathRoom());

			rowEffected = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return rowEffected;

	}

}
