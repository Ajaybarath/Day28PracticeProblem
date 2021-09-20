package com.bridgeLabz.openCsvReader;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;

public class OpenCsvReader {

	private static final String SAMPLE_CSV_FILE_PATH = "user.csv";

	public static void main(String args[]) {

		try {
			Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
			CSVReader csvReader = new CSVReader(reader);

			String[] nextRecord;

			while ((nextRecord = csvReader.readNext()) != null) {

				System.out.println("Name : " + nextRecord[0]);
				System.out.println("Email : " + nextRecord[1]);
				System.out.println("Phone : " + nextRecord[2]);

			}
			
			
			List<String[]> records = csvReader.readAll();
			
			for (String[] record: records) {
				System.out.println("Name : " + nextRecord[0]);
				System.out.println("Email : " + nextRecord[1]);
				System.out.println("Phone : " + nextRecord[2]);

			}
			
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
