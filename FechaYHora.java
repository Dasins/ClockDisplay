
/**
 * This class has simulate
 * a calendar that display the date and time.
 * 
 * It allows to advance the time or set a date by user input.
 *
 * @author (Daniel Carmenes)
 * @version (10/11/2017)
 */
public class FechaYHora
{
    //save the clock
    private ClockDisplay clock;
    // save calendar
    private CalendarioBasico calendar;
    // save the date and time in a text chain
    private String displayString;

   /**
    * Constructor for objects of class FechaYHora
    */
   public FechaYHora()
    {
        calendar = new CalendarioBasico();
        clock =  new ClockDisplay();
        updateDisplay();
    }

   /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString =  calendar.obtenerFecha() + " " + clock.getTime();
    }
    
   /**
    * Return the current time of this display in the format HH:MM.
    */
   public String getFechaYHora()
    {
        return displayString;
    }
    
   /**
    * 
    */ 
   public void avanzar()
   {
       clock.timeTick();
       if (clock.hours.getValue() == 0)
       {
           calendar.avanzarFecha();
       }
   }
}