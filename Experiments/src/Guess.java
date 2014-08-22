/* Experimenting with
 * a random number generator
 * while using a JOptionPane
 * dialog box.
 */


import javax.swing.JOptionPane;
import java.util.Random;
// A pseudo-randomized number generator object. Must be imported.

public class Guess {
	public static void main(String[] args){
		
		String guess = JOptionPane.showInputDialog("Please guess a number.");
		
		System.out.println(("Your guess was ")+(guess)+("."));
		
		int guessInt = Integer.parseInt(guess);
		//Parse the user's input for integer-based addition.
		
		//Random is an object that must be imported. ModifierDice is an instance of an object.
		//next.Int is a method.
		//modifierInt is a variable whose type is integer.
		
		Random modifierDice = new Random();
		//Creates a "new" instance of the Random object and assigns it to a variable.
		
		//.nextInt() is a method called on the Random object that produces a # between 0 and (#).
		int modifierInt = ((modifierDice.nextInt(88))+1);
		
		JOptionPane.showMessageDialog(null, (("Nope! The answer is ")+(guessInt + modifierInt)+(".")));
		
		System.out.println(("Nope! The answer is ")+(guessInt + modifierInt)+("."));
		
		//closes so that we're not stuck in it.
		System.exit(0);
	}
}
