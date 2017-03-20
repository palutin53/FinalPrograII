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

import java.util.Calendar;

public class Date
{
    private static Calendar now = Calendar.getInstance();
    private static int day, month, year;
    
    public static String getDate()
    {
        day = now.get(Calendar.DAY_OF_MONTH);
        month = now.get(Calendar.MONTH);
        month +=1;
        year = now.get(Calendar.YEAR);
        return "Fecha: \t" + day + "/" + month + "/" + year + "\n";
    }
}
