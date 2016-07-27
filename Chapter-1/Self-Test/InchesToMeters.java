/*
	Self Assesment: Adapt GalToLitTable.java so that it prints a conversion table of inches to meters.
	Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches
	(One meter equals approximately 39.37 inces)
	
*/

class InchesToMeters {
	public static void main (String args[]) {
		double inches, meters;
		int counter;
		
		counter = 0; // Line counter is initially set to zero
		for(inches = 1; inches <= 100; inches++) {
			meters = inches / 39.37;
			System.out.println(inches + " inches is " +
								meters + " meters.");
			counter++;
			// every 10th line, print a blank line
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
