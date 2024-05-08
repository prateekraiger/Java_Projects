import java.util.*;

public class NumberGame{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int maxatmpt=5;
		int score=0;

		System.out.println("---------------------------------------------------------------------");
		System.out.println("Welcome to the Number Guessing Game");
		System.out.println("You have 10 attempts to guess the number");
		System.out.println("---------------------------------------------------------------------");

		while (true) {
			int atmpt=0;
			int numguess=rd.nextInt(100)+1;

			while(atmpt < maxatmpt){
				System.out.println("Enter a number between [1 to 100] to guess : ");
				int guess=sc.nextInt();
				
				if(guess==numguess){
					System.out.println("NICE! You guessed it right");	
					score+=(maxatmpt - atmpt);
					break;
				}
				else if(guess < numguess){
					System.out.println("Your guess is too LOW");
				}
				else if(guess > numguess){
					System.out.println("Your guess is too HIGH");
				}
				else{System.out.println("PLEASE enter a valid number");
				}
				atmpt++;
			}
			System.out.println();
			if(atmpt == maxatmpt){
				System.out.println("SORRY! You have exhausted your attempts");
				System.out.println();
				System.out.println("The number was : "+numguess);
			}
			
			System.out.println("Your score is : "+score);

			System.out.println("Do you want to play again? [y/n]");
			String ans=sc.next();
			if(ans.equals("n") || ans.equals("N") ){
				break;
			}
		}
		System.out.println("----------Thanks for playing----------");
	}
}