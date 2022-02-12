package Assig_Java;

import java.util.List;

/**
 *
 * @author yahya
 */
public class Main {

    public static void main(String[] args) {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCsv("H:\handasa\iti\java\Session03_Assignments\\pyramids.csv");
        
        int i = 0;
        for (Pyramid p: pyramids)
        {
            System.out.println("#"+(i++)+ " " + p);
        }
    }
    
}