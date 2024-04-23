package home.model;

public class House {

	private int id;
	private String address;
	private double rentPrice;
	private int bedRoom;
	private int kitchen;
	private int bathRoom;
	private boolean vaccancy;

	public House() {

	}

	public House(String address, double rentPrice, int bedRoom, int kitchen, int bathRoom) {
		super();

		this.address = address;
		this.rentPrice = rentPrice;
		this.bedRoom = bedRoom;
		this.kitchen = kitchen;
		this.bathRoom = bathRoom;
	}

	public House(String address, double rentPrice, int bedRoom, int kitchen, int bathRoom, boolean vaccancy) {
		super();
		this.address = address;
		this.rentPrice = rentPrice;
		this.bedRoom = bedRoom;
		this.kitchen = kitchen;
		this.bathRoom = bathRoom;
		this.vaccancy = vaccancy;
	}

	public House(int id, String address, double rentPrice, int bedRoom, int kitchen, int bathRoom, boolean vaccancy) {
		super();
		this.id = id;
		this.address = address;
		this.rentPrice = rentPrice;
		this.bedRoom = bedRoom;
		this.kitchen = kitchen;
		this.bathRoom = bathRoom;
		this.vaccancy = vaccancy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isVaccancy() {
		return vaccancy;
	}

	public void setVaccancy(boolean vaccancy) {
		this.vaccancy = vaccancy;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", rentPrice=" + rentPrice + ", bedRoom=" + bedRoom
				+ ", kitchen=" + kitchen + ", bathRoom=" + bathRoom + ", vaccancy=" + vaccancy + "]";
	}

}
