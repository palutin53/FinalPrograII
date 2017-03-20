package proyectoFinal;

/**
 * Proyecto Final Programación II
 * 
 * @author Axel David Colop Swaanncheneger - 160402008
 * @author Billy Stuart Alessandro Samayoa Higueros - 160404006
 * @author Abraham Isaac Ordoñez Martinez- 160402002
 * @author Pablo Andrés Lutín Gomez - 160402009
 * @version 1.0.0
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Helper{
    public static DecimalFormat df = new DecimalFormat("#,##0.00"); 
    
    public static void show(String s){
        JOptionPane.showMessageDialog(null,s);
    }
    
    public static String input(String s){
        return JOptionPane.showInputDialog(null,s);
    }
}
