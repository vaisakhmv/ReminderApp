
package reminderapplication;

/**
 *
 * @author Vaisakh Viswanathan
 */
public class Reminder {
    private String addDate;
    private String time;
    private String message;
    public Reminder(String raddDate,String rtime, String rmessage)
    {
        this.addDate=raddDate;
        this.time=rtime;
        this.message=rmessage;
        
        
    }
    public String getAddDate()
    {
        return addDate;
    }
    public String getTime()
    {
        return time;
    }
    public String getMessage()
    {
        return message;
    }
}
