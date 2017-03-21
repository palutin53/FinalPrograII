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
    public static StringBuilder sb = new StringBuilder();
    
    public static void show(String s){
        JOptionPane.showMessageDialog(null,s);
    }
    
    public static String input(String s){
        return JOptionPane.showInputDialog(null,s);
    }
    
    public static int inputInt(String s)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(null, s));
    }
    
    public static double inputDouble(String s)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(null, s));
    }
    
     public static int menuCajeros()
    {
        sb.append(">>>>>Menú Opciones<<<<<\n");
        sb.append(" 1.- Venta\n");
        sb.append(" 2.- Devolución\n");
        sb.append(" 3.- Salir\n");
        return Integer.parseInt(JOptionPane.showInputDialog(null, sb.toString() + "\n\nSeleccione su opción: "));
    }
        
    public int menuAdmin(int opcion)
    {
        sb.append(">>>>>Menú Opciones<<<<<\n");
        sb.append(" 1.- Venta\n");
        sb.append(" 2.- Devolución\n");
        sb.append(" 3.- Administración\n");
        sb.append(" 4.- Salir\n");
        return Integer.parseInt(JOptionPane.showInputDialog(null, sb.toString() + "\n\nSeleccione su opción: "));
    }
    
    public int subMenuAdmin(int opcion)
    {
        sb.append(">>>>>Menú Opciones<<<<<\n");
        sb.append(" 1.- Registrar Cajeros\n");
        sb.append(" 2.- Eliminar Cajeros\n");
        sb.append(" 3.- Ingresar Productos\n");
        sb.append(" 4.- Atrás\n");
        return Integer.parseInt(JOptionPane.showInputDialog(null, sb.toString() + "\n\nSeleccione su opción: "));
    }
    
    public static void clearOptions()
    {
        sb.setLength(0);
    }
}
