package javaLabStrams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;


public class Countries_Implement implements DAO<Countries> {
	private String dataFilePath;
	private BufferedReader br;
	
	private void loadDataSetFile(String filePath) {
		 
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor 
			BufferedReader br = new BufferedReader(new FileReader(filePath)); //br is a cvs file
			this.br=br;
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();
 		}  
	}
	
	
	ArrayList <Countries> country=new ArrayList<Countries>();
	@Override
	public ArrayList <Countries> getAll(String dataFilePath) throws IOException {
			this.dataFilePath=dataFilePath;
			//Read CSV Read
			String line = "";  
			String splitBy = ",";
			loadDataSetFile(this.dataFilePath);
				int counter=0;
				BufferedReader CSVBR=this.br;
				while ((line =CSVBR.readLine()) != null)   //returns a Boolean value  
				{ 
					//Skip Header 1st iterator
					if (counter==0) {
						counter++;
						continue;
					}
					String[] countryArray = line.split(splitBy);
					Countries ctry=new Countries(countryArray[0],countryArray[1]);
					country.add(ctry);
					counter++;
				}
			
			return country;
			
		
		
	}	
	}
	
