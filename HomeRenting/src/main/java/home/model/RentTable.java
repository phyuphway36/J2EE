package home.model;

public class RentTable {

	private int id;
	private String username;
	private String address;
	private double rentPrice;
	private int bedRoom;
	private int kitchen;
	private int bathRoom;

	public RentTable() {

	}

	public RentTable(String username, String address, double rentPrice, int bedRoom, int kitchen, int bathRoom) {
		super();
		this.username = username;
		this.address = address;
		this.rentPrice = rentPrice;
		this.bedRoom = bedRoom;
		this.kitchen = kitchen;
		this.bathRoom = bathRoom;
	}

	public RentTable(int id, String username, String address, double rentPrice, int bedRoom, int kitchen,
			int bathRoom) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
		this.rentPrice = rentPrice;
		this.bedRoom = bedRoom;
		this.kitchen = kitchen;
		this.bathRoom = bathRoom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public int getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(int bedRoom) {
		this.bedRoom = bedRoom;
	}

	public int getKitchen() {
		return kitchen;
	}

	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}

	public int getBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(int bathRoom) {
		this.bathRoom = bathRoom;
	}

	@Override
	public String toString() {
		return "RentTable [id=" + id + ", address=" + address + ", rentPrice=" + rentPrice + ", bedRoom=" + bedRoom
				+ ", kitchen=" + kitchen + ", bathRoom=" + bathRoom + "]";
	}

}
