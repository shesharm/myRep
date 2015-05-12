package com.learning.general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class FileOperations {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedWriter wr=null;
		File file = new File("C:/Sample/myprog.txt");
		System.out.println(file.canRead());
		
// ways of reading file
		//1. FileReader 
		//2. FileInputStream -- InputStreamReader
		
		
		
		//REading a file
/*		BufferedReader br = new BufferedReader(new FileReader("C:\\Sample\\myprog.txt"));
		String strLine  ="";
		while((strLine = br.readLine())!=null){
		//	System.out.println(br.readLine());
			System.out.println(strLine);*/
	
		
		
		//Writing a file
/*		try{
			if(!file.exists()){
				file.createNewFile();

			}

			Writer writer = new FileWriter(file,true);
		 wr = new BufferedWriter(writer);
		wr.write("This line is written by pragramming");
		System.out.println("done");

				
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			  try{
	                if(wr != null)
	                wr.close();
	            } catch(Exception ex){
	                 
	            }
	
		}*/
		
		
		//another way 
		FileInputStream myfile = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(myfile));
		while(br.ready()){
			System.out.println(br.readLine());
		}
		br.close();
			
			
		}

	}


