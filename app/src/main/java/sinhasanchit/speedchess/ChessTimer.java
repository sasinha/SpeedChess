package sinhasanchit.speedchess;

/**
 * Created by sanchit on 11/6/16.
 */

import java.util.Timer;
import java.util.TimerTask;

public class ChessTimer {

    public int setTime;
    Timer moveTimer = new Timer();

    TimerTask showTime = new TimerTask() {
        @Override
        public void run() {
            setTime--;
            System.out.println(setTime);
        }
    };

    public void start() {
        moveTimer.scheduleAtFixedRate(showTime,1000,setTime);

    }
}
