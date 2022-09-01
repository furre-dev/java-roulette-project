package day_35;

/*On a roulette wheel, the pockets are numbered from 0 to 36. The colors of the pockets
 * are as follows.
 * 
 * Pocket 0 is green,
 * Pocket 1-10 = odd-number is red, even is black
 * Pocket 11-18 = odd is black, even is red
 * Pocket 19-28 = odd is red, even is black
 * Pocket 29-36 = odd is black, even is red
 * 
 * Write a class named RoulettePocket. The class's constructor should accept a pocket number.
 * The class should have a method called getPocketColor that returns the pockets color as a string.
 * 
 * 
 */

public class RoulettePocket {
	
	private int pocket;
	public String color;
	
	public RoulettePocket(int pocket) {
		
		setPocket(pocket);
		
		getPocketColor(pocket);
		
		System.out.println(toString());

		
	}
	
	public String getPocketColor(int pocket) {
		
		if(pocket == 0) {
			color = "Green";
		}
		
		if( (pocket>=1 && pocket<=10) || (pocket>=19 && pocket<=28) ) {
			if(pocket % 2 != 0) {
				color = "Red";
			}else {
				color = "Black";
			}
		}
		
		if( (pocket>=11 && pocket<=18) || (pocket>=29 && pocket<=36) ) {
			if(pocket % 2 == 0) {
				color = "Red";
			}else {
				color = "Black";
			}
		}
			
			return color;
		}
		
		
		
	
	
	
	public int setPocket(int pocket) {
		if(pocket>=0 && pocket<=36) {
			this.pocket = pocket;
			
			
			}else {
				System.out.println("Enter valid number!");
			}
		return pocket;
	}
	
	public int getPocket() {
		return pocket;
	}
	
	public String toString() {
		return "Round is played! Number=" + pocket + ", Color=" + color + "!";
	}
	
	
	
	
	
	
	
	
}
