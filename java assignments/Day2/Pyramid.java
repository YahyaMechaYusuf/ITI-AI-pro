package Assig_Java;

public class Pyramid {
       
    double height;
    String modern_name;
    String pharaoh;
    String site;
    
    public Pyramid(String pharaoh, String modern_name, String site, double height) 
    {      
        this.height = height;
        this.modern_name = modern_name;
        this.pharaoh = pharaoh;
        this.site = site;  
    }


    
    public double getHeight()
    {
        return height;
    }
      
    public void setHeight(double height)
    {
        this.height = height;
    }
      
    public String getModernName()
    {
        return modern_name;
    }
      
    public void setModernName(String modern_name)
    {
        this.modern_name = modern_name;
    }
    
    public String getSite()
    {
        return site;
    }
    
    public void setSite(String site)
    {
        this.site = site;
    }
    
    public String getPharaoh()
    {
        return pharaoh;
    }
    
    public void setPharaoh(String pharaoh)
    {
        this.pharaoh = pharaoh;
    }
    
    @Override
    public String toString()
    {
        if (height == -1)
        {
            return "Pyramid's Modern Name: "+ modern_name+ "\nPyramid's Pharaoh: " + pharaoh +"\nPyramid's Height: " + "Unknown"+"\nPyramid's Site: " + site +"\n\n";
        
        }
        else
        {
            return "Pyramid's Modern Name: "+ modern_name+ "\nPyramid's Pharaoh: " + pharaoh +"\nPyramid's Height: " + height +"\nPyramid's Site: " + site +"\n\n";
        }
    }
}