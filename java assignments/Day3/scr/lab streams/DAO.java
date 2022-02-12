package javaLabStrams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface DAO<T> {
	//getAll
	 ArrayList <T>  getAll(String dataFilePath) throws IOException;  

	

}
