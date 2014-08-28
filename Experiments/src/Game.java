/* Learned how to get the answer from JOptionPane
* to run a method by using if/else statements.
*/

import javax.swing.JOptionPane;


public class Game {
	public static void main(String[] args) {
		String game = JOptionPane.showInputDialog("Type 'Start' to start a new game ");
		
		if ("Start".equals(game)) {
				System.out.println("     Up");
				System.out.println("Left    Right");
				System.out.println("    Down");
		}
		else {
			System.out.println("Game Over :( ");
		}
	}
}