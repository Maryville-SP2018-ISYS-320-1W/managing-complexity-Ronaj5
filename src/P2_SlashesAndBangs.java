/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	
1					
	Line 		\			!			\
	line 1 		0			22 			0
	line 2 	 	2 			18			2 
	line 3 		4 			14 			4 
	line 4 		6  			10			6 
	line 5  	8  			6 			8 
	line 6  	10  		2 			10 

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 Print 6 lines
	line 1 print 22 "!"
	line 2 print 2 "//" + 18 "!" + 2 "//"
	line 2 print 4 "//" + 14 "!" + 4 "//"
	line 2 print 6 "//" + 10 "!" + 6 "//"
	line 2 print 8 "//" + 6 "!" + 8 "//"
	line 2 print 10 "//" + 2 "!" + 10 "//"
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {

		for (int line1 = 0; line1 < 6; line1++) { // outer loop- scope:  will print the number of lines
												// scope of the loop (inside of the loop curly brackets)
			int countOfSlashes = line1 * 2;
			int countOfBangs = 22 - (line1 * 4);
			
			for (int i = 1; i <= countOfSlashes; i++) { //inner loop scope:  column 2 'slashes' 
				System.out.print("\\");
			}
			for (int i = 1; i <= countOfBangs; i++) { //inner loop scope:  column 3 'bangs'
				System.out.print("!");
			}
			for (int i = 1; i <= countOfSlashes; i++) { // inner loop scope: column 4 'slashes'
				System.out.print("/");
			}
			System.out.println();
		}
	
		
	

	}

}
