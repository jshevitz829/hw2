package hw2;
import java.awt.*;
import javax.swing.JApplet;


		public class HW2_19 extends JApplet {

			//
			// draws snowman
			//
			
		public void paint (Graphics page)
		{
			final int MID = 150; // middle of head
			final int TOP = 50; // top of head
			
			setBackground(Color.blue); // background color
			page.setColor(Color.blue);//sky color
			page.fillRect(0, 0, 300, 200);
			
			page.setColor(Color.green);
			page.fillRect(0, 175, 300, 50); // ground
			
			page.setColor(Color.yellow);
			page.fillOval(-40, -40, 80, 80); // sun
			
			page.setColor(Color.gray);//smoke1
			page.fillOval(137, 7, 25, 15);
            
			page.setColor(Color.green);		
			page.fillRect(MID-15, TOP-35, 30, 50); // chimney

		page.setColor(Color.orange);
			page.fillPolygon(new int[] {10, 200, 100}, new int[] {100, 100, 0},3); //roof
		    

		page.setColor(Color.gray);
			page.fillRect(10, 100, 190, 75);//base of house


			page.setColor(Color.red);
		page.fillRect(45, 110, 35, 35);//window left
		page.fillRect(145, 110, 35, 35);//window right
		page.fillRect(90, 125, 30, 50 );//door
		
		page.setColor(Color.black);
		page.fillOval(110, 150, 8, 8);
		
		page.setColor(Color.gray);
		page.fillOval(145, 0, 25, 15);//smoke2
		page.fillOval(160, 0, 20, 10);//smoke3
		
		page.setColor(Color.white);
		page.fillOval(200, 15, 40, 40);
		page.fillOval(190, 20, 30, 40);
		page.fillOval(220, 20, 30, 40);
		}
		

	
	
	
	
	
	
	
	
	
	}


