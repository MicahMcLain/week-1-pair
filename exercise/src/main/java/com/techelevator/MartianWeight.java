package com.techelevator;

import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter a series of Earth weights separated by spaces:");
		String userInput = scanner.nextLine();
		String[] earthArray = userInput.split(" ");
		//double marsWeight = 0;
		for (int i = 0; i < earthArray.length; i++) {
			int earthWeight = Integer.parseInt(earthArray[i]);
			int marsWeight = (int)(earthWeight * 0.378);
			if(earthWeight < 0) {
				System.out.println("Weight cannot be less than 0.");
				//break;
			}
			if(earthWeight >= 0) {
				System.out.println(earthWeight + "lbs. on Earth is " + marsWeight + "lbs. on Mars.");
			}

		}
	}

}
