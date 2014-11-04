/*In this project, I made overlapping ovals 
 *and circle shapes the are outlined
 * and colored in. I would like to 
 * come back to this project to 
 * give the JPanel a background Color.
 */


import javax.swing.JPanel;
//import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

//The name javax indicates a Java extension package, 
//not a core package.
// AWT means Abstract Window Toolkit

public class Shape extends JFrame{
	
	JPanel jp= new JPanel();

	public Shape(){
		
		setTitle("Shape");
		//setTitle is the title of the pop up JFrame.
		setSize(400,400);
		setVisible(true);
		//If you want to see the shape the setVisible must be set to true.
		//EXIT_ON_CLOSE is to stop the program when you click the x button.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Background Color Code
		//jp.setBackground(Color.YELLOW);
		//add(jp,BorderLayout.CENTER);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		//g.drawOval(x, y, width, height);
		//An oval can be considered a circle but not vice versa.
		//This is why it's not drawCircle
		//drawOval is only an outline of an oval.
		//fillOval is a colored in oval.
		g.drawOval( 100, 100, 200, 200);
		g.setColor(Color.BLACK);
		g.fillOval(100 , 150, 200, 100);
		g.setColor(Color.MAGENTA);
		g.fillOval(150, 100, 100, 200);
		
	}
	
	public static void main(String[] args){
		Shape t= new Shape();
		t.paint(null);
	}
}
