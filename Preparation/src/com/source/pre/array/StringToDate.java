package com.source.pre.array;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String dateInString = "12/09/2016";
		DateFormat dtFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date dt = dtFormat.parse(dateInString);
        System.out.println(dt);
        
	}

}
