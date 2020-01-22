package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.implementation.ClinicalImplementation;
import com.bridgelabz.service.ClinicalService;
import com.bridgelabz.utillity.Util;

public class CliniqueManagementController {

	public static void main(String[] args) throws IOException, JSONException, ParseException {
		String a = null;
		ClinicalService obj = new ClinicalImplementation();
		File f1 = new File("doctors.json");
		File f2 = new File("patients.json");
		do {
			int ch;
			System.out.println("********Menu**********");
			System.out.println("1. Add Doctor Details");
			System.out.println("2. Add Patient Details");
			System.out.println("3. Search Doctor");
			System.out.println("4. Search Patient");
			System.out.println("5. Book Appointment");
			System.out.print("Enter your choice : ");
			ch = Util.readInt();
			switch (ch) {
			case 1:
				obj.addDoctors(f1);
				System.out.println("The Doctor Details have been added");
				break;
			case 2:
				obj.createFile("patients.json");
				obj.addPatients(f2);
				System.out.println("The Patient Details have been added");
				break;
			case 3:
				System.out.println("Enter the name/id/specialization/availability");
				String s1 = Util.readString();
				obj.searchDoctor(s1, f1);
				break;
			case 4:
				System.out.println("Enter the name/id/mobile no./age");
				String s2 = Util.readString();
				obj.searchPatient(s2, f2);
				break;
			case 5:
				System.out.print("Enter the patient name: ");
				String s3 = Util.readString();
				boolean b1 = obj.searchPatient(s3, f2);
				if (b1 == true) {
					System.out.println("Enter the doctor name for appointment");
					String s4 = Util.readString();
					boolean b2 = obj.searchDoctor(s4, f1);
					if (b2 == true) {
						boolean x = obj.bookAppointment(s3, s4, f1, f2);
						if (x == true)
							System.out.println("Appointment booked!!!");
						else
							System.out.println("Appointment not possible");
					} else
						System.out.println("There is no doctor named :" + s4);
				}
				break;
			default:
				System.out.println("Wrong Choice!!");
				System.out.println("Do you wish to continue(y/n)");
				a = Util.readString();
			}
		} while (a != "n");
	}

}
