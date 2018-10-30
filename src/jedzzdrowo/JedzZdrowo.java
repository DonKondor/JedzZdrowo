/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jedzzdrowo;
import java.awt.*;
/**
 *
 * @author Konrad
 */
public class JedzZdrowo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Okno gra = new Okno("Jedz Zdrowo Byczku");  
     Button start= new Button("Ognia");
     gra.add(start);
     gra.setVisible(true);
    }
    
}
