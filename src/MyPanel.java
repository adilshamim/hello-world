
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends Panel implements ActionListener{
 private Button[] b;
 private int c=0,count=0,win=0;
	MyPanel(){
        	setSize(360,339);
        	b=new Button[9];
        	for(int i=0;i<9;i++) {
        	b[i]=new Button();
        	b[i].setBackground(new Color(209,209,209));
        	}
        	setLayout(new GridLayout(3,3));
        	for(int i=0;i<9;i++) {
            	add(b[i]);
            	b[i].addActionListener(this);
            	}
      }
	public void actionPerformed(ActionEvent e) {
        Button b1=(Button)e.getSource();
        if(win==1) {
    		b1.removeActionListener(this);
    	}
        else
        {
        if(c==0)
        {
        	b1.setLabel("X");
        	c++;
        	count++;

        }
        else
        {
        	b1.setForeground(Color.red);
        	b1.setLabel("0");
        	c=0;
        	count++;
        }
        b1.removeActionListener(this);
        
        if(count>4) {
        	if(b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X"
        	||
        	b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X"
			||
			b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X"
			||
			b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X"
			||
			b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X"
            ||
			b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X"
			||
			b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X"
			||
			b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
			{
        		System.out.println("player 1 is winner");
        		win=1;
                
			}
        	else {
        		if(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0"
                	||
                	b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0"
        			||
        			b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0"
        			||
        			b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0"
        			||
        			b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0"
                    ||
        			b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0"
        			||
        			b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0"
        			||
        			b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0")
        			{
        		     System.out.println("player 2 is winner");
        		     win=1;
        			}
        	}
        }
}
}
}