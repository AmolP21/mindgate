package com.mindgate.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int addressid;
	String houseNumber;
	String BuildingName;
	String street;
	String city;
	String pin;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int addressid, String houseNumber, String buildingName, String street, String city, String pin) {
		super();
		this.addressid = addressid;
		this.houseNumber = houseNumber;
		BuildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getBuildingName() {
		return BuildingName;
	}
	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", houseNumber=" + houseNumber + ", BuildingName=" + BuildingName
				+ ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
}
