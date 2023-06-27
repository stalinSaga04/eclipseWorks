package org.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
//		File file = new File("/home/stalin/Downloads/saga/stalin/acd");
		File file = new File("/home/stalin/Downloads/txt4.txt");
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
//		long lastModified = file.lastModified();
//		System.out.println(lastModified);
//		Date dd  = new Date(lastModified);
//		int date = dd.getDay( );
//		System.out.println(date);
//		boolean directory = file.isDirectory();
//		boolean file2 = file.isFile();
//		System.out.println(directory);
//		System.out.println(file2);
//		System.out.println(file.getName());
//		System.out.println(file.mkdirs());
//		System.out.println(file.isDirectory());
		FileWriter pen = new FileWriter(file, true);
		pen.write("Mugilan");
		pen.write("\nsaabri");
		pen.write("\nthiyagu");
		pen.write("\nashwini");
		pen.write("\ndais");
		pen.write("\npraabkar");
		pen.write(" MUTHU sir");
		pen.flush();
//		pen.close();
		BufferedWriter bufwritter = new BufferedWriter(pen);
		bufwritter.write("ajay");
		bufwritter.newLine();
		bufwritter.write("jay");
		bufwritter.newLine();
		bufwritter.write("ayaj");
		bufwritter.newLine();
		bufwritter.flush();
		bufwritter.close();
		FileReader filerdr = new FileReader(file);
		BufferedReader br = new BufferedReader(filerdr);
		
//		String i = br.readLine();
		int i= br.read();
		while (i!=-1) {
			char c = (char)i;
			System.out.println(c);
		}
		
		
		
	}

}
