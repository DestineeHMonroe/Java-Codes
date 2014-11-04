/* This project makes the right side
 * of a diamond twice by using 
 * methods and loops.
 */


public class MethodLoop {
	public static void main(String[] args) {
		pattern();
		pattern();
	}
		
	public static void top() {
		for (int i=1; i<=5; i++) {
			//If i=2, then the triangle would start with 2 * and would only contain 5 rows with the last row containing 6 *.
			//i<=6 represents that 6 rows will be used total.
			//If j=2, then there would be 1 blank row and 5 rows of *.
			//j=1 represents the pattern is starting on the first line.
			//j<=i represents the total amount of rows, which is 6.
			//j is <= i because i has a value that increases. This is how we get a triangle.
			//If j was <=6 then we would have 6 stars on each row. Why?
			//(continued...) because j=1 but was then reassigned to equal 6.
			//++ means you want the value to increase by 1. In this case, it's i and j.
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	//Use different variables for bottom().
	public static void bottom() {
		for (int k=5; k>-1; k--) {
			for (int l=0; l<=k; l++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public static void pattern() {
		top();
		bottom();
		System.out.println();
	}
}