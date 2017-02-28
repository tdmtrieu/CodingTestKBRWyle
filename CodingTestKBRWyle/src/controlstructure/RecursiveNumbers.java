/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package controlstructure;

public class RecursiveNumbers {

	protected final static int MAX_NUMBER = 5; //the number of rows the program will print
	protected static int STARTING_NUMBER = 1; //the number that is currently being printed out
	protected static int printCount = 1; // the amount of times left that STARTING_NUMBER needs to be printed on that row

	public static void main(String[] args) {
		printNumbers(MAX_NUMBER);
	}

	private static void printNumbers(int num) {
		if(MAX_NUMBER < STARTING_NUMBER) {
			return;
		}

		if(num == STARTING_NUMBER) {
			if(printCount > 1) {
				System.out.print(STARTING_NUMBER);
				printCount--;
				printNumbers(STARTING_NUMBER);
			} else {
				System.out.print(STARTING_NUMBER);
				STARTING_NUMBER++;
				printCount = STARTING_NUMBER;
				System.out.println();
				printNumbers(MAX_NUMBER);
			}
		}
		else {
			System.out.print(".");
			printNumbers(num - 1);
		}
	}
}

/*
 * How would you rewrite this for the nth number instead of ending at 5?
 * 
 * If you look at the program code, the number of rows the program will print depends on the value of MAX_NUMBER
 * If you want the program to print up to the nth number, change the value of MAX_NUMBER to n
 */
