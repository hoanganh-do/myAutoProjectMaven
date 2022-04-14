package UserInteractions;

import com.initialization.Init;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass extends Init {

    @Test
    public void InputDataSearch() throws AWTException, InterruptedException {
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_S); // gọi đến bàn phím, nhận diện cả tiếng anh tiếng việt nếu sử dụng unikey
        robot.keyPress(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(2000);

    }
}
