package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
private int addressis;
private String city;
private String road;
public Address() {
System.out.println("Dfefult constructor of address class");
}
public Address(int addressis, String city, String road) {
	super();
	this.addressis = addressis;
	this.city = city;
	this.road = road;
}
public int getAddressis() {
	return addressis;
}
public void setAddressis(int addressis) {
	this.addressis = addressis;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getRoad() {
	return road;
}
public void setRoad(String road) {
	this.road = road;
}
@Override
public String toString() {
	return "Address [addressis=" + addressis + ", city=" + city + ", road=" + road + "]";
}
}
