package clock;

/**
 * Created with IntelliJ IDEA.
 * User: priprave40
 * Date: 10.7.12
 * Time: 11:26
 * To change this template use File | Settings | File Templates.
 */
public class ClockModel {
    public int hours;
    public int minutes;

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int i) {
        minutes=i;
    }

    public void setHours(int j) {
        minutes=j;
    }
}
