package day_35;
import java.util.Random;
import java.util.Scanner;


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




public class Roulette {

	public static void main(String[] args) {
		
		
		
		Scanner scn = new Scanner(System.in);
		
		
		//Playing balance
		int balance = 150;
		//Int value for the amount you have bet on the round
		int betamount;


		for(int i = balance; i > 0; balance-=betamount) {

			if (balance<0){
				System.out.println("You have lost all of your money :(");
				break;
			}
		
		System.out.println("balance = $" + balance);
		System.out.println("Type in a bet amount! : ");
		betamount = scn.nextInt();
		if (balance<betamount){
			System.out.println("Insufficient Funds!");
			break;
		}
		System.out.println("Balance after bet = $"+ balance);
		//System.out.println("Type in a number 0-36");
		//int bet = scn.nextInt();
		System.out.println("Bet on a color, type Red or Black");
		String betcolor = scn.next();
		
		
		
		
		

		
		
		Random rnd = new Random();
		
		int i1 = rnd.nextInt(37);
		
		RoulettePocket pocket = new RoulettePocket(i1);
		
		
		if(pocket.color.equalsIgnoreCase("red") && betcolor.equalsIgnoreCase("red")) {
			balance+=(betamount*3);
		} else if (pocket.color.equalsIgnoreCase("black") && betcolor.equalsIgnoreCase("black")){
			balance+=(betamount*3);
		} else {
			System.out.println("You lost!");
		}

		if (balance<=0){
			break;
		}

		/*if(i1==bet) {
			
			//betamount*=20;
			balance += (betamount*=20);
			
		}else if( pocket.color.equalsIgnoreCase("red") && betcolor.equalsIgnoreCase("red")) {
			
			//betamount*=2;
			balance += (betamount*=2);
		}else if( pocket.color.equalsIgnoreCase("black") && betcolor.equalsIgnoreCase("black")) {
			
			//betamount*=2;
			balance += (betamount*=2);
		
		System.out.println("balance = $" + balance);*/
		
		/*for(int i = 0; i <= 36; i++) {
			
			new RoulettePocket(i);
			
		}*/
	
		

		}
	}
	
	}

	


