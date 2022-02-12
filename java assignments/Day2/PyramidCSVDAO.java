package DAO_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PyramidCSVDAO {
    
    private Pyramid pyramid;
    private List<Pyramid> Pyramids;
    public PyramidCSVDAO() {
      this.Pyramids= new ArrayList<Pyramid>();   
    }
    public List<Pyramid> readPyramidsFromCsv(String file_path)
    {   
        try {
            
            Scanner sc = new Scanner(new File(file_path)); 
             
            String line=sc.nextLine(); // Gets the first row which contains the headers of the fields.
            
            while (sc.hasNext())  
            {  
            line=sc.nextLine();    
            this.Pyramids.add(this.createPyramid(line.split(",")));
            }   
            sc.close(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        return Pyramids;
    }
    
    public Pyramid createPyramid(String [] data)
    {
     double height=Double.parseDouble(data[7].equals("") ? "-1" : data[7]);  // Replaces missing heights with the value -1, otherwise keeps it as it is.
     String modern_name=data[2];
     String pharaoh = data[0].endsWith(" (?)") ? data[0].replace(" (?)",""):data[0];  //Removes the question mark symbol if it exists at the end of a name.
     String site=data[4];
      
     this.pyramid=new Pyramid(pharaoh, modern_name, site, height);
     return pyramid;
    }
    
}
