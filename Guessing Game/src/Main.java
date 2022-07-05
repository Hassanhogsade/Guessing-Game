import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//here im calling the function so i can use this and store it	
		int randomNum = generator();
		
//		System.out.println(randomNum);
		

		Scanner sc = new Scanner(System.in);
// created a boolean which equals false so later when i run the while loop this will stop when it's not false	
		Boolean gameOver = false;
//created a while loop that will be looping around up until the guess is correct
		while (!gameOver) {
//part of the code that will keep asking user to input a value			
			System.out.println("Enter your guess");
			int guess = sc.nextInt();
			System.out.println("------------------");
//i created a if statement that will compare guess to either if its equal, greater or less than
			if (guess == randomNum){
				System.out.println("That guess is correct");
				gameOver = true;
			} else if (guess < randomNum){
				System.out.println("the number is too low try again");
			} else {
				System.out.println("the number is too high try again");	
			}
		}
// this will print out a well done when the while loop breaks or ends
		System.out.println("well done!!");	
		
		sc.close();
		
}
//here i created a class that will generate a random number
public static int generator() {
int min = 0;
int max = 100;
  
//Generate random int value from 0 to 100 
//System.out.println("Random value in int from "+min+" to "+max+ ":");
int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//System.out.println("Random Number =" + random_int);
return random_int;
		
	}
	
}

