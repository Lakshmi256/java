package com.BridgeLabz.DataStructures;
//purpose:to store the calender of a month in a 2D array. 


import com.BridgeLabz.utility.Util;
public class CalenderJava {
	//this checks the day of the week.
	 public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	 //to check the year is leap year r not.
	 public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month=Util.readInt();
int year=Util.readInt();
String[] months = {
        "",                             
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };
int[] days = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
if (month == 2 && isLeapYear(year)) days[month] = 29;
System.out.println("	"+months[month]+" "+year);
System.out.print("	S	M	Tu	W	Th	F	S");
System.out.println();
int d = day(month, 1, year);
for (int i = 0; i < d; i++)
	System.out.print("	");
for (int i = 1; i <= days[month]; i++) {
    System.out.print("	"+ i);
    if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
	}
	}
}
