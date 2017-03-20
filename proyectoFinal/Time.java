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

public class Time
{
    private static Calendar now = Calendar.getInstance();
    private static int hours, minutes, seconds;
    
    public static String getTime()
    {
        hours = now.get(Calendar.HOUR_OF_DAY);
        minutes = now.get(Calendar.MINUTE);
        seconds = now.get(Calendar.SECOND);
        
        return "Hora: \t" + hours + "/" + minutes + "/" + seconds + "\n";
    }
}
