/* I have learned how to use JOptionPane 
 * InputDialog and MessageDialog. I also
 * learned that I can use if statements 
 * without having an else statement.
 */

import javax.swing.JOptionPane;

public class OrderofOperation {
	public static void main(String[] args) {
	
	String pemdas = JOptionPane.showInputDialog("To find out what 13 * 2 + 239 / 10 % 5 - 2 * 2 equals with only integer answers..." +
			"First type what 13*2 equals:");
			if ("26".equals(pemdas)) {
				first();
		}
	}
			
	public static void first() {	
		String one = JOptionPane.showInputDialog("Correct! Now...What is 2*2?");
			if ("4".equals(one)) {
				integer();
				second();
				}
}
	
	public static void integer(){
		JOptionPane.showMessageDialog(null,"Integers are whole numbers. Do not round up.");
		}
	
	public static void second(){
		String second = JOptionPane.showInputDialog("Correct again! Now...What is 239/10 ? (only integers) ");
			if ("23".equals(second)) {
				next();
				third();
			}

	}
	
	public static void next(){
		JOptionPane.showMessageDialog(null,"Affirmative! Now, in Java, we learn that 'mod' comes after multipication and division, but before addition and subtraction.");
		JOptionPane.showMessageDialog(null,"Mod is the remainder that is left from using division. For example: 19 mod 5 is 4.");	
		}
	
	
	public static void third(){
		String third = JOptionPane.showInputDialog("So, 23 mod 5 is: ");
			if ("3".equals(third)) {
				fourth();
			}
	}
	
	public static void fourth(){
		String fourth = JOptionPane.showInputDialog("We are left with 26+3-4. What is the final answer?");
			if ("25".equals(fourth)) {
				congrats();
			}
	}
	
	public static void congrats(){
		JOptionPane.showMessageDialog(null,"Congratulations! ^_^ You are correct!");
		}
	
}