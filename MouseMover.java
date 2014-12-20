
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MouseMover extends Thread {

    private Robot robot;
    public boolean going;

    public MouseMover() {
        try {
            this.robot = new Robot();
        } catch (Exception e) {
            System.out.println("Robot died.");
        }
    }

    public void run() {
        /* int x = 0, y = 384, max = 1280, delay = 20;

        while (true) {
        while (x <= max) {
        robot.delay(delay);
        robot.mouseMove(x, y);
        x += 80;
        }

        x -= 80;

        while (x >= 0) {
        robot.delay(delay);
        robot.mouseMove(x, y);
        x -= 80;
        }
        } */

        int x = 270, y = 400;
        robot.mouseMove(x, y);

        going = true;

        while (going) {


            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MouseMover.class.getName()).log(Level.SEVERE, null, ex);
            }

            //count++;

        }

        //this.stop();
    }
}
