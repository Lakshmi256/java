package com.BridgeLabz.Implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.BridgeLabz.Model.AddressBookModel;
import com.BridgeLabz.Service.AddressBookService;
import com.BridgeLabz.Utillity.Util;

public class AddressBookImplementation implements AddressBookService{
	JSONArray array=new JSONArray();
	String fileName;
	private static AddressBookModel obj;
	public static AddressBookModel setObj()
	{
		obj=new AddressBookModel();
		return obj;	
	}
	public void addRecord()throws IOException, Exception{
		AddressBookModel ob=setObj();
		System.out.println("Enter the First Name :");
		String first_name=Util.readString();
		boolean b=false;
		try 
		{
			b=checkRecord(first_name);
		} 
		catch (IOException | ParseException | NullPointerException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b==true)
			System.out.println("Record already exists!");
		else
		{
		ob.setFname(first_name);
		System.out.println("Enter the Last Name :");
		String last_name=Util.readString();
		ob.setLname(last_name);
		System.out.println("Enter the Address");
		String addr=Util.readString();
		ob.setAddress(addr);
		System.out.println("Enter the City :");
		String city_name=Util.readString();
		ob.setCity(city_name);
		System.out.println("Enter the State :");
		String state_name=Util.readString();
		ob.setState(state_name);
		System.out.println("Enter the Pin");
		int zip_code=Util.readInt();
		ob.setZip(zip_code);
		System.out.println("Enter the Phone Number:");
		long phno=Util.readlong();
		ob.setPhoneno(phno);
		
		JSONObject object=new JSONObject();
        object.put("firstname",first_name);
        object.put("lastname",last_name);
        object.put("address",addr);
        object.put("city",city_name);
        object.put("state",state_name);
        object.put("zip",zip_code);
        object.put("Phone Number",phno);
        array.put(object);
        PrintWriter pw=new PrintWriter("AddressBook.json");
        pw.write(array.toString());
        pw.flush();
        pw.close();

		}
	}
    
    public void deleteRecord(String fname) throws IOException,ParseException,JSONException {
		// TODO Auto-generated method stub
    	
    	FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    if(fname.equals(ob.getString("firstname")))
			array.remove(i);
		}
		 PrintWriter pw=new PrintWriter("AddressBook.json");
	        pw.write(array.toString());
	        pw.flush();
	        pw.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}
		
	}

	public void updateRecord(String fname) throws JSONException, IOException, ParseException
	{
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		boolean b=false;
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    if(fname.equals(ob.getString("firstname")))
		    {
		    	b=true;
				System.out.println("Enter the Last Name :");
				String last_name=Util.readString();
				ob.put("lastname",last_name);
				System.out.println("Enter the Address");
				String addr=Util.readString();
				ob.put("address", addr);
				System.out.println("Enter the City :");
				String city_name=Util.readString();
				ob.put("city", city_name);
				System.out.println("Enter the State :");
				String state_name=Util.readString();
				ob.put("state",state_name);
				System.out.println("Enter the Pin");
				int zip_code=Util.readInt();
				ob.put("zip",zip_code);
				System.out.println("Enter the Phone Number:");
				long phno=Util.readlong();
				ob.put("Phone Number",phno);
		        PrintWriter pw=new PrintWriter("AddressBook.json");
		        pw.write(array.toString());
		        pw.flush();
		        pw.close();	
		    }
		    if(b==true)
		    	break;
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}
	}
	public void printRecord() throws JSONException, IOException, ParseException 
	{	
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
	        System.out.println(ob);
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}
		
		
	}

	public boolean checkRecord(String first_name) throws Exception  {
		boolean flag=false;
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		if(first_name.equals(ob.getString("firstname")))
			flag=true;
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception is thrown");
			flag=false;
		}
		finally
		{
			fr.close();
		}
		return flag;	
	}
	public boolean match(String fname)
	{
		boolean b=false;
	try
	{
		b=checkRecord(fname);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	
		return b;
	}

}
