package com.bridgeLabz.openCsvReader;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.sun.tools.jdeprscan.CSV;

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
			
			Writer writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH));
			StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();
			
			List<CSVUser> csvUsers = new ArrayList();
			csvUsers.add(new CSVUser("sdf", "sdf", "sd"));
			csvUsers.add(new CSVUser("wdfj", "sdf", "sd"));

			beanToCsv.write(csvUsers);
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
