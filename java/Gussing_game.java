// Name: Samarth Kumar
// Github Username: Samarthku
// Date: 03/oct/2023
// Project Name: 

//  Overview
//Step 1: Create three variables attempt, userGuessNumber, secretNumber and initialize them.
//Step 2: Generate a random number and assigned to secretNumber.
//Step 3: Start a loop and take user input.
//tep 4: Validate user input and match with the secretNumber.
//Step 5: If userGuessNumber is greater than or less than the secretNumber then print a message to user.
//Step 6: If userGuessNumber is equal to the secretNumber, then user wins and exit the game.
//Step 7: If number of attempts exceeds the limit, exit the game.
//Step 8:Repeat from Step 3.

// Code Start
package org.arpit.java2blog;
import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);           
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
        userInput.close();
    }
}
// Code End

// Input
// 32,01,09

// Output
// Welcome to Guess Number Game
// You Will Be Asked To Guess A Number To Win The Game
// You have Maximum 5 Attemp Limit
// Enter a guess number between 1 to 100
// 75
// Your Guess Number is Greater.
// Enter a guess number between 1 to 100
// 45
// Your Guess Number is Smaller.
// Enter a guess number between 1 to 100
// 58
// Your Guess Number is Smaller.
// Enter a guess number between 1 to 100
// 67
// Your Guess Number is Greater.
// Enter a guess number between 1 to 100
//62
// OOhhOO!, Your Number is Correct. You Win the Game!
// 
