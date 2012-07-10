package clock;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: priprave40
 * Date: 10.7.12
 * Time: 11:28
 * To change this template use File | Settings | File Templates.
 */

@ApplicationScoped
@Named
public class ClockController {
    private ClockModel model = new ClockModel();

    public ClockModel getModel() {
        return model;
    }

    public void increaseMinutes(){
        model.setMinutes(model.getMinutes()+1);
    }
    public void decreaseMinutes(){
        model.setMinutes(model.getMinutes()-1);
    }

    public void increaseHours(){
        model.setHours(model.getHours()+1);
    }
    public void decreaseHours(){
        model.setHours(model.getHours()-1);
    }

}
