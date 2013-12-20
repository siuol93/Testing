import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;



public class RobotMove{

    public static void main(String []args) throws AWTException
    {
    	Robot r = new Robot();
    	r.mouseMove(40,760);
    	r.delay(500);
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);
    	r.delay(500);
    	r.keyPress(KeyEvent.VK_P);
    	r.keyRelease(KeyEvent.VK_P);
    	r.keyPress(KeyEvent.VK_L);
    	r.keyRelease(KeyEvent.VK_L);
    	r.keyPress(KeyEvent.VK_A);
    	r.keyRelease(KeyEvent.VK_A);
    	r.keyPress(KeyEvent.VK_Y);
    	r.keyRelease(KeyEvent.VK_Y);
    	r.keyPress(KeyEvent.VK_SPACE);
    	r.keyRelease(KeyEvent.VK_SPACE);
    	r.keyPress(KeyEvent.VK_L);
    	r.keyRelease(KeyEvent.VK_L);
    	r.keyPress(KeyEvent.VK_E);
    	r.keyRelease(KeyEvent.VK_E);
    	r.keyPress(KeyEvent.VK_A);
    	r.keyRelease(KeyEvent.VK_A);
    	r.keyPress(KeyEvent.VK_G);
    	r.keyRelease(KeyEvent.VK_G);
    	r.keyPress(KeyEvent.VK_U);
    	r.keyRelease(KeyEvent.VK_U);
    	r.keyPress(KeyEvent.VK_E);
    	r.keyRelease(KeyEvent.VK_E);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.delay(800);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	r.delay(7500);
    	r.mouseMove(950,650);
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);
    	r.delay(15000);
    	
    	r.mouseMove(220,360);
    	
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);
    	r.keyPress(KeyEvent.VK_N);
    	r.keyRelease(KeyEvent.VK_N);
    	r.keyPress(KeyEvent.VK_A);
    	r.keyRelease(KeyEvent.VK_A);		
    	r.keyPress(KeyEvent.VK_R);
    	r.keyRelease(KeyEvent.VK_R);
    	r.keyPress(KeyEvent.VK_U);
    	r.keyRelease(KeyEvent.VK_U);
    	r.keyPress(KeyEvent.VK_T);
    	r.keyRelease(KeyEvent.VK_T);
    	r.keyPress(KeyEvent.VK_O);
    	r.keyRelease(KeyEvent.VK_O);
    	r.keyPress(KeyEvent.VK_9);
    	r.keyRelease(KeyEvent.VK_9);
    	r.keyPress(KeyEvent.VK_3);
    	r.keyRelease(KeyEvent.VK_3);
    	r.delay(1000);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	r.delay(5000);
    	
    	/*r.mouseMove(680,25);
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);
    	r.delay(1000);
    	r.mouseMove(320,150);
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);
    	r.delay(1000);
    	r.mouseMove(750,140);
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);
    	r.delay(500);
    	r.mouseMove(1050,140);
    	r.mousePress(InputEvent.BUTTON1_MASK);
    	r.mouseRelease(InputEvent.BUTTON1_MASK);*/
    	
		System.out.println("Win!");
    	
    	
    }
    
    
}
