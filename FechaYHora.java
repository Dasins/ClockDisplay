
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
    // save the minutes
    private NumberDisplay minutes;
    // save the hours
    private NumberDisplay hours;
    // save the day
    private NumberDisplay day;
    // save the month
    private NumberDisplay month;
    // save the year
    private NumberDisplay year;
    // save the date and time in a text chain
    private String displayString;

   /**
    * Constructor for objects of class FechaYHora
   */
   public FechaYHora()
    {
        minutes = new NumberDisplay(60);
        hours = new NumberDisplay(24);
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(100);
        updateDisplay();
    }

   /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = day.getDisplayValue() + "-" + 
                        month.getDisplayValue() + "-" +
                        year.getDisplayValue() + " " +
                        hours.getDisplayValue() + ":" +
                        minutes.getDisplayValue();
    }
    
    /**
     * 
     */
}
