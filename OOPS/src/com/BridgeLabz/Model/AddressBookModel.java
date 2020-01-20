package com.BridgeLabz.Model;

import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.BridgeLabz.Service.AddressBookService;

public class AddressBookModel implements AddressBookService {
	private String fname;
	private String lname;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneno;

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public void addRecord() throws IOException, Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteRecord(String fname) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateRecord(String fname) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printRecord() throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean checkRecord(String fname) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean match(String fname) {
		// TODO Auto-generated method stub
		return false;
	}

	}

