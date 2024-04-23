package home.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class HouseDAO {
	private final DataSource dataSource;

	private Connection connection;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet rs;

	public HouseDAO(DataSource dataSource) {
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

	public List<House> getHouseList() {

		List<House> houseList = new ArrayList<>();
		try {
			connection = dataSource.getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from home;");

			while (rs.next()) {
				houseList.add(new House(rs.getInt("id"), rs.getString("address"), rs.getDouble("rentPrice"),
						rs.getInt("bedRoom"), rs.getInt("kitchen"), rs.getInt("bathRoom"), rs.getBoolean("vaccancy")));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return houseList;

	}

	public House getHouse(int id) {

		House house = null;
		try {
			connection = dataSource.getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from home " + "where id='" + id + "';");

			while (rs.next()) {
				house = new House(rs.getInt("id"), rs.getString("address"), rs.getDouble("rentPrice"),
						rs.getInt("bedRoom"), rs.getInt("kitchen"), rs.getInt("bathRoom"), rs.getBoolean("vaccancy"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return house;

	}

	public int createHouse(final House house) {
		int rowEffected = 0;

		try {
			connection = dataSource.getConnection();

			pStmt = connection.prepareStatement(
					"INSERT INTO `home` " + "(`address`, `rentPrice`, `bedRoom`, `kitchen`, `bathRoom`, `vaccancy`) "
							+ "VALUES (?, ?, ?, ?, ?, ?);" + "");
			pStmt.setString(1, house.getAddress());
			pStmt.setDouble(2, house.getRentPrice());
			pStmt.setInt(3, house.getBedRoom());
			pStmt.setInt(4, house.getKitchen());
			pStmt.setInt(5, house.getBathRoom());
			pStmt.setBoolean(6, house.isVaccancy());

			rowEffected = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return rowEffected;
	}

	public int updateHouse(final House house) {
		int rowEffected = 0;
		try {
			connection = dataSource.getConnection();
			pStmt = connection.prepareStatement("UPDATE `home` SET " + "`address` = ?," + " `rentPrice` = ?, "
					+ "`bedRoom` = ?, " + "`kitchen` = ?," + " `bathRoom` = ?, " + "`vaccancy` = ? WHERE (`id` = ?);"

			);

			pStmt.setString(1, house.getAddress());
			pStmt.setDouble(2, house.getRentPrice());
			pStmt.setInt(3, house.getBedRoom());
			pStmt.setInt(4, house.getKitchen());
			pStmt.setInt(5, house.getBathRoom());
			pStmt.setBoolean(6, house.isVaccancy());
			pStmt.setInt(7, house.getId());
			rowEffected = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowEffected;

	}

	public int deleteHouse(int id) {
		int rowEffected = 0;
		try {
			connection = dataSource.getConnection();
			pStmt = connection.prepareStatement("delete from home where id = ?;");
			pStmt.setInt(1, id);
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
