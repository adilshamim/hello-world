
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class FirstGame {

	public static void main(String[] args) {
		Frame f=new Frame("TiC-TaC-ToE");
		MyListener l = new MyListener();
		MyPanel p=new MyPanel();
		f.setBounds(200,200,400,400);
		f.setVisible(true);
		f.setBackground(Color.black);
		f.setLayout(null);
		f.addWindowListener(l);
		p.setLocation(20,43);
		Font f1=new Font("Arial Black",Font.BOLD,30);
		p.setFont(f1);
	    f.add(p);
	}

}
