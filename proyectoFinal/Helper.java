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
    
    public static int inputInt(int i)
    {
        i = Integer.parseInt(JOptionPane.showInputDialog(null, i));
        return i;
    }
    
    public double inputDouble(double d)
    {
        d = Double.parseDouble(JOptionPane.showInputDialog(null, d));
        return d;
    }
    
    public int menuCajeros(int opcion)
    {
        opcion = Integer.parseInt(input("Ingrese la gestión.\n\n 1.- Venta\n 2.- Devolución\n 3.- Salir: \n\n"));
        return opcion;
    }
    
    public int menuAdmin(int opcion)
    {
        opcion = Integer.parseInt(input("Ingrese la gestión.\n\n 1.- Venta\n 2.- Devolución\n 3.- Administración \n 4.- Salir \n\n"));
        return opcion;
    }
    
    public int subMenuAdmin(int opcion)
    {
        opcion = Integer.parseInt(input("Ingrese la gestión.\n\n 1.- Registrar Cajero\n 2.- Eliminar Cajeros\n 3.- Ingresar Productos\n4.- Atrás \n\n"));
        return opcion;
    }
}
