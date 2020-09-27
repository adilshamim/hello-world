
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyListener extends WindowAdapter{
public void windowClosing(WindowEvent w) {
 System.exit(0);
}
}
