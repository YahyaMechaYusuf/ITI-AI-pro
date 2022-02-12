package javaLabStrams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Main {

	public static void main(String[] args) throws IOException {
				Cities_Implement cityObject = new Cities_Implement();
				Countries_Implement coutryObject = new Countries_Implement();
			
				ArrayList <Countries> LsOfCountry=new ArrayList<Countries>();
				ArrayList <Cities> LsOfCity=new ArrayList<Cities>();
				
				LsOfCountry=coutryObject.getAll("Countries.csv");
				LsOfCity=cityObject.getAll("Cities.csv");
				//show data of City Table 
				System.out.println("Cities Data ");
				for(Cities ci : LsOfCity)
				{
					System.out.println(ci);
				}
				
				//show data of Country Table 
				System.out.println("Country Data ");
				for(Countries ct : LsOfCountry)
				{
					System.out.println(ct);
				}
				
				
				Map<String, List<Cities>> map = new HashMap<String,List<Cities>>();

				for(Countries country:LsOfCountry) { //hold country and country (loops)
				List<Cities> values = new LinkedList<Cities>();//create list of cities
					for(Cities city:LsOfCity) { //loop in cities to extract the cities which has the same code
						if(city.getCode().equals(country.getCode())) { //ex Eg has cairo and Alex
							values.add(city); //add the cities here for one country in the loop
					} 
							
							}
					map.put(country.getCode(), values); //finally adda cuntry code as key and list of cities as value
					}
				/*
				Scanner input =new Scanner(System.in);
				System.out.println("Please enter code: ");
				String x= input.nextLine();
				
			
				
				List<Cities> temp = map.get(x);
				
				
				Collections.sort(temp,
						new Comparator<Cities>() {
						@Override
						public int compare(Cities p1, Cities p2) {
						
						return (p1.getPopulation())  - p2.getPopulation();
						}

					});*/
				System.out.println("Max population \n");
				map.forEach((k,v)->System.out.println(v.stream().max(new Comparator<Cities>()
						{	
						public int compare(Cities c1 ,Cities c2)
						{
							return c1.getPopulation() - c2.getPopulation();
						}
						}
						)));
				System.out.println("min Population\n");
				map.forEach((k,v)->System.out.println(v.stream().min(new Comparator<Cities>()
				{	
				public int compare(Cities c1 ,Cities c2)
				{
					return c1.getPopulation() - c2.getPopulation();
				}
				}
				)));
				/*for(Cities k:temp)
				{
					
					System.out.println(k);
				}*/
				
				
						
				
			}

	}


