package com.ouhamza.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Create object Mapper.
			ObjectMapper mapper= new ObjectMapper();
			// read JSON file and convert it to java POJO.
			
		    //Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println("The student firstName: "+ student.getFirstName());
			System.out.println("The student lastName: "+ student.getLastName());
			System.out.println("The student country: "+ student.getAddress().getCountry());
			
			for(String lang: student.getLanguages()) {
				
				System.out.println("The student Languages: "+ lang );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
