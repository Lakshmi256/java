package com.bridgelabz.implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.AddressBookModel;
import com.bridgelabz.service.AddressBookService;
import com.bridgelabz.utillity.Util;

public class AddressBookImplementation implements AddressBookService {
	JSONArray array = new JSONArray();
	String fileName;
	private static AddressBookModel obj;

	public static AddressBookModel setObj() {
		obj = new AddressBookModel();
		return obj;
	}

	public void addRecord() throws IOException, Exception {
		AddressBookModel ob = setObj();
		System.out.println("Enter the First Name :");
		String firstName = Util.readString();
		boolean b = false;
		try {
			b = checkRecord(firstName);
		} catch (IOException | ParseException | NullPointerException e) {

			e.printStackTrace();
		}
		if (b == true)
			System.out.println("Record already exists!");
		else {
			ob.setFname(firstName);
			System.out.println("Enter the Last Name :");
			String lastName = Util.readString();
			ob.setLname(lastName);
			System.out.println("Enter the Address");
			String addr = Util.readString();
			ob.setAddress(addr);
			System.out.println("Enter the City :");
			String cityName = Util.readString();
			ob.setCity(cityName);
			System.out.println("Enter the State :");
			String stateName = Util.readString();
			ob.setState(stateName);
			System.out.println("Enter the Pin");
			int zipCode = Util.readInt();
			ob.setZip(zipCode);
			System.out.println("Enter the Phone Number:");
			long phno = Util.readlong();
			ob.setPhoneno(phno);

			JSONObject object = new JSONObject();
			object.put("firstname", firstName);
			object.put("lastname", lastName);
			object.put("address", addr);
			object.put("city", cityName);
			object.put("state", stateName);
			object.put("zip", zipCode);
			object.put("Phone Number", phno);
			array.put(object);
			PrintWriter pw = new PrintWriter("AddressBook.json");
			pw.write(array.toString());
			pw.flush();
			pw.close();

		}
	}

	public void deleteRecord(String fname) throws IOException, ParseException, JSONException {

		FileReader fr = null;
		try {
			fr = new FileReader("AddressBook.json");
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());

			for (int i = 0; i < array.length(); i++) {
				JSONObject ob = array.getJSONObject(i);
				if (fname.equals(ob.getString("firstname")))
					array.remove(i);
			}
			PrintWriter pw = new PrintWriter("AddressBook.json");
			pw.write(array.toString());
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}

	}

	public void updateRecord(String fname) throws JSONException, IOException, ParseException {
		FileReader fr = null;
		try {
			fr = new FileReader("AddressBook.json");
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());
			boolean b = false;
			for (int i = 0; i < array.length(); i++) {
				JSONObject ob = array.getJSONObject(i);
				if (fname.equals(ob.getString("firstname"))) {
					b = true;
					System.out.println("Enter the Last Name :");
					String lastName = Util.readString();
					ob.put("lastname", lastName);
					System.out.println("Enter the Address");
					String addr = Util.readString();
					ob.put("address", addr);
					System.out.println("Enter the City :");
					String cityName = Util.readString();
					ob.put("city", cityName);
					System.out.println("Enter the State :");
					String stateName = Util.readString();
					ob.put("state", stateName);
					System.out.println("Enter the Pin");
					int zipCode = Util.readInt();
					ob.put("zip", zipCode);
					System.out.println("Enter the Phone Number:");
					long phno = Util.readlong();
					ob.put("Phone Number", phno);
					PrintWriter pw = new PrintWriter("AddressBook.json");
					pw.write(array.toString());
					pw.flush();
					pw.close();
				}
				if (b == true)
					break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
	}

	public void printRecord() throws JSONException, IOException, ParseException {
		FileReader fr = null;
		try {
			fr = new FileReader("AddressBook.json");
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());

			for (int i = 0; i < array.length(); i++) {
				JSONObject ob = array.getJSONObject(i);
				System.out.println(ob);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}

	}

	public boolean checkRecord(String firstName) throws Exception {
		boolean flag = false;
		FileReader fr = null;
		try {
			fr = new FileReader("AddressBook.json");
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());

			for (int i = 0; i < array.length(); i++) {
				JSONObject ob = array.getJSONObject(i);
				if (firstName.equals(ob.getString("firstname")))
					flag = true;
			}
		} catch (Exception e) {
			System.out.println("Exception is thrown");
			flag = false;
		} finally {
			fr.close();
		}
		return flag;
	}

	public boolean match(String fname) {
		boolean b = false;
		try {
			b = checkRecord(fname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

}
