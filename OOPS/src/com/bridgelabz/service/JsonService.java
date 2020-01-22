package com.bridgelabz.service;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface JsonService {
	public void createFile(String file) throws IOException;

	public void printItems(File f) throws IOException, ParseException, JSONException;

	public void addItems(File f) throws IOException, Exception;

	public void grandTotal(String s) throws JSONException, IOException, ParseException, ClassCastException;

}
